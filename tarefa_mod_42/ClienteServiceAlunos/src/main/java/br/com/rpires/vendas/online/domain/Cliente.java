package br.com.rpires.vendas.online.usecase;

import br.com.rpires.vendas.online.domain.Cliente;
import br.com.rpires.vendas.online.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.validation.Valid;

@Service
public class CadastroCliente {

	private IClienteRepository repository;

	@Autowired
	public CadastroCliente(IClienteRepository repository) {
		this.repository = repository;
	}

	public Cliente cadastrar(@Valid Cliente cliente) {
		return repository.insert(cliente);
	}

	public Cliente atualizar(@Valid Cliente cliente) {
		return repository.save(cliente);
	}

	public void remover(String id) {
		repository.deleteById(id);
	}
}
