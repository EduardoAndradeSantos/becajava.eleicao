package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Eleitor;

@Repository //DIZ QUE A CLASSE SERÁ REPOSITORIO
public interface EleitorRepository extends CrudRepository<Eleitor, Long>{
		//interface só tem assinatura dos metodos //<Classe, Tipo do Id>
}