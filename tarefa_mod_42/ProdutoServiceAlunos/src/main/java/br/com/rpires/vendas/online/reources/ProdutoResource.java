package br.com.rpires.vendas.online.reources;

import br.com.rpires.vendas.online.domain.Produto;
import br.com.rpires.vendas.online.usecase.BuscaProduto;
import br.com.rpires.vendas.online.usecase.CadastroProduto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
	private BuscaProduto buscaProduto;
	private CadastroProduto cadastroProduto;

	@Autowired
	public ProdutoResource(BuscaProduto buscaProduto, CadastroProduto cadastroProduto) {
		this.buscaProduto = buscaProduto;
		this.cadastroProduto = cadastroProduto;
	}

	@GetMapping
	public ResponseEntity<Page<Produto>> buscar(Pageable pageable) {
		return ResponseEntity.ok(buscaProduto.buscar(pageable));
	}

	@PostMapping
	@Operation(summary = "Cadastra um produto")
	public ResponseEntity<Produto> cadastrar(@RequestBody @Valid Produto produto) {
		return ResponseEntity.ok(cadastroProduto.cadastrar(produto));
	}

	@DeleteMapping(value = "/{id}")
	@Operation(summary = "Remove um produto")
	public ResponseEntity<String> remover(@PathVariable(value = "id") String id) {
		cadastroProduto.remover(id);
		return ResponseEntity.ok("Removido com sucesso");
	}
}
