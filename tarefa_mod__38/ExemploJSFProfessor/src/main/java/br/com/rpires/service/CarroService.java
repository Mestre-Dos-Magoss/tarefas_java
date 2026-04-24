package br.com.rpires.service;

import br.com.rpires.domain.Carro;
import br.com.rpires.repository.CarroRepository;

public class CarroService {
    private CarroRepository repository = new CarroRepository();

    public void cadastrar(Carro carro) throws Exception {
        if (carro.getModelo() == null || carro.getModelo().isEmpty()) {
            throw new Exception("O modelo é obrigatório!");
        }
        if (carro.getPlaca().length() < 7) {
            throw new Exception("Placa inválida!");
        }
        repository.salvar(carro);
    }
}