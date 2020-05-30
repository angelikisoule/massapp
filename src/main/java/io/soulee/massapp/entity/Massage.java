package io.soulee.massapp.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "Massage", schema = "MASSAPP")
public class Massage implements Serializable{

	private static final long serialVersionUID = -2209567780459972115L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "DATE", nullable = false)
	private LocalDate date;
	
	@JoinColumn(name="PERSON_ID")
	@ManyToOne(fetch = FetchType.LAZY)
	private Person person;
	
	
	@JoinColumn(name="SESSION_ID")
	@ManyToOne(fetch = FetchType.LAZY)
	private MassageSession massageSession;
}
