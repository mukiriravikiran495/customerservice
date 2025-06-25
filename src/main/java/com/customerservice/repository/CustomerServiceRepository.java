package com.customerservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.entity.CustomerDetails;
import com.customerservice.entity.MyBookings;

import jakarta.transaction.Transactional;

@Repository
public interface CustomerServiceRepository extends JpaRepository<CustomerDetails, Long>{

	@Query("SELECT c FROM CustomerDetails c WHERE c.custId = :custId")
	CustomerDetails findByCustId(Long custId);

//	MyBookings findByBookingIdAndCustomer_CustId(Long custId, Long bookingId);

	
	

	

}
