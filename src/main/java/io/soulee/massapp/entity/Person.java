package io.soulee.massapp.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@Table(name = "PERSON", schema = "MASSAPP")
public class Person implements Serializable{

	private static final long serialVersionUID = -1865287850336844937L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "MSISDN", nullable = false, unique = true)
	private String msisdn;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@Column(name = "CREATED_AT", nullable = false, updatable = false)
	private LocalDate createdAt;

	@Column(name = "UPDATED_AT")
	private LocalDate updatedAt;
	
	@Column(name = "MASSAGE_COUNT")
	private int massageCount;
}
