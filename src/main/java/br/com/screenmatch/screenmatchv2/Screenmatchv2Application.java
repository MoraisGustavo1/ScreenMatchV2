package br.com.screenmatch.screenmatchv2;

import br.com.screenmatch.screenmatchv2.models.DadosSerie;
import br.com.screenmatch.screenmatchv2.services.ConsumoAPI;
import br.com.screenmatch.screenmatchv2.services.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screenmatchv2Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Screenmatchv2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoapi = new ConsumoAPI();
		var json = consumoapi.obterDados("http://www.omdbapi.com/?t=Stranger+Things&apikey=3333ecf7");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
