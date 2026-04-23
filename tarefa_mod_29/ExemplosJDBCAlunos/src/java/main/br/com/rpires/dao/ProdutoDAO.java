package br.com.rpires.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.com.rpires.dao.jdbc.ConnectionFactory;
import br.com.rpires.domain.Produto;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "INSERT INTO TB_PRODUTO (ID, CODIGO, NOME, PRECO) VALUES (nextval('SQ_PRODUTO'),?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, produto.getCodigo());
        stm.setString(2, produto.getNome());
        stm.setDouble(3, produto.getPreco());
        return stm.executeUpdate();
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "UPDATE TB_PRODUTO SET NOME = ?, PRECO = ? WHERE CODIGO = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, produto.getNome());
        stm.setDouble(2, produto.getPreco());
        stm.setString(3, produto.getCodigo());
        return stm.executeUpdate();
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection connection = ConnectionFactory.getConnection();
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM TB_PRODUTO";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            Produto p = new Produto();
            p.setId(rs.getLong("id"));
            p.setCodigo(rs.getString("codigo"));
            p.setNome(rs.getString("nome"));
            p.setDouble(rs.getDouble("preco"));
            lista.add(p);
        }
        return lista;
    }
}