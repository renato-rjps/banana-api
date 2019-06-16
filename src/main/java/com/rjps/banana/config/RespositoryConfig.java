package com.rjps.banana.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.rjps.banana.entities.Booking;
import com.rjps.banana.entities.Local;
import com.rjps.banana.entities.Room;

@Configuration
public class RespositoryConfig implements RepositoryRestConfigurer {
	
	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(
        		Booking.class, 
        		Room.class, 
        		Local.class);
    }

}
