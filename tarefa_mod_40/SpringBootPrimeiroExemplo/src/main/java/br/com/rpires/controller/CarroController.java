package br.com.rpires.controller;

import br.com.rpires.domain.Carro;
import br.com.rpires.repository.ICarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private ICarroRepository repository;

    @GetMapping
    public List<Carro> listarTodos() {
        return (List<Carro>) repository.findAll();
    }

    @PostMapping
    public Carro salvar(@RequestBody Carro carro) {
        return repository.save(carro);
    }
}
