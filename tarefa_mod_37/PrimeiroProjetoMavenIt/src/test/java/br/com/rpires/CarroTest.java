package br.com.rpires;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import br.com.rpires.dao.CarroDao;
import br.com.rpires.dao.ICarroDao;
import br.com.rpires.domain.Acessorio;
import br.com.rpires.domain.Carro;
import br.com.rpires.domain.Marca;

public class CarroTest {
    private ICarroDao carroDao = new CarroDao();

    @Test
    public void cadastrarCarroTest() {
        Marca marca = new Marca();
        marca.setNome("Toyota");

        Carro carro = new Carro();
        carro.setModelo("Corolla");
        carro.setMarca(marca);

        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Teto Solar");
        carro.getAcessorios().add(acessorio);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro.getId());
        assertNotNull(carro.getMarca().getId());
    }
}