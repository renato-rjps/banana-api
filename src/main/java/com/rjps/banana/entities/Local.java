package com.rjps.banana.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "LOCAL_TB")
@SequenceGenerator(name = "PRIMARY_KEY", sequenceName = "LOCAL_ID_SEQ", allocationSize = 1)
public class Local extends BaseEntity {

	@Column(length = 255, nullable = false)
	private String name;

	@OneToMany(mappedBy = "local", fetch=FetchType.LAZY)
	private List<Room> rooms;
}
