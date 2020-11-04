package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.eleicao.app.model.*;
import br.eleicao.app.repository.ZonaRepository;

@RestController
@RequestMapping("/zonas")
public class ZonaController {

	// PROPRIEDADE DA CLASSE
	final ZonaRepository _zonaRepository;

	// METODO CONSTRUTOR
	public ZonaController(ZonaRepository zonaRepository) {
		_zonaRepository = zonaRepository;
	}

	// SALVA POST
	@PostMapping
	public ResponseEntity inserir(@RequestBody Zona zona) {
		_zonaRepository.save(zona);
		return ResponseEntity.status(HttpStatus.CREATED).body("Zona criada com sucesso!");
	}

	// CONSULTA VARIOS
	@GetMapping
	public ResponseEntity listar() {
		Iterable<Zona> zonas = _zonaRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(zonas);
	}

	// CONSULTA UM
	@GetMapping(path = "/{id}")
	public ResponseEntity obter(@PathVariable Long id) {
		Optional<Zona> zona = _zonaRepository.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(zona);
	}

	// ATUALIZA
	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Zona zona, @PathVariable Long id) {
		zona.setId(id);
		_zonaRepository.save(zona);
		return ResponseEntity.status(HttpStatus.OK).body("Zona atualizada com sucesso!");
	}

	// DELETA
	@DeleteMapping(path = "/{id}")
	public ResponseEntity deletar(@PathVariable Long id) {
		_zonaRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}