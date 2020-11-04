package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Zona;

@Repository //DIZ QUE A CLASSE SERÁ REPOSITORIO
public interface ZonaRepository extends CrudRepository<Zona, Long> {
	//interface só tem assinatura dos metodos //<Classe, Tipo do Id>
}