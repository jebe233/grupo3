package com.app.jbl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import com.app.jbl.enums.Enum_Cargo;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor 
@NoArgsConstructor 
@Getter
@Setter
@ToString
@Table(name = "usuarios",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	private String nombre;
	private String apellido;
	
	@Enumerated(EnumType.STRING)
	@Column(name="cargo")
	private Enum_Cargo cargo;
	
	private String direccion;
	private String email;
	private String pass;

}
