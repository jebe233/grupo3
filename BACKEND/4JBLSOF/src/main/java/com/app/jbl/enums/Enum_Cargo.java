package com.app.jbl.enums;

import javax.persistence.Table;

@Table(name = "cargo")
public enum Enum_Cargo {
	paciente,
	doctor,
	administrador;
}
