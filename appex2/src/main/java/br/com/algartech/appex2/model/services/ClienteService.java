package br.com.algartech.appex2.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.algartech.appex2.dao.ClienteDAO;
import br.com.algartech.appex2.exceptions.CPFValidationException;
import br.com.algartech.appex2.model.domain.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClienteDAO dao;
	
	public void salvar(Cliente cliente) {
		if (cliente != null && cliente.getCpf().length() < 11) {
			throw new CPFValidationException("CPF ERRADO");
		} else {
			dao.salvar(cliente);			
		}
	}
	
	public List<Cliente> listarTodos() {
		return dao.listarTodos();
	}
	
}
