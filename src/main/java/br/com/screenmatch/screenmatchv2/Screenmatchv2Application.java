package br.com.screenmatch.screenmatchv2;

import br.com.screenmatch.screenmatchv2.services.ConsumoAPI;
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
		var json = consumoapi.obterDados("http://www.omdbapi.com/?t=Stranger+Things&Season=4&apikey=3333ecf7");
		System.out.println(json);
	}
}
