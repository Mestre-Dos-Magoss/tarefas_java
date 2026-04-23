package br.com.rpires;

import static org.junit.Assert.*;
import org.junit.Test;
import br.com.rpires.dao.*;
import br.com.rpires.domain.Produto;
import java.util.List;

public class ProdutoTest {

    @Test
    public void crudTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        // Cadastrar
        Produto p = new Produto();
        p.setCodigo("A1");
        p.setNome("Mouse");
        p.setPreco(50.0);
        dao.cadastrar(p);

        // Consultar e Atualizar
        Produto pBD = dao.consultar("A1");
        assertNotNull(pBD);
        pBD.setNome("Mouse Gamer");
        dao.atualizar(pBD);

        // Buscar Todos
        List<Produto> lista = dao.buscarTodos();
        assertTrue(lista.size() > 0);

        // Excluir
        dao.excluir(pBD);
    }
}