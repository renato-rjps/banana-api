package com.rjps.banana.events;

import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

import com.rjps.banana.entities.Booking;

@Component
public class BookingControllerEventListener extends AbstractRepositoryEventListener<Booking> {
	
	@Override
	protected void onBeforeCreate(Booking booking) {
		
		if(booking.isCoffee() && booking.getAmountOfPeople() < 1) {
			throw new AmountOfPeopleException("Quantidade de Pessoas deve ser Maior que 0");
		}
		
	}

}
