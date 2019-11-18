package com.surittec.suritteccrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.surittec.suritteccrud.models.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Customer findById(long id);
	
	
}
