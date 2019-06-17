package com.rjps.banana.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rjps.banana.entities.Room;
import com.rjps.banana.entities.projections.RoomListProjection;

@RepositoryRestResource(excerptProjection=RoomListProjection.class)
public interface RoomRepository extends CrudRepository<Room, Long> {

}
