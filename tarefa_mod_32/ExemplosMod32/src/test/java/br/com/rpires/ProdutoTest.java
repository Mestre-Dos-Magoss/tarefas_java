package br.com.rpires;

import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import br.com.rpires.dao.IProdutoDao;
import br.com.rpires.dao.ProdutoDao;
import br.com.rpires.domain.Produto;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @After
    public void end() {
        List<Produto> list = produtoDao.buscarTodos();
        list.forEach(prod -> produtoDao.excluir(prod));
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("P1");
        produto.setNome("Smartphone");
        produto.setPreco(1500.0);

        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}