package com.test.demo.application.response;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
	
	//incluir personalización json por campo...
	private Integer productID;
	private Integer brandID;
	private Integer priceList;
	private String startDate;
	private String endDate;
	private BigDecimal price;

}
