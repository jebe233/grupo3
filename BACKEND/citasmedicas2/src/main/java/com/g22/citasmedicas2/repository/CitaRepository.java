package com.g22.citasmedicas2.repository;

import com.g22.citasmedicas2.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Long>{

}
