package br.com.rpires.vendas.online.usecase;

import br.com.rpires.vendas.online.domain.Produto;
import br.com.rpires.vendas.online.exception.EntityNotFoundException;
import br.com.rpires.vendas.online.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BuscaProduto {
	private IProdutoRepository repository;

	@Autowired
	public BuscaProduto(IProdutoRepository repository) {
		this.repository = repository;
	}

	public Page<Produto> buscar(Pageable pageable) {
		return repository.findAll(pageable);
	}

	public Produto buscarPorId(String id) {
		return repository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException(Produto.class, "id", id));
	}
}
