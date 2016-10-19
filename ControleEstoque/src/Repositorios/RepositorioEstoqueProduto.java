<<<<<<< HEAD
<<<<<<< HEAD
package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.Produto;

public class RepositorioEstoqueProduto implements RepositorioGenerico<Produto>{

	public static ArrayList<Produto> estoqueProduto = new ArrayList<Produto>();
	
	public RepositorioEstoqueProduto() {
		
	}

	public ArrayList<Produto> select(Produto produto){
		ArrayList<Produto> retornoSelect = new ArrayList<Produto>();
		for (Produto produtoList : estoqueProduto){
			if(estoqueProduto.contains(produto.hashCode())){
				retornoSelect.add(produtoList);
			}else{
				retornoSelect = null;
			}
		}
		return retornoSelect;
	}
	public void insert(Produto produto){
		estoqueProduto.add(produto);
	}
//	ArrayList<Produto> delete(){
//		
//	}
//	ArrayList<Produto> update(){
//		
//	}

	public List<Produto> findAll() {
		return estoqueProduto;
	}
	
//	RepositorioEstoqueProduto find(RepositorioEstoqueProduto obj){
//		
//	}
}
=======
=======
>>>>>>> master
package Repositorios;

import java.util.ArrayList;
import java.util.List;
import Entidades.Produto;

public class RepositorioEstoqueProduto implements RepositorioGenerico<Produto>{

	public static ArrayList<Produto> estoqueProduto = new ArrayList<Produto>();
	
	public RepositorioEstoqueProduto() {
		
	}

	public ArrayList<Produto> select(Produto produto){
		ArrayList<Produto> retornoSelect = new ArrayList<Produto>();
		for (Produto produtoList : estoqueProduto){
			if(estoqueProduto.contains(produto.hashCode())){
				retornoSelect.add(produtoList);
			}else{
				retornoSelect = null;
			}
		}
		return retornoSelect;
	}
	public void insert(Produto produto){
		estoqueProduto.add(produto);
	}
//	ArrayList<Produto> delete(){
//		
//	}
//	ArrayList<Produto> update(){
//		
//	}

	public List<Produto> findAll() {
		return estoqueProduto;
	}
	
//	RepositorioEstoqueProduto find(RepositorioEstoqueProduto obj){
//		
//	}
<<<<<<< HEAD
}
>>>>>>> origin/Hivison
=======
}
>>>>>>> master
