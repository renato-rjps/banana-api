package com.rjps.banana.entities.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.rjps.banana.entities.Room;

@Projection(name="full", types= {Room.class})
public interface RoomListProjection {
	Long getId();
	String getName();
	
	@Value("#{target.local.name}")
	String getLocalName();
}
