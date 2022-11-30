package com.test.demo.application.mappers;

import com.test.demo.application.response.ProductResponse;
import com.test.demo.infrastructure.repository.model.Prices;

//debería ser un mapper...
public class ProductDTOMapper {

	public ProductResponse from(Prices product) {			
		
		ProductResponse productResponse = new ProductResponse();
		productResponse.setProductID(product.getProductID());
		productResponse.setBrandID(product.getBrandID());
		productResponse.setPriceList(product.getPriceList());
		productResponse.setStartDate( product.getStartDate().toString());
		productResponse.setEndDate(product.getEndDate().toString());
		productResponse.setPrice(product.getPrice());
		
		return productResponse;
	}
}
