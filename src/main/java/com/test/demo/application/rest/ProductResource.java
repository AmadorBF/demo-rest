package com.test.demo.application.rest;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.application.contract.ProductApi;
import com.test.demo.application.mappers.ProductDTOMapper;
import com.test.demo.application.response.ProductResponse;
import com.test.demo.domain.service.ProductServices;
import com.test.demo.infrastructure.repository.model.Prices;

@RestController
@RequestMapping("/api/v1/products")
public class ProductResource implements ProductApi {
	
	@Autowired
	ProductServices productServices;

	@Override
	@GetMapping(value = "/price")
	public ResponseEntity<ProductResponse> getPrices(@RequestParam Integer brandId, @RequestParam Integer productId, 
			@RequestParam Timestamp fechaAplicacion) {
		
		var productResponse = new ProductResponse();
		List<Prices> productList = productServices.getPrecio(productId, fechaAplicacion, brandId);
		//mapper
		ProductDTOMapper mapper = new ProductDTOMapper();
		switch (productList.size()) {
		case 0:
			return ResponseEntity.notFound().build();
		case 1:
			productResponse = mapper.from(productList.get(0));
			return ResponseEntity.ok(productResponse);
		default:
			if (productList.get(0).getPriority() == productList.get(1).getPriority()) {
				return ResponseEntity.badRequest().build(); //lo mas adecuado, definir cada error	
			} else {
				productResponse = mapper.from(productList.get(0));
				return ResponseEntity.ok(productResponse);				
			}
			
		}
	}
	
}
