package com.rjps.banana.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(name = "PRIMARY_KEY", sequenceName = "BOOKING_ID_SEQ", allocationSize = 1)
public class Booking extends BaseEntity {
	private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm";

	@Column(nullable = false)
	@DateTimeFormat(pattern = DATE_TIME_FORMAT)
	@JsonFormat(pattern = DATE_TIME_FORMAT)
	private LocalDateTime startDate;

	@Column(nullable = false)
	@DateTimeFormat(pattern = DATE_TIME_FORMAT)
	@JsonFormat(pattern = DATE_TIME_FORMAT)
	private LocalDateTime endDate;

	@Column(nullable = false)
	private String responsible;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Room room;

	private boolean coffee;
	private int amountOfPeople;
	private String description;
}
