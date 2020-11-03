package br.eleicao.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Municipio;
import br.eleicao.app.repository.MunicipioRepository;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner{
	
	//criando propriedade da interface municipio
	final MunicipioRepository _municipioRepository;
	
	//criar metodo construtor de eleicaoaplication
	public EleicaoApplication(MunicipioRepository municipioRepository) {
		//alimentando a propriedade com a contrução da classe
		this._municipioRepository = municipioRepository; 
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Criou um insert manual pra salvar
		Municipio municipio = new Municipio();
		municipio.setNome("são paulo");
		municipio.setPopulacao(14000);
		
		//pega instruções CRUD de repository e salva
		_municipioRepository.save(municipio);
		System.out.println("Municipio salvo com sucesso!");
		
//		//deleta por id
//		_municipioRepository.deleteById(1);
//		System.out.println("Deletado com sucesso!!");
	}
}
