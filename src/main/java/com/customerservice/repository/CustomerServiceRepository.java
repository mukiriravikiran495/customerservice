package com.customerservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.customerservice.entity.CustomerDetails;
import com.customerservice.entity.MyBookings;

@Repository
public interface CustomerServiceRepository extends JpaRepository<CustomerDetails, Long>{

	Optional<CustomerDetails> findByCustId(Long custId);

//	MyBookings findByBookingIdAndCustomer_CustId(Long custId, Long bookingId);

	@Query("SELECT m FROM MyBookings m WHERE m.bookingId = :bookingId AND m.customerDetails.custId = :custId")
	MyBookings findByBookingAndCustomer(@Param("custId") Long custId, @Param("bookingId") Long bookingId);

}
