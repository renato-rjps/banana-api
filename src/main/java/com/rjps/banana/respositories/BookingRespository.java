package com.rjps.banana.respositories;

import org.springframework.data.repository.CrudRepository;

import com.rjps.banana.entities.Booking;

public interface BookingRespository extends CrudRepository<Booking, Long> {

}
