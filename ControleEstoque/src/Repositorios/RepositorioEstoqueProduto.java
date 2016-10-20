package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.EstoqueProduto;

public class RepositorioEstoqueProduto implements RepositorioGenerico<EstoqueProduto> {

	private RepositorioEstoqueProduto() {

	}

	public static RepositorioEstoqueProduto obterRepositorioEstoqueProduto() {
		return new RepositorioEstoqueProduto();
	}

	private static List<EstoqueProduto> estoquesProdutos = new ArrayList<EstoqueProduto>();

	@Override
	public ArrayList<EstoqueProduto> select(EstoqueProduto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(EstoqueProduto t) {
		this.estoquesProdutos.add(t);
	}

	@Override
	public List<EstoqueProduto> findAll() {
		return this.estoquesProdutos;
	}

}