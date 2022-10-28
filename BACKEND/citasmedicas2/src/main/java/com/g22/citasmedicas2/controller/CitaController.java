package com.g22.citasmedicas2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.g22.citasmedicas2.model.Cita;
import com.g22.citasmedicas2.service.CitaService;

@RestController
public class CitaController {
	
	@Autowired
	CitaService citaService;
	
	//metodo lectura completa de tabla cita
	@RequestMapping(value = "api/citas", method = RequestMethod.GET)
	private List<Cita> verCita(){
		return citaService.verCita();
	}
	//crear cita
	//@PostMapping("api/citas")
	@RequestMapping(value = "api/citas", method = RequestMethod.POST)
	private void crearCita(@RequestBody Cita cita) {
		citaService.crearYActualizarCita(cita);
	}
	
	///eliminar po Id
	//@GetMapping("api/citas/{id}")
	@RequestMapping(value = "api/citas/{id}")
	private void eliminarCita(@PathVariable("id")Long id) {
		citaService.eliminarCita(id);
	}
	///busqueda por Id
	//@RequestMapping("api/citas/{id}")
	//private Cita verCitaPorId(@PathVariable("id") Long id) {
	//	return citaService.verCitaPorId(id);
	//}
	
	@PutMapping("api/citas")
	private void editarCita(@RequestBody Cita cita) { 
		citaService.crearYActualizarCita(cita);
	}

}
