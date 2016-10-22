package Agregadores;

import java.util.List;

import Entidades.Cliente;
import Entidades.Pedido;

public class AgregadorPedidoCliente {
	private Cliente cliente;
	private List<Pedido> pedidos;
	
	
	private AgregadorPedidoCliente(List<Pedido> pedidos, Cliente cliente){
		this.cliente = cliente;
		this.pedidos = pedidos;
	}
	
	public static AgregadorPedidoCliente novo(List<Pedido> pedidos, Cliente cliente){
		return new AgregadorPedidoCliente(pedidos,cliente);
	}
	
	public Cliente cliente(){
		return cliente;
	}
	
	public List<Pedido> pedidos(){
		return this.pedidos;
	}
	
	@Override
	public String toString(){
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.cliente.getNome() + "\n\n");
		
		for (Pedido pedido : this.pedidos){
			stringBuilder.append(pedido.getCodigo());
		}
		return stringBuilder.toString();
		
		
	}
	/*
	 * @Override
	public String toString() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.produto.getNome() + "\n\n");
		

		for (MateriaPrima materiaPrima : this.materiaPrima) {
			stringBuilder.append("      * " + "Materia Prima: " + materiaPrima.getNomeMateriaPrima().getNome() + "  Quantidade: " + materiaPrima.getQuantidadeMateriaPrima()  + "\n"  );
			
		}

		return stringBuilder.toString();
	}
	 */
	//Getters and Setters

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
