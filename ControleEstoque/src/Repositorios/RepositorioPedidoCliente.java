package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Agregadores.AgregadorPedidoCliente;
import Entidades.Cliente;
import Entidades.MateriaPrima;
import Entidades.Pedido;
import Entidades.Produto;

public class RepositorioPedidoCliente implements RepositorioGenerico<AgregadorPedidoCliente>{
	
		static List<AgregadorPedidoCliente> listaDePedidos = new ArrayList<>();
		
		public List<Pedido> findByCnpj(Cliente cliente){
			for (AgregadorPedidoCliente agregadorPedidoCliente : listaDePedidos)
				if (agregadorPedidoCliente.cliente().getCnpj().equals(cliente.getCnpj()))
					return agregadorPedidoCliente.pedidos();
			return new ArrayList<Pedido>();
		}

		@Override
		public ArrayList<AgregadorPedidoCliente> select(AgregadorPedidoCliente t) {
			
			return null;
		}

		@Override
		public void insert(AgregadorPedidoCliente pedidos) {
			listaDePedidos.add(pedidos);
			
		}

		@Override
		public List<AgregadorPedidoCliente> findAll() {
			return listaDePedidos;
		}

	}

	/*static List<AgregadorPedidoCliente> listaDePedidos = new ArrayList<>();

	public List<Pedido> findByCNPJ(Cliente cliente) {
		for (AgregadorPedidoCliente agregadorPedidoCliente : listaDePedidos)
			if (agregadorPedidoCliente.cliente().getCnpj().equals(cliente.getCnpj()))
				return agregadorPedidoCliente.getPedidos();

		return new ArrayList<Pedido>();
	}

	*/
	
	/*
	 
	public List<MateriaPrima> pegarListaDeInsumosDoProduto(String nome){
		
		int index = 0;
		
		for(Produto prod : listaDeProdutos){
			
			if(prod.getNome().equals(nome)){
				
				return listasDeMateriasPrimas.get(index);
			}
			index++;
		}
		return null;
	}
	
	public Produto pegarProdutoPorNome(String nome){
		
		for (Produto prod : listaDeProdutos){
			if(prod.getNome().equals(nome)){
				return prod;
			}
		}
		return null;
	}
	
	public List<Produto> pegarTodosProdutos(){
		return listaDeProdutos;
	}
	
	public void imprimirTodosProdutosESuasMateriasPrimas(){
		
		int index = 0;
		
		for(Produto prod : listaDeProdutos){
			System.out.println("Produto: " + prod.getNome());
			System.out.println("Codigo: " + prod.getCodigo());
			
			System.out.println("Materias Primas:");
			for (MateriaPrima materiaPrima : listasDeMateriasPrimas.get(index)){
				System.out.println("		" + materiaPrima);
			}
		}
	}

	 */
	

