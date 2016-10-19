package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.MateriaPrima;
import Entidades.Produto;

public class RepositorioProdutoMateriaPrima implements RepositorioGenerico<AgregadorProdutoMateriaPrima> {

	ArrayList<AgregadorProdutoMateriaPrima> estoqueMateriaPrima = new ArrayList<AgregadorProdutoMateriaPrima>();
	
	public List<MateriaPrima> findByProduto(Produto produto){
		for (AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima : estoqueMateriaPrima) 
			if ( agregadorProdutoMateriaPrima.produto().getCodigo().equals(produto.getCodigo()))
				return agregadorProdutoMateriaPrima.materiasPrimas();
		
		return new ArrayList<MateriaPrima>();//TODO continue pensando em arrumar isso!
	}

	@Override
	public ArrayList<AgregadorProdutoMateriaPrima> select(AgregadorProdutoMateriaPrima t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(AgregadorProdutoMateriaPrima t) {
		estoqueMateriaPrima.add(t);
		
	}

	@Override
	public List<AgregadorProdutoMateriaPrima> findAll() {
		return estoqueMateriaPrima;
	}
	
	
}
