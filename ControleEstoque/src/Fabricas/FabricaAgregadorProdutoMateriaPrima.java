package Fabricas;

import java.util.List;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.MateriaPrima;
import Entidades.Produto;

public class FabricaAgregadorProdutoMateriaPrima {

	public FabricaAgregadorProdutoMateriaPrima() {
		// TODO Auto-generated constructor stub
	}
	
	public AgregadorProdutoMateriaPrima novo(List<MateriaPrima> materiasPrimas, Produto produto){
		return AgregadorProdutoMateriaPrima.novo(materiasPrimas, produto);
	}
	
}