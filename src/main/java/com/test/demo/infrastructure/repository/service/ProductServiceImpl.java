package com.test.demo.infrastructure.repository.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.domain.repository.ProductRepository;
import com.test.demo.domain.service.ProductServices;
import com.test.demo.infrastructure.repository.model.Prices;

@Service
public class ProductServiceImpl implements ProductServices{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Prices> getPrecio(Integer productId, Date fechaAplicacion, Integer brandId) {
		
		List<Prices> productList = (List<Prices>) productRepository.findByBrandIDAndProductIDAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(brandId, productId, fechaAplicacion, fechaAplicacion);
		
		return productList;
	}

}
