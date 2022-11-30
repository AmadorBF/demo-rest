package com.test.demo.domain.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.demo.infrastructure.repository.model.Prices;

@Repository
public interface ProductRepository extends JpaRepository<Prices, Long> {
	
	Collection<Prices> findByBrandIDAndProductIDAndStartDateLessThanEqualAndEndDateGreaterThanEqualOrderByPriorityDesc(Integer brandID, Integer ProductoID, Date fechaAplicacionStart, Date fechaAplicacionEnd);	
	
	@Query(value = "select brand_ID, start_Date, end_Date, price_List, product_ID, price, curr from prices where brand_id = ?1 and produc_id=?2 and start_date >= ?3 and end_date <= ?3 order by priority",
			nativeQuery=true)
	Collection<Prices> findPrice(Integer brandID, Integer ProductoID, Date fechaAplicacion);
	

}
