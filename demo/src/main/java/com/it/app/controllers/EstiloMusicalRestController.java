package com.it.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.it.app.models.entity.Cliente;
import com.it.app.models.entity.EstiloMusical;
import com.it.app.models.services.IEstiloMusicalService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/musica")
public class EstiloMusicalRestController {

	@Autowired
	private IEstiloMusicalService estiloMusicalService;

	@GetMapping("/estilo")
	public List<EstiloMusical> index() {
		return estiloMusicalService.findAll();

	}

	@GetMapping("/estilo/{id}")
	@ResponseStatus(HttpStatus.OK)
	public EstiloMusical show(@PathVariable Long id) {
		return estiloMusicalService.findById(id);
	}

	@PostMapping("/estilo")
	@ResponseStatus(HttpStatus.CREATED)
	public EstiloMusical create(@RequestBody EstiloMusical estiloMusical) {
		return estiloMusicalService.save(estiloMusical);

	}

}
