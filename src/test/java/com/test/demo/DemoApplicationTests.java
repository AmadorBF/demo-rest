package com.test.demo;


import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.MimeTypeUtils;


import lombok.extern.slf4j.Slf4j;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
class DemoApplicationTests {
 
	  
	  @Autowired
	  MockMvc mockMvc;
	 
	  @Test
	  public void contextLoads() {
	  }
	  
	  @Test
	  public void test1_givenProduct_date14_10_whenGetPrices_thenStatus200() throws Exception {
		  var findById = mockMvc.perform(get("/api/v1/products/price")
		      		.param("brandId", "1")
		      		.param("productId", "35455")
		      		.param("fechaAplicacion","2020-06-14 00:00:00")
		      		.accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
		          .andExpect(status().isOk())
		          .andExpect(jsonPath("$.price", is(35.50)))		          
		          .andReturn();
		  log.info(findById.getResponse().getContentAsString());
	  }
	  
	  @Test
	  public void test2_givenProduct_date14_16_whenGetPrices_thenStatus200() throws Exception {
		  var findById = mockMvc.perform(get("/api/v1/products/price")
		      		.param("brandId", "1")
		      		.param("productId", "35455")
		      		.param("fechaAplicacion","2020-06-14 16:00:00")
		      		.accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
		          .andExpect(status().isOk())
		          .andExpect(jsonPath("$.price", is(25.45)))		          
		          .andReturn();
		  log.info(findById.getResponse().getContentAsString());
	  }
	  
	  @Test
	  public void test3_givenProduct_date14_21_whenGetPrices_thenStatus200() throws Exception {
		  var findById = mockMvc.perform(get("/api/v1/products/price")
		      		.param("brandId", "1")
		      		.param("productId", "35455")
		      		.param("fechaAplicacion","2020-06-14 21:00:00")
		      		.accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
		          .andExpect(status().isOk())
		          .andExpect(jsonPath("$.price", is(35.50)))		          
		          .andReturn();
		  log.info(findById.getResponse().getContentAsString());
	  }  
	  
	  @Test
	  public void test4_givenProduct_date15_10_whenGetPrices_thenStatus200() throws Exception {
		  var findById = mockMvc.perform(get("/api/v1/products/price")
		      		.param("brandId", "1")
		      		.param("productId", "35455")
		      		.param("fechaAplicacion","2020-06-15 10:00:00")
		      		.accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
		          .andExpect(status().isOk())
		          .andExpect(jsonPath("$.price", is(30.50)))		          
		          .andReturn();
		  log.info(findById.getResponse().getContentAsString());
	  }  
	  
	  @Test
	  public void test5_givenProduct_date16_21_whenGetPrices_thenStatus200() throws Exception {
		  var findById = mockMvc.perform(get("/api/v1/products/price")
		      		.param("brandId", "1")
		      		.param("productId", "35455")
		      		.param("fechaAplicacion","2020-06-16 21:00:00")
		      		.accept(MimeTypeUtils.APPLICATION_JSON_VALUE))
		          .andExpect(status().isOk())
		          .andExpect(jsonPath("$.price", is(38.95)))		          
		          .andReturn();
		  log.info(findById.getResponse().getContentAsString());
	  }  
}