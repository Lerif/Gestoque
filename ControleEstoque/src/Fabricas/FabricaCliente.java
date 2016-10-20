package Fabricas;

import Entidades.Cliente;

public class FabricaCliente extends AbstrataFabrica<FabricaCliente> {

	private FabricaCliente() {
		// TODO Auto-generated constructor stub
	}

	public static FabricaCliente nova() {
		return new FabricaCliente();
	}

	public Cliente criarCliente(String nome, String cnpj) {
		return Cliente.novo(nome, cnpj);
	}
}
