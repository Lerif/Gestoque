package Entidades;

import Agregadores.AgregadorProdutoMateriaPrima;

public class OrdemDeServico {
	

	private String codigo;
	private int quantidade;
	private AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima;
	
	/*
	 * Construtores
	 */

	private OrdemDeServico(String codigo, int quantidade, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima){
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.agregadorProdutoMateriaPrima = agregadorProdutoMateriaPrima;
	}
	
	public static OrdemDeServico novo(String codigo, int quantidade, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima){
		return new OrdemDeServico(codigo, quantidade, agregadorProdutoMateriaPrima);
	}
	
	/*
	 * GETTERS AND SETTERS
	 */
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public AgregadorProdutoMateriaPrima getAgregadorProdutoMateriaPrima() {
		return agregadorProdutoMateriaPrima;
	}

	public void setAgregadorProdutoMateriaPrima(AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima) {
		this.agregadorProdutoMateriaPrima = agregadorProdutoMateriaPrima;
	}

	@Override
	public String toString() {
		return codigo + " - "+ agregadorProdutoMateriaPrima.produto().getNome();
	}
	
	
	

}
