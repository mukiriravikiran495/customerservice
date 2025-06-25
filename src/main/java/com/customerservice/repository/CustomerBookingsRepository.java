package com.customerservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customerservice.entity.MyBookings;

import jakarta.transaction.Transactional;



@Repository
public interface CustomerBookingsRepository extends JpaRepository<MyBookings, Long>{
	List<MyBookings> findByCustomerDetails_CustId(Long custId);
	
	

	
	
}
