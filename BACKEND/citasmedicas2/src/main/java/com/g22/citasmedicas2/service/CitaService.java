package com.g22.citasmedicas2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g22.citasmedicas2.model.Cita;
import com.g22.citasmedicas2.repository.CitaRepository;

@Service
public class CitaService {
	
	@Autowired
    CitaRepository citaRepository;

    public void crearYActualizarCita(Cita cita){
        citaRepository.save(cita);
    }

    public List<Cita> verCita(){
        return citaRepository.findAll();
    }

    public Cita verCitaPorId(Long id){
        return citaRepository.findById(id).get();
    }

    public void eliminarCita(Long id){
        citaRepository.deleteById(id);
    }

}
