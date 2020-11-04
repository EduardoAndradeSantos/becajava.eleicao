package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Candidato;

@Repository //DIZ QUE A CLASSE SERÁ REPOSITORIO
public interface CandidatoRepository extends CrudRepository<Candidato, Long> {
	//interface só tem assinatura dos metodos //<Classe, Tipo do Id>
}
