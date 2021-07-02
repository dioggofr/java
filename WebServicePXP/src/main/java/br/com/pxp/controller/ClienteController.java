package br.com.pxp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;

import br.com.pxp.http.Cliente;
import br.com.pxp.repository.ClienteRepository;
import br.com.pxp.repository.entity.ClienteEntity;

public class ClienteController {
	
	private final  ClienteRepository clienteRepository = new ClienteRepository();
	
	
	public void Cadastrar(Cliente cliente){

		ClienteEntity entity = new ClienteEntity();

		try {			
			entity.setNomeCliente(cliente.getNomeCliente());
			entity.setEnderecoCliente(cliente.getEnderecoCliente());
			entity.setFoneCliente(cliente.getFoneCliente());
			entity.setReferenciaCliente(cliente.getReferenciaCliente());
			entity.setIdAndroid(cliente.getIdAndroid());

			clienteRepository.Salvar(entity);			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public void Alterar(Cliente cliente){

		ClienteEntity entity = new ClienteEntity();

		try {

			entity.setIdCliente(cliente.getIdCliente());
			entity.setNomeCliente(cliente.getNomeCliente());
			entity.setEnderecoCliente(cliente.getEnderecoCliente());
			entity.setFoneCliente(cliente.getFoneCliente());
			entity.setReferenciaCliente(cliente.getReferenciaCliente());
			entity.setIdAndroid(cliente.getIdAndroid());

			clienteRepository.Alterar(entity);			

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	
	public List<Cliente> TodosClientes(){

		List<Cliente> clientes =  new ArrayList<Cliente>();

		List<ClienteEntity> listaEntityClientes = clienteRepository.Todosclientes();

		for (ClienteEntity entity : listaEntityClientes) {

			clientes.add(new Cliente(entity.getIdCliente(), entity.getNomeCliente(),entity.getFoneCliente(),
					entity.getReferenciaCliente(),entity.getEnderecoCliente(),entity.getIdAndroid()));
		}

		return clientes;
	}
	
	public Cliente GetCliente(@PathParam("codigo") Integer codigo){

		ClienteEntity entity = clienteRepository.GetCliente(codigo);

		if(entity != null)
			return new Cliente(entity.getIdCliente(), entity.getNomeCliente(),entity.getFoneCliente(),
					entity.getReferenciaCliente(),entity.getEnderecoCliente(), entity.getIdAndroid());

		return null;
	}
	
	public void Excluir(@PathParam("codigo") Integer codigo){

		try {

			clienteRepository.Excluir(codigo);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
