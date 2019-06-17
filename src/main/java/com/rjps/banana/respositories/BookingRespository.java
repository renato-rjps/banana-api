package com.rjps.banana.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rjps.banana.entities.Booking;
import com.rjps.banana.entities.projections.BookingListProjection;

@RepositoryRestResource(excerptProjection=BookingListProjection.class)
public interface BookingRespository extends CrudRepository<Booking, Long> {

}
