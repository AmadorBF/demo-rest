package com.test.demo.application.contract;

import java.sql.Timestamp;

import org.springframework.http.ResponseEntity;
import com.test.demo.application.response.ProductResponse;

public interface ProductApi {
	
	ResponseEntity<ProductResponse> getPrices(Integer brandId, Integer productId, Timestamp fechaAplicacion);

}
