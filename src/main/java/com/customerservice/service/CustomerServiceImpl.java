package com.customerservice.service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerservice.domain.CustomerBookingResponseDTO;
import com.customerservice.domain.CustomerDetailsDTO;
import com.customerservice.domain.CustomerResponse;
import com.customerservice.entity.CustomerDetails;
import com.customerservice.entity.MyBookings;
import com.customerservice.exceptions.StatusHandler;
import com.customerservice.mapper.CustomerBookingsMapper;
import com.customerservice.repository.CustomerBookingsRepository;
import com.customerservice.repository.CustomerServiceRepository;


@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService{
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	private final CustomerBookingsMapper customerMapper;
	private final CustomerBookingsRepository custRepository;
	
	private final CustomerServiceRepository repository;
	
	@Autowired
	public CustomerServiceImpl( CustomerServiceRepository repository, CustomerBookingsRepository custRepository, CustomerBookingsMapper customerMapper ) {
		this.repository = repository;
		this.custRepository = custRepository;
		this.customerMapper = customerMapper;
	}

	@Override
	public CustomerResponse createCustomer(CustomerDetailsDTO customerDetailsDTO, CustomerResponse response,
			StatusHandler statusHandler) {
		System.out.println(customerDetailsDTO.getCustId());
		Optional<CustomerDetails> optional = repository.findByCustId(customerDetailsDTO.getCustId());
		CustomerDetails custDetails = optional.get();
		custDetails.setC_firstName(customerDetailsDTO.getC_firstName());
		repository.save(custDetails);
		statusHandler.setMessage("Inserted ..!!");
		response.setStatusHandler(statusHandler);
		return response;
	}
	
	public List<CustomerBookingResponseDTO> getBookingsByCustomerId(Long custId) {
        List<MyBookings> bookings = custRepository.findByCustomerDetails_CustId(custId);
        return customerMapper.toCustomerBookingDTOs(bookings);
    }

	@Override
	public CustomerBookingResponseDTO getBookingsByBookingId(Long custId, Long bookingId, StatusHandler statusHandler,
			CustomerBookingResponseDTO customerBookingResponse) {
		logger.info("START : Get Bookings By ID Service : "+custId+" "+bookingId);
		MyBookings bookings = repository.findByBookingAndCustomer(custId, bookingId);
		
		logger.info("END : Get Bookings By ID Service : "+custId+" "+bookingId);
		return customerMapper.toCustomerBookingDTO(bookings);
	}


}
