package com.customerservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.customerservice.domain.CustomerBookingResponseDTO;
import com.customerservice.entity.MyBookings;




@Mapper(componentModel = "spring")
public interface CustomerBookingsMapper {

	@Mapping(source = "bookingId", target = "bookingId")
	CustomerBookingResponseDTO toCustomerBookingDTO(MyBookings booking);
	@Mapping(source = "bookingId", target = "bookingId")
	public List<CustomerBookingResponseDTO> toCustomerBookingDTOs(List<MyBookings> bookings);
	
}
