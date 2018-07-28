package br.com.algartech.appex2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.algartech.appex2.model.domain.Cliente;

@Component
public class ClienteDAO {

	private List<Cliente> clientes = new ArrayList<>();
			
	public void salvar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> listarTodos() {
		return clientes;
	}
	
//	public static void main(String[] args) {
//		ClienteDAO dao = new ClienteDAO();
//		
//		Cliente c1 = new Cliente();
//		c1.setNome("TESTE");
//		c1.setCpf("11111");
//		c1.setEmail("TESTE@aaaaaa.com");
//		dao.salvar(c1);
//		
//		Cliente c2 = new Cliente();
//		c2.setNome("BBBBBB");
//		c2.setCpf("222222");
//		c2.setEmail("BBBBBBB@aaaaaa.com");
//		dao.salvar(c2);
//		
//		List<Cliente> clientes = dao.listarTodos();
//		for (Cliente cliente : clientes) {
//			System.out.println(cliente.toString());
//		}
//	}
}
