package grails.rest.sample


import grails.rest.*
import grails.converters.*

class PriceController extends RestfulController {
    static responseFormats = ['json', 'xml']
    PriceController() {
        super(example.Price)
    }

    def list() {
		println 'params:'+params
		select() as JSON
    }

	private def select() {
		example.Price.createCriteria().list() {
			if (par.brandId) {
				eq('brandId', par.filter.brandId.toLong())
			}
			if (par.filter.bigDecimal1.begin && par.filter.bigDecimal1.end) {
				between('bigDecimal1', par.filter.bigDecimal1.begin.toBigDecimal(), par.filter.bigDecimal1.end.toBigDecimal())
			}
			switch (par.sort) {
				case 'id' : order('id', par.order); break
				case 'brandId' : order('brandId', par.order); break
				case 'long2' : order('long2', par.order); break
				case 'long3' : order('long3', par.order); break
				case 'bigDecimal1' : order('bigDecimal1', par.order); break
				case 'bigDecimal2' : order('bigDecimal2', par.order); break
				case 'bigDecimal3' : order('bigDecimal3', par.order); break
				case 'bigDecimal4' : order('bigDecimal4', par.order); break
			}
		}
	}
}
