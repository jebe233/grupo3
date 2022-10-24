package com.app.jbl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.app.jbl.model.Usuario;
import com.app.jbl.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping("/usuario")
	private String verUsuario(Model model) {
		model.addAttribute("usuarios", usuarioService.verUsuario());
		return "usuario";
	}

	@GetMapping("/agregarusuario") // cuando se hace una peticion a /agregar-usuario nos manda a la pagina
									// agregar-usuario
	private String verFormularioUsuario(Usuario usuario) {
		return "agregarusuario";
	}

	@PostMapping("/usuario")
	private String crearUsuario(Usuario usuario) {
		usuarioService.crearYActualizarUsuario(usuario);
		return "redirect:/usuario";
	}

	@GetMapping("usuario/borrar/{id}")
	private String eliminarUsuario(@PathVariable("id") Long id) {
		usuarioService.eliminarUsuario(id);
		return "redirect:/usuario";
	}

	//@GetMapping("/usuario/editar/{id}")
	//private String verUsuarioPorId(@PathVariable("id") Long id, Model model) {
	//	Usuario usuario = usuarioService.verUsuarioPorId(id);
	//	model.addAttribute("usuario", usuario);
	//	return "actualizaruser";
	//}
	
	@GetMapping("/usuario/editar/{id}")
    private String verUsuarioPorId(@PathVariable("id") Long id, Model model){
        Usuario usuario = usuarioService.verUsuarioPorId(id);
        model.addAttribute("usuario", usuario);
        return "actualizar-usuario";
    }

	@PostMapping("/usuario/actualizar/{id}")
	private String editarUsuario(@PathVariable("id") Long id, Usuario usuario) {
		usuarioService.crearYActualizarUsuario(usuario);
		return "redirect:/usuario";
	}

}
