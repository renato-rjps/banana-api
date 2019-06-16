package com.rjps.banana.entities;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@SequenceGenerator(name = "PRIMARY_KEY", sequenceName = "BOOKING_ID_SEQ", allocationSize = 1)
public class Booking extends BaseEntity {
	@Column(nullable=false)
	private LocalDateTime startDate;
	
	@Column(nullable=false)
	private LocalDateTime endDate;
	
	//@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval=true)
	@Column(nullable=false)
	private String user;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private Room room;
	
	private boolean coffee;
	private int amountOfPeople;
}
