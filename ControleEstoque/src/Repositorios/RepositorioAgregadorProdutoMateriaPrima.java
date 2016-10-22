package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.MateriaPrima;
import Entidades.Produto;

public class RepositorioAgregadorProdutoMateriaPrima {

	List<Produto> listaDeProdutos = new ArrayList<>();
	List<List<MateriaPrima>> listasDeMateriasPrimas;
	
	public void inserir(Produto produto, List<MateriaPrima> listaMateriaPrima){
		this.listaDeProdutos.add(produto);
		this.listasDeMateriasPrimas.add(listaMateriaPrima);
	}
	
	/**
	 * Retorna Lista de materias primas que o produto 
	 * precisa para ser criado.
	 * param: nome do produto
	 * retorno: Lista de materias prima do produto, caso
	 * o produto nao seja encontrado retorna null.
	 * */
	public List<MateriaPrima> pegarListaDeInsumosDoProduto(String nome){
		
		int index = 0;
		
		for(Produto prod : listaDeProdutos){
			
			if(prod.getNome().equals(nome)){
				
				return listasDeMateriasPrimas.get(index);
			}
			index++;
		}
		return null;
	}
	
	public Produto pegarProdutoPorNome(String nome){
		
		for (Produto prod : listaDeProdutos){
			if(prod.getNome().equals(nome)){
				return prod;
			}
		}
		return null;
	}
	
	public List<Produto> pegarTodosProdutos(){
		return listaDeProdutos;
	}
	
	public void imprimirTodosProdutosESuasMateriasPrimas(){
		
		int index = 0;
		
		for(Produto prod : listaDeProdutos){
			System.out.println("Produto: " + prod.getNome());
			System.out.println("Codigo: " + prod.getCodigo());
			
			System.out.println("Materias Primas:");
			for (MateriaPrima materiaPrima : listasDeMateriasPrimas.get(index)){
				System.out.println("		" + materiaPrima);
			}
		}
	}
}

