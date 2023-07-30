package example

/**
 * Entity Price
 *
 * El precio final (pvp) y la tarifa que aplica a un producto de una cadena entre unas fechas determinadas.
 *
 * BRAND_ID: foreign key de la cadena del grupo (1 = ZARA).
 * START_DATE , END_DATE: rango de fechas en el que aplica el precio tarifa indicado.
 * PRICE_LIST: Identificador de la tarifa de precios aplicable.
 * PRODUCT_ID: Identificador código de producto.
 * PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se aplica la de mayor prioridad (mayor valor numérico).
 * PRICE: precio final de venta.
 * CURR: iso de la moneda.
 * 
 * PRICES
 * -------
 *  
 * BRAND_ID         START_DATE             END_DATE  PRICE_LIST     PRODUCT_ID  PRIORITY  PRICE           CURR
 * ------------------------------------------------------------------------------------------------------------------
 * 1         2020-06-14-00.00.00 2020-12-31-23.59.59  1          35455                0         35.50            EUR
 * 1         2020-06-14-15.00.00 2020-06-14-18.30.00  2          35455                1         25.45            EUR
 * 1         2020-06-15-00.00.00 2020-06-15-11.00.00  3          35455                1         30.50            EUR
 * 1         2020-06-15-16.00.00 2020-12-31-23.59.59  4          35455                1         38.95            EUR
 */
class Price {

	// Attributes
	Long		brandId
	Date		startDate
	Date		endDate
	Long		priceList
	Long		productId
	Long		priority
	BigDecimal	price
	String		curr

    static constraints = {
		brandId		()
		startDate	(attributes: [ precision: 'minute' ])
		endDate		(attributes: [ precision: 'minute' ])
		priceList	()
		productId	()
		priority	()
		price		(scale: 2)
		curr		()
    }

}
