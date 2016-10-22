package Entidades;

import Agregadores.AgregadorPedidoCliente;

public class Cliente {

	private String nome;
	private String cnpj;
	private AgregadorPedidoCliente agregadorPedidoCliente;
	
	private Cliente(String nome,String cnpj, AgregadorPedidoCliente agregadorPedidoCliente) {
      this.setNome(nome);
      this.setCnpj(cnpj);		
      this.setAgregadorPedidoCliente(agregadorPedidoCliente);
	}

	public static Cliente novo(String nome,String cnpj, AgregadorPedidoCliente agregadorPedidoCliente){
		return new Cliente(nome,cnpj, agregadorPedidoCliente);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public AgregadorPedidoCliente getAgregadorPedidoCliente() {
		return agregadorPedidoCliente;
	}

	public void setAgregadorPedidoCliente(AgregadorPedidoCliente agregadorPedidoCliente) {
		this.agregadorPedidoCliente = agregadorPedidoCliente;
	}
}