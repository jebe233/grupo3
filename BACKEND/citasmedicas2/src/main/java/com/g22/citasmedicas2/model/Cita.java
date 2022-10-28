package com.g22.citasmedicas2.model;

import lombok.*;
import javax.persistence.*;


	
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "cita")
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	private String especialidad;
	private String doctor;
	private String fecha;
}
