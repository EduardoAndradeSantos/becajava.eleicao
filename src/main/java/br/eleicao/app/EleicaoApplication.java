package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Zona;
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
	
	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

//----------------------------------------------------------------------------------------------------------------

//		//------------------SALVAR CANDIDATO	
		
//		Candidato candidato = new Candidato();
//        candidato.setNumero("20");
//        candidato.setNome("Toto do gas");
//        candidato.setTipo("Vereador");
//        _candidatoRepository.save(candidato);
//        System.out.println("Canditado salvo com sucesso!");
		
//		//------------------DELETAR CANDIDATO	
		
//		Candidato candidato = new Candidato();		
//		candidato.setId(new Long(2));
//		_candidatoRepository.delete(candidato);;
//		System.out.println("Candidato deletado com sucesso!");
		
//		//------------------ATUALIZAR CANDIDATO
		
//		Candidato candidato = new Candidato();
//		candidato.setId(new Long(1));
//		candidato.setNumero("11");
//		candidato.setNome("Paulinho da pipoca");
//		candidato.setTipo("Prefeito");
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato atualizado com sucesso!");	
		
//		//------------------SELECIONAR UM CANDIDATO
		
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(1));
//		System.out.println("Candidato: " + candidato.get().getNome());

//		//------------------SELECIONAR TODOS CANDIDATOS
		
//		Iterable<Candidato> candidatos = _candidatoRepository.findAll();		
//		for(Candidato m : candidatos) { //guarda no objeto m e exibe
//			System.out.println("Candidato: " + m.getNome());
//		}

//----------------------------------------------------------------------------------------------------------------
		
//		//------------------SALVAR ELEITOR
		
//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Carmem");
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor salvo com sucesso!");
		
//		//------------------DELETAR ELEITOR
		
//		Eleitor eleitor = new Eleitor();		
//		eleitor.setId(new Long(1));
//		_eleitorRepository.delete(eleitor);;
//		System.out.println("Eleitor deletado com sucesso!");

//		//------------------ATUALIZAR ELEITOR
		
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(1));
//		eleitor.setNome("Luana");
//		_eleitorRepository.save(eleitor);				
//		System.out.println("Eleitor atualizado com sucesso!");	

//		//------------------SELECIONAR ELEITOR
		
//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(1));
//		System.out.println("Eleitor: " + eleitor.get().getNome());
				
//		//------------------SELECIONAR TODOS ELEITORES
	
//		Iterable<Eleitor> eleitores = _eleitorRepository.findAll(); 	
//		for(Eleitor e : eleitores) {
//		System.out.println("Eleitor: " + e.getNome());
//		}
		
//----------------------------------------------------------------------------------------------------------------
		
//		//------------------SALVAR MUNICIPIO	
		
//		//Salvar Município - Cria um insert manual pra salvar
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);
//		//pega instruções CRUD de repository e salva
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");	
		
//		//------------------DELETAR MUNICIPIO	
		
//		//Deletando um município por id
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(2));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
		
//		//------------------ATUALIZAR MUNICIPIO
		
//		//Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(1));
//		municipio.setNome("São Paulo capital");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
		
//		//------------------SELECIONAR UM MUNICIPIO
		
//		//Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(1));
//		System.out.println("Município: " + municipio.get().getNome());

//		//------------------SELECIONAR TODOS MUNICIPIOS
		
//		//Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) { //guarda municipio no objeto m e exibe
//			System.out.println("Município: " + m.getNome());
//		}

//----------------------------------------------------------------------------------------------------------------
		

//		//------------------SALVAR ZONA
		
//		Zona zona = new Zona();
//		zona.setNome("Escola dos zé brabo");
//		_zonaRepository.save(zona);
//		System.out.println("Zona salva com sucesso!");

//		//------------------DELETAR ZONA
		
//		Zona zona = new Zona();
//		zona.setId(new Long(1));
//		_zonaRepository.delete(zona);
//		System.out.println("Zona deletada com sucesso!");

//		//------------------ATUALIZAR ZONA
		
//		Zona zona = new Zona();
//		zona.setId(new Long(1));
//		zona.setNome("Alameda dos anjos");
//		_zonaRepository.save(zona);
//		System.out.println("Zona atualizada com sucesso!");
				
//		//------------------SELECIONA UMA ZONA
				
//		Optional<Zona> zona = _zonaRepository.findById(new Long(1));
//		System.out.println("Zona: " + zona.get().getNome());
						
//		//------------------SELECIONA TODAS AS ZONAS
		
//		Iterable<Zona> zonas = _zonaRepository.findAll(); 	
//		for(Zona z : zonas) {
//		System.out.println("Zona: " + z.getNome());
//		}
		
	}
}




















//---------------------------------PARA MOSTRAR AO PROFESSOR-------------------------------------
//CRIAR METODO CONSTRUTOR DE eleicaoApplication DE FORMA ERRADA

//public EleicaoApplication(CandidatoRepository candidatoRepository) {
//	this._candidatoRepository = candidatoRepository; //alimentando a propriedade com a contrução da classe
//}
//public EleicaoApplication(EleitorRepository eleitorRepository) {
//	this._eleitorRepository = eleitorRepository;
//}
//public EleicaoApplication(MunicipioRepository municipioRepository) {
//	this._municipioRepository = municipioRepository;
//}
//public EleicaoApplication(VotoRepository votoRepository) {
//	this._votoRepository = votoRepository;
//}
//public EleicaoApplication(ZonaRepository zonaRepository) {
//	this._zonaRepository = zonaRepository;
//}
