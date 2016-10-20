package Agregadores;
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

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(this.produto.getNome() + "\n\n");
		

		for (MateriaPrima materiaPrima : this.materiaPrima) {
			stringBuilder.append("      * " + "Materia Prima: " + materiaPrima.getNomeMateriaPrima().getNome() + "  Quantidade: " + materiaPrima.getQuantidadeMateriaPrima()  + "\n"  );
			
		}

		return stringBuilder.toString();
	}

	public Produto produto() {
		return produto;
	}

	// TODO trocar este por um GET
	public List<MateriaPrima> materiasPrimas() {
		return this.materiaPrima;

	}
	
}

