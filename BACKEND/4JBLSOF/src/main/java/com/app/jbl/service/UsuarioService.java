package com.app.jbl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.jbl.model.Usuario;
import com.app.jbl.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void crearYActualizarUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> verUsuario(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.addAll(usuarioRepository.findAll());
		return usuarios;
	}
	
	public Usuario verUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).get();
	}
	
	public void eliminarUsuario (long id) {
		usuarioRepository.deleteById(id);
	}
	

}
