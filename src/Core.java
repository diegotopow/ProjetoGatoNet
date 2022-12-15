import java.util.*;
import Entidades.Cliente;
import Repositorio.RepositorioCliente;

public class Core {
	
	static RepositorioCliente repositorioCliente = new RepositorioCliente();
	public static void main(String[] args) {
		
		
		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("Insira o nome: ");
		String nome = entradaDeDados.nextLine();
		
		System.out.println("Insira o Id: ");
		Long id = entradaDeDados.nextLong();
		
		System.out.println("Insira o Categoria: ");
		String categoria = entradaDeDados.nextLine();
		
		System.out.println("Insira o Plano: ");
		String plano = entradaDeDados.nextLine();
		
		
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setId(id);
		cliente.setCategoria(categoria);
		cliente.setPlano(plano);
		
		
		System.out.println("Nome:"+cliente.getNome()+"\nID:"+cliente.getId()+"\nCategoria:"+""+cliente.getCategoria()+"\nPlano:"+cliente.getPlano());
		
		
		//centralArray();
		//listarClientes();
		//repositorioCliente.deletarClientePorId(2);
		//listarClientes();
		//alterar();
		//listarClientes();
		
	}		
	
	public static void alterar() {
		
		Cliente cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Rodrigo Santos");
		cliente.setCategoria("Mano");
		repositorioCliente.alterarPessoa(cliente);
	}
	
	public static void centralArray(Cliente cliente) {	
			//Instanciei o repositorio para acessar o contrato de salvar o cliente.						
			
			//Cliente cliente = new Cliente();
			//cliente.setId(01);
			//cliente.setNome("Rodrigo Lopes");
			//cliente.setCategoria("Vip");
			//cliente.setPlano("50 mb");
			repositorioCliente.salvarCliente(cliente);
			
			Cliente cliente1 = new Cliente();
			cliente1.setId(02);
			cliente1.setNome("Gilmar João");
			cliente1.setCategoria("Vip");
			repositorioCliente.salvarCliente(cliente1);
			
			Cliente cliente2 = new Cliente();
			cliente2.setId(03);
			cliente2.setNome("Diego Lopes");
			cliente2.setCategoria("Vip");
			repositorioCliente.salvarCliente(cliente2);
			
		}
		
		public static void listarClientes() {
			List<Cliente> lista = new ArrayList<Cliente>();
			
			lista = repositorioCliente.listarCliente();
			
			for (Cliente cliente : lista) {
				System.out.println("Id: "+cliente.getId());
				System.out.println("Nome: "+cliente.getNome());
				System.out.println("Categoria: "+cliente.getCategoria());
				System.out.println("Plano: "+cliente.getPlano());
				System.out.println("------------------------------------");
				
		}
	}
}
