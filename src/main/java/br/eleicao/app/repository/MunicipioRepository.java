package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Municipio;

@Repository //DIZ QUE A CLASSE SERÁ REPOSITORIO
public interface MunicipioRepository extends CrudRepository<Municipio, Long>{ 
	//interface só tem assinatura dos metodos //<Classe, Tipo do Id>
	
}
