package br.com.rpires;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import br.com.rpires.dao.*;
import br.com.rpires.domain.*;

public class CarroTest {

    private ICarroDao carroDao;

    public CarroTest() {
        carroDao = new CarroDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = new Marca();
        marca.setNome("Volkswagen");

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Ar Condicionado");

        Carro carro = new Carro();
        carro.setModelo("Golf");
        carro.setMarca(marca);
        carro.getAcessorios().add(acessorio);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
        assertNotNull(carro.getMarca().getId());
    }
}