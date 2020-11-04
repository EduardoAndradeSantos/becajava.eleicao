package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.eleicao.app.model.*;
import br.eleicao.app.repository.EleitorRepository;

@RestController
@RequestMapping("/eleitores")
public class EleitorController {
	
	//PROPRIEDADE DA CLASSE
		final EleitorRepository _eleitorRepository;

		public EleitorController(EleitorRepository eleitorRepository) {
			//METODO CONSTRUTOR
			_eleitorRepository = eleitorRepository;
		}

		// SALVA
		@PostMapping
		public ResponseEntity inserir(@RequestBody Eleitor eleitor) {
			_eleitorRepository.save(eleitor);
			return ResponseEntity.status(HttpStatus.CREATED).body("Eleitor criado com sucesso!");
		}

		// CONSULTA VARIOS
		@GetMapping
		public ResponseEntity listar() {
			Iterable<Eleitor> eleitores = _eleitorRepository.findAll();
			return ResponseEntity.status(HttpStatus.OK).body(eleitores);
		}

		// CONSULTA UM
		@GetMapping(path = "/{id}")
		public ResponseEntity obter(@PathVariable Long id) {
			Optional<Eleitor> eleitor = _eleitorRepository.findById(id);
			return ResponseEntity.status(HttpStatus.OK).body(eleitor);
		}

		// ATUALIZA
		@PutMapping(path = "/{id}")
		public ResponseEntity atualizar(@RequestBody Eleitor eleitor, @PathVariable Long id) {
			eleitor.setId(id);
			_eleitorRepository.save(eleitor);
			return ResponseEntity.status(HttpStatus.OK).body("Eleitor atualizado com sucesso!");
		}

		// DELETA
		@DeleteMapping(path = "/{id}")
		public ResponseEntity deletar(@PathVariable Long id) {
			_eleitorRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}

	}