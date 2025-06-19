package br.com.danielfelix.exVendas.services;


import br.com.danielfelix.exVendas.DAO.generics.GenericDAO;
import br.com.danielfelix.exVendas.DAO.IClienteDAO;
import br.com.danielfelix.exVendas.domain.Cliente;

public class ClienteService extends GenericDAO<Cliente> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super();
	}

	@Override
	public Class<Cliente> getTipoClass() {
		return Cliente.class;
	}

	@Override
	public void atualizarDados(Cliente entity, Cliente entityCadastrado) {
	}

}
