package Fabricas;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.EstoqueProduto;
import Enumeradores.MinimoMaximoProduto;

public class FabricaEstoqueProduto {
	public static EstoqueProduto fabricarEstoqueProduto(int quantidadeProduto,
			AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima, MinimoMaximoProduto minimoMaximoProduto) {
		return EstoqueProduto.novo(quantidadeProduto, agregadorProdutoMateriaPrima, minimoMaximoProduto);
	}

}
