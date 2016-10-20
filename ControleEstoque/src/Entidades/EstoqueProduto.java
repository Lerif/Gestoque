package Entidades;

import Agregadores.AgregadorProdutoMateriaPrima;
import Enumeradores.MinimoMaximoProduto;

public class EstoqueProduto {
	private int quantidadeProduto;
	private AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima;
	private MinimoMaximoProduto minimoMaximoProduto;

	private EstoqueProduto(int quantidadeProduto, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima,
			MinimoMaximoProduto minimoMaximoProduto) {
		this.quantidadeProduto = quantidadeProduto;
		this.agregadorProdutoMateriaPrima = agregadorProdutoMateriaPrima;
		this.minimoMaximoProduto = minimoMaximoProduto;
	}

	public static EstoqueProduto novo(int quantidadeProduto, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima,
			MinimoMaximoProduto minimoMaximoProduto) {
		return new EstoqueProduto(quantidadeProduto, agregadorProdutoMateriaPrima, minimoMaximoProduto);
	}
}
