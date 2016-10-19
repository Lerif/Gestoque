<<<<<<< HEAD
<<<<<<< HEAD
package Servicos;

import java.util.List;

import Entidades.Produto;
//import Enumeradores.TipoProduto;
import Fabricas.FabricaProduto;
import Repositorios.RepositorioEstoqueProduto;

public class ServicoProduto {
	
	public RepositorioEstoqueProduto repositorioProduto = new RepositorioEstoqueProduto();
	
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
	
=======
package Servicos;

import Entidades.Produto;
//import Enumeradores.TipoProduto;
import Fabricas.FabricaProduto;

public class ServicoProduto {
	
	private ServicoProduto() {
=======
package Servicos;

import java.util.List;

import Entidades.Produto;
import Fabricas.FabricaProduto;
import Repositorios.RepositorioEstoqueProduto;

public class ServicoProduto {
	
	public RepositorioEstoqueProduto repositorioProduto = new RepositorioEstoqueProduto();
	
	public ServicoProduto() {
>>>>>>> master
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
<<<<<<< HEAD
		return FabricaProduto.nova().novo(codigo, nome);
	}
>>>>>>> origin/Hivison
=======
		Produto produto = FabricaProduto.nova().novo(codigo, nome);
		repositorioProduto.insert(produto);
		return produto;
	}
	
	public List<Produto> buscarTodos() {
		// TODO Auto-generated method stub
		return repositorioProduto.findAll();
	}
	
>>>>>>> master
}