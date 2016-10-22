package Fabricas;

import Agregadores.AgregadorPedidoCliente;
import Entidades.Cliente;

public class FabricaCliente extends AbstrataFabrica<FabricaCliente> {

	private FabricaCliente() {
		// TODO Auto-generated constructor stub
	}

	public static FabricaCliente nova() {
		return new FabricaCliente();
	}

	public Cliente novo(String nome, String cnpj, AgregadorPedidoCliente agregadorPedidoCliente) {
		return Cliente.novo(nome, cnpj, agregadorPedidoCliente);
	}
}
