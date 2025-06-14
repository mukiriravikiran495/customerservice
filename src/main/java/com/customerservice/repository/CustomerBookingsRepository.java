package com.customerservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customerservice.entity.MyBookings;



@Repository
public interface CustomerBookingsRepository extends JpaRepository<MyBookings, Long>{
	List<MyBookings> findByCustomerDetails_CustId(Long custId);
	
	
}
