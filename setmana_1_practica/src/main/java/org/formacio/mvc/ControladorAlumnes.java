package org.formacio.mvc;

import org.formacio.component.RepositoriAlumnesMemoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorAlumnes {

	@Autowired
	private RepositoriAlumnesMemoria repositori;
	
	@RequestMapping(path="/alumnes")
	@ResponseBody
	public int contarAlumnes() {
		int numeroAlumnes = repositori.llistaAlumnes().size();
		return numeroAlumnes;
	}
	
}
