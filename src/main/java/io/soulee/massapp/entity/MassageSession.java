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
@Table(name = "Massage_session", schema = "MASSAPP")
public class MassageSession implements Serializable{

	private static final long serialVersionUID = -2613170283150651051L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "DATE", nullable = false)
	private LocalDate date;
	
	

}
