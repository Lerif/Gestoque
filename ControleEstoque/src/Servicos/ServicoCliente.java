package Servicos;

import java.util.List;

import Agregadores.AgregadorPedidoCliente;
import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.Cliente;
import Fabricas.FabricaCliente;
import Repositorios.RepositorioCliente;

public class ServicoCliente {
	
	public ServicoCliente(){}
	
	public static ServicoCliente novo(){
		return new ServicoCliente();
	}
	
	public RepositorioCliente repositorioCliente = new RepositorioCliente();

	

	public Cliente solicitarCriacaoCliente(String nome, String cnpj, AgregadorPedidoCliente agregadorPedidoCliente){
		Cliente cliente = FabricaCliente.nova().novo(nome, cnpj, agregadorPedidoCliente);
		repositorioCliente.insert(cliente);
		return cliente;
	}
	
	public List<Cliente> buscarTodos(){
		return repositorioCliente.findAll();
	}
}