package br.com.rpires.vendas.online;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import br.com.rpires.vendas.online.domain.Produto;
import br.com.rpires.vendas.online.reources.ProdutoResource;
import br.com.rpires.vendas.online.usecase.BuscaProduto;
import br.com.rpires.vendas.online.usecase.CadastroProduto;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ProdutoResourceTest {

	@InjectMocks
	private ProdutoResource produtoResource;

	@MockBean
	private BuscaProduto buscaProduto;

	@MockBean
	private CadastroProduto cadastroProduto;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void buscarPorId() {
		Produto produto1 = Produto.builder()
				.id("1")
				.nome("Carro Esportivo")
				.codigo("C01")
				.valor(new BigDecimal("100000"))
				.build();

		when(buscaProduto.buscarPorId("1")).thenReturn(produto1);

		ResponseEntity<Produto> result = produtoResource.buscarPorId("1");

		Produto produtoResult = result.getBody();
		assertThat(produtoResult).isEqualTo(produto1);
		assertThat(produtoResult.getId()).isEqualTo(produto1.getId());
		assertThat(produtoResult.getNome()).isEqualTo(produto1.getNome());
	}
}
