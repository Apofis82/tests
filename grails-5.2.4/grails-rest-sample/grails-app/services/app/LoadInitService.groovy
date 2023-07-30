package app

/**
 * 
 * PRICES
 * -------
 *  
 * BRAND_ID         START_DATE             END_DATE  PRICE_LIST     PRODUCT_ID  PRIORITY  PRICE           CURR
 * ------------------------------------------------------------------------------------------------------------------
 * ['brandId':'1','startDate':'2020-06-14-00.00.00','endDate':'2020-12-31-23.59.59','priceList':'1','productId':'35455','priority':'0','price':'35.50','curr':'EUR']
 * ['brandId':'1','startDate':'2020-06-14-15.00.00','endDate':'2020-06-14-18.30.00','priceList':'2','productId':'35455','priority':'1','price':'25.45','curr':'EUR']
 * ['brandId':'1','startDate':'2020-06-15-00.00.00','endDate':'2020-06-15-11.00.00','priceList':'3','productId':'35455','priority':'1','price':'30.50','curr':'EUR']
 * ['brandId':'1','startDate':'2020-06-15-16.00.00','endDate':'2020-12-31-23.59.59','priceList':'4','productId':'35455','priority':'1','price':'38.95','curr':'EUR']
 */
class LoadInitService {

	def datas = [
		['brandId':'1','startDate':'2020-06-14-00.00.00','endDate':'2020-12-31-23.59.59','priceList':'1','productId':'35455','priority':'0','price':'35.50','curr':'EUR'],
		['brandId':'1','startDate':'2020-06-14-15.00.00','endDate':'2020-06-14-18.30.00','priceList':'2','productId':'35455','priority':'1','price':'25.45','curr':'EUR'],
		['brandId':'1','startDate':'2020-06-15-00.00.00','endDate':'2020-06-15-11.00.00','priceList':'3','productId':'35455','priority':'1','price':'30.50','curr':'EUR'],
		['brandId':'1','startDate':'2020-06-15-16.00.00','endDate':'2020-12-31-23.59.59','priceList':'4','productId':'35455','priority':'1','price':'38.95','curr':'EUR']
	]

	def start() {
		datas.each { println 'it:'+it;new example.Price(it).save() }
		//datas.each { println 'it:'+it;new example.Price(it).save(flush: true) }
 	}

}