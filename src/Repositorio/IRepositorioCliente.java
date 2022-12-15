package Repositorio;

import java.util.*;
import Entidades.Cliente;

public interface IRepositorioCliente {
	
	public boolean salvarCliente(Cliente cliente);
	public boolean deletarClientePorId(long id);
	public List<Cliente> listarCliente();
	public boolean alterarPessoa(Cliente cliente);

	
		

}
