package Agregadores;

import java.util.ArrayList;
import java.util.List;

import Entidades.MateriaPrima;
import Entidades.Produto;

public class AgregadorProdutoMateriaPrima {

	private List<MateriaPrima> materiaPrima;
	private Produto produto;

	private AgregadorProdutoMateriaPrima(List<MateriaPrima> materiaPrima, Produto produto) {
		this.materiaPrima = materiaPrima;
		this.produto = produto;
	}

	public static AgregadorProdutoMateriaPrima novo(List<MateriaPrima> materiaPrima, Produto produto) {
		return new AgregadorProdutoMateriaPrima(materiaPrima, produto);
	}

	@Override
	public String toString() {
		return this.produto.getNome() + " - " + this.materiaPrima.size();
	}

	public Produto produto() {
		return produto;
	}

	// TODO trocar este por um GET
	public List<MateriaPrima> materiasPrimas() {
		return this.materiaPrima;
	}

}