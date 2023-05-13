package com.test.demo.infrastructure.repository.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="PRICES", schema="PUBLIC")
@NamedQuery(name="Prices.findAll", query="SELECT i FROM Prices i")
public class Prices implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(name="BRAND_ID")
    private Integer brandID;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="START_DATE")
    private Timestamp startDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_DATE")
    private Timestamp endDate;

    @Column(name="PRICE_LIST")
    private Integer priceList;
    
    @Column(name="PRODUCT_ID")
    private Integer productID;
    
    @Column(name="PRICE")
    private BigDecimal price;
    
    @Column(name="CURR")
    private String currency;
    
    @Column(name="PRIORITY")
    private Integer priority;
    
}
