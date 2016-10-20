package Servicos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Produto;
import Fabricas.FabricaProduto;
import Repositorios.RepositorioProduto;

public class ServicoProduto {
	
	public RepositorioProduto repositorioProduto = new RepositorioProduto();
	
	public ServicoProduto() {
		// TODO Auto-generated constructor stub
	}
	
	public static ServicoProduto novo(){
		return new ServicoProduto();
	}
/*	
	public Produto solicitarCriacaoProduto(String codigo, TipoProduto tipo){
		return FabricaProduto.nova().novo(codigo, tipo);		
	}
	
	*/
	
	public Produto solicitarCriacaoProduto(String codigo, String nome){
		Produto produto = FabricaProduto.nova().novo(codigo, nome);
		repositorioProduto.insert(produto);
		return produto;
	}
	
	public List<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return repositorioProduto.findAll();
	}
	
	public Object[] arrayStringFromProdutos(){
		
		List<String> stringProdutos = new ArrayList<>();
		
		for (Produto produto : this.buscarTodos()) {
			stringProdutos.add(produto.toString());
		}
		
		return (Object[]) stringProdutos.toArray();
	}
	
}