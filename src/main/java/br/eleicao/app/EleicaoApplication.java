package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaRepository;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner{
	
	//criando propriedades da interface
	final CandidatoRepository	_candidatoRepository;
	final EleitorRepository 	_eleitorRepository;
	final MunicipioRepository	_municipioRepository;
	final VotoRepository		_votoRepository;
	final ZonaRepository		_zonaRepository;
	
	
	//criar metodo construtor de eleicaoApplication
	public EleicaoApplication(CandidatoRepository candidatoRepository,
			EleitorRepository eleitorRepository,
			MunicipioRepository municipioRepository,
			VotoRepository votoRepository,
			ZonaRepository zonaRepository) {
		
	this._candidatoRepository = candidatoRepository;
	this._eleitorRepository = eleitorRepository;
	this._municipioRepository = municipioRepository;
	this._votoRepository = votoRepository;
	this._zonaRepository = zonaRepository;
}

	
	//criar metodo construtor de eleicaoApplication ERRADO
//	public EleicaoApplication(CandidatoRepository candidatoRepository) {
//		this._candidatoRepository = candidatoRepository; //alimentando a propriedade com a contrução da classe
//	}
//	public EleicaoApplication(EleitorRepository eleitorRepository) {
//		this._eleitorRepository = eleitorRepository;
//	}
//	public EleicaoApplication(MunicipioRepository municipioRepository) {
//		this._municipioRepository = municipioRepository;
//	}
//	public EleicaoApplication(VotoRepository votoRepository) {
//		this._votoRepository = votoRepository;
//	}
//	public EleicaoApplication(ZonaRepository zonaRepository) {
//		this._zonaRepository = zonaRepository;
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		//-----------------------------------------------------------------------SALVAR CANDIDATO	
		
		//Salvar candidato
		Candidato candidato = new Candidato();
        candidato.setNumero("20");
        candidato.setNome("Toto do gas");
//        candidato.setMunicipio(1);
        candidato.setTipo("Vereador");
        _candidatoRepository.save(candidato);
        System.out.println("Canditado salvo com sucesso!");
		
//		//-----------------------------------------------------------------------DELETAR CANDIDATO	
		
//		//Deletando um município por id
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(2));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
		
//		//-----------------------------------------------------------------------ATUALIZAR CANDIDATO
		
//		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(1));
//		municipio.setNome("São Paulo capital");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
		
//		//-----------------------------------------------------------------------SELECIONAR UM CANDIDATO
		
//		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(1));
//		System.out.println("Município: " + municipio.get().getNome());

//		//-----------------------------------------------------------------------SELECIONAR TODOS CANDIDATOS
		
//		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) { //guarda municipio no objeto m e exibe
//			System.out.println("Município: " + m.getNome());
//		}
		
		
		
		
		
		
		
		
		
		
//		//-----------------------------------------------------------------------SALVAR MUNICIPIO	
		
//		//Salvar Município - Cria um insert manual pra salvar
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);
//		//pega instruções CRUD de repository e salva
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");	
		
//		//-----------------------------------------------------------------------DELETAR MUNICIPIO	
		
//		//Deletando um município por id
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(2));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
		
//		//-----------------------------------------------------------------------ATUALIZAR MUNICIPIO
		
//		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(1));
//		municipio.setNome("São Paulo capital");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
		
//		//-----------------------------------------------------------------------SELECIONAR UM MUNICIPIO
		
//		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(1));
//		System.out.println("Município: " + municipio.get().getNome());

//		//-----------------------------------------------------------------------SELECIONAR TODOS MUNICIPIOS
		
//		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) { //guarda municipio no objeto m e exibe
//			System.out.println("Município: " + m.getNome());
//		}
		
	}
}
