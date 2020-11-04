package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.eleicao.app.model.*;
import br.eleicao.app.repository.MunicipioRepository;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {
	
	//PROPRIEDADE DA CLASSE
	final MunicipioRepository _municipioRepository;

	public MunicipioController(MunicipioRepository municipioRepository) {
		//METODO CONSTRUTOR
		_municipioRepository = municipioRepository;
	}

	// SALVA
	@PostMapping
	public ResponseEntity inserir(@RequestBody Municipio municipio) {
		_municipioRepository.save(municipio);
		return ResponseEntity.status(HttpStatus.CREATED).body("Município criado com sucesso!");
	}

	// CONSULTA VARIOS
	@GetMapping
	public ResponseEntity listar() {
		Iterable<Municipio> municipios = _municipioRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(municipios);
	}

	// CONSULTA UM
	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Municipio> municipio = _municipioRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(municipio);
	}

	// ATUALIZA
	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Municipio municipio, @PathVariable Long id) {
		municipio.setId(id);
		_municipioRepository.save(municipio);
		return ResponseEntity.status(HttpStatus.OK).body("Município atualizado com sucesso!");
	}

	// DELETA
	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_municipioRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}