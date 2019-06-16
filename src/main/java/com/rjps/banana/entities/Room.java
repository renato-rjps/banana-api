package com.rjps.banana.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(name = "PRIMARY_KEY", sequenceName = "ROOM_ID_SEQ", allocationSize = 1)
public class Room extends BaseEntity {

	@Column(length = 255, nullable = false)
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private Local local;
	
	@OneToMany(mappedBy="room", fetch=FetchType.LAZY)
	private List<Booking> bookings;
}
