package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.Cliente;

public class RepositorioCliente implements RepositorioGenerico<Cliente> {

	List<Cliente> clientes = new ArrayList<Cliente>();

	public void insert(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public List<Cliente> findAll() {
		return this.clientes;
	}

	public Cliente findByCnpj(String cnpj) {

		for (Cliente clienteItem : clientes) {
			if(clienteItem.getCnpj().equals(cnpj)){
				return clienteItem;
			}
		}

		return null;
	}
	public ArrayList<Cliente> select(Cliente t) {
		// TODO Auto-generated method stub
		return null;
	}

}
