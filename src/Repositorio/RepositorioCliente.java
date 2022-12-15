package Repositorio;

import java.util.*;

import Entidades.Cliente;

public class RepositorioCliente implements IRepositorioCliente {
	
	//Nesta Array serão salvos os clientes.
	List<Cliente> listaDeClientes = new ArrayList<Cliente>();

	//Utilizei um boolean para saber se conseguimos ou não adicionar através da função add
	public boolean salvarCliente(Cliente cliente) {
		try { //usando a funçãoo Try catch, nós criamos um tratamento, se alguém tentar add
			  //qualquer coisa diferente de um cliente, ele retornará false.
			listaDeClientes.add(cliente);
		} catch (Exception e) {
			return false;
		}
		return true;
		}

	public boolean deletarClientePorId(long id) {
		
		for (Cliente cliente : listaDeClientes) {
			if(cliente.getId()==id) {
				listaDeClientes.remove(cliente);
			}
		}
		
		return false;
	}
	
	public List<Cliente> listarCliente() {
		
		return listaDeClientes;
	}

	public boolean alterarPessoa(Cliente cliente) {
		for (Cliente cliente1 : listaDeClientes) {
			if (cliente1.getId() == cliente.getId()) {
				cliente1.setNome(cliente.getNome());
				cliente1.setCategoria(cliente.getCategoria());
			}			
		}
		return false;
	}

}
