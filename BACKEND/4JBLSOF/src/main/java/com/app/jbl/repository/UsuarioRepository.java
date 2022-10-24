package com.app.jbl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.jbl.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
