package br.com.rpires.LojaCarros;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.rpires.domain.Carro;
import br.com.rpires.repository.ICarroRepository;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.rpires.repository")
@EntityScan("br.com.rpires.*")
@ComponentScan(basePackages = "br.com.rpires")
public class LojaCarrosApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(LojaCarrosApplication.class);

    @Autowired
    private ICarroRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(LojaCarrosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("StartApplication...");

        // Salva um carro de exemplo ao iniciar
        Carro carro = Carro.builder()
                .marca("Volkswagen")
                .modelo("Golf GTI")
                .placa("ABC-1234")
                .cor("Preto")
                .ano(2023)
                .build();

        repository.save(carro);
        log.info("Carro de teste salvo!");
    }
}
