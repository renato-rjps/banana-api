package com.rjps.banana.entities.projections;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.rjps.banana.entities.Booking;

@Projection(name = "full", types = { Booking.class })
public interface BookingListProjection {

	String getId();
	String getDescription();
	String getResponsible();
	LocalDateTime getStartDate();
	LocalDateTime getEndDate();
	
	@Value("#{target.room.name}")
	String getRoomName();
	
	@Value("#{target.room.local.name}")
	String getLocalName();
}
