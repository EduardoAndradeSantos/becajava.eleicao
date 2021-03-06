package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {
	@Id //CRIA PRIMARY KEY NO SQL
	@GeneratedValue(strategy = GenerationType.IDENTITY)//ID É UM AUTO INCREMENTO
	private Long Id;
	
	@ManyToOne //CRIA FK MUITOS PARA UM
	@JoinColumn(name="CandidatoId") //CRIA COLUNA PRA FK
	private Candidato Candidato; //ASSOCIA TIPO DA CLASSE CANDIDATO E ID
	
	@ManyToOne //CRIA FK MUITOS PARA UM
	@JoinColumn(name="EleitorId") //CRIA COLUNA PRA FK
	private Eleitor Eleitor; //ASSOCIA TIPO DA CLASSE
	
	@ManyToOne 
	@JoinColumn(name="ZonaId")
	private Zona Zona;
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Candidato getCandidato() {
		return Candidato;
	}

	public void setCandidato(Candidato candidato) {
		Candidato = candidato;
	}

	public Eleitor getEleitor() {
		return Eleitor;
	}

	public void setEleitor(Eleitor eleitor) {
		Eleitor = eleitor;
	}

	public Zona getZona() {
		return Zona;
	}

	public void setZona(Zona zona) {
		Zona = zona;
	}
	
	
	
}
