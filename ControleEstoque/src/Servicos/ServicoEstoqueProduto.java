package Servicos;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.EstoqueProduto;
import Enumeradores.MinimoMaximoProduto;
import Fabricas.FabricaEstoqueProduto;
import Repositorios.RepositorioEstoqueProduto;

public class ServicoEstoqueProduto {

	public static EstoqueProduto crieEstoqueProduto(int quantidadeProduto,
			AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima, MinimoMaximoProduto minimoMaximoProduto) {

		EstoqueProduto estoqueProduto = FabricaEstoqueProduto.fabricarEstoqueProduto(quantidadeProduto,
				agregadorProdutoMateriaPrima, minimoMaximoProduto);

		RepositorioEstoqueProduto.obterRepositorioEstoqueProduto().insert(estoqueProduto);

		return estoqueProduto;
	}
}
