package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //CRIA TABELA ABAIXO NO SQL
public class Municipio {
	@Id //CRIA PRIMARY KEY NO SQL
	@GeneratedValue(strategy = GenerationType.IDENTITY)//ID É UM AUTO INCREMENTO
	private Long Id;
	private String Nome;
	private int Populacao;
	
	
	//Metodos
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getPopulacao() {
		return Populacao;
	}
	public void setPopulacao(int populacao) {
		Populacao = populacao;
	}
}
