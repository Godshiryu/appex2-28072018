package br.com.algartech.appex2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.algartech.appex2.model.domain.Cliente;
import br.com.algartech.appex2.model.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResources {
	
	@Autowired
	private ClienteService service;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestBody Cliente cliente) {
		service.salvar(cliente);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> listarTodos() {
		return service.listarTodos();
	}
}
