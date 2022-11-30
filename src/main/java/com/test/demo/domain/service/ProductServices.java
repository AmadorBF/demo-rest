package com.test.demo.domain.service;

import java.util.Date;
import java.util.List;

import com.test.demo.infrastructure.repository.model.Prices;

public interface ProductServices {
	
	List<Prices> getPrecio(Integer productId, Date fechaAplicacion, Integer brandId); 

}
