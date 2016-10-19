package Servicos;

import java.util.List;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.MateriaPrima;
import Entidades.Produto;
import Fabricas.FabricaAgregadorProdutoMateriaPrima;
import Repositorios.RepositorioProdutoMateriaPrima;

public class ServicoProdutoMateriaPrima {
	
	FabricaAgregadorProdutoMateriaPrima fabricaAgregadorProdutoMateriaPrima;
	RepositorioProdutoMateriaPrima repositorioProdutoMateriaPrima;
	
	public ServicoProdutoMateriaPrima() {
		fabricaAgregadorProdutoMateriaPrima = new FabricaAgregadorProdutoMateriaPrima();
		repositorioProdutoMateriaPrima = new RepositorioProdutoMateriaPrima();
	}

	public AgregadorProdutoMateriaPrima solicitarCriacaoAgregadorProdutoMateriaPrima(List<MateriaPrima> materiaPrima, Produto produto){
		AgregadorProdutoMateriaPrima novo = fabricaAgregadorProdutoMateriaPrima.novo(materiaPrima, produto);
		repositorioProdutoMateriaPrima.insert(novo);
		return novo;
	}
	
	public List<MateriaPrima> buscarPorProduto(Produto produto){
		return repositorioProdutoMateriaPrima.findByProduto(produto);
	}
	

}
