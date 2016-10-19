package Agregadores;

import java.util.List;

import Entidades.MateriaPrima;
import Entidades.Produto;
import Repositorios.RepositorioAgregadorProdutoMateriaPrima;

public class AgregadorProdutoMateriaPrima {

	RepositorioAgregadorProdutoMateriaPrima repositorioProdutoMateria;
	
	
	public AgregadorProdutoMateriaPrima(int quantidade) {
		repositorioProdutoMateria = new RepositorioAgregadorProdutoMateriaPrima();
	}
	
	public void agregarProdutoEMateriaPrima(Produto produto, List<MateriaPrima> listaDeMateriasPrimas){
		repositorioProdutoMateria.inserir(produto, listaDeMateriasPrimas);
	}
	
}
