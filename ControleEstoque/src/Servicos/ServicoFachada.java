package Servicos;

import java.util.List;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.Cliente;
import Entidades.MateriaPrima;
import Entidades.Pedido;
import Entidades.Produto;
import Enumeradores.NomeMateriaPrima;

public class ServicoFachada {
	
	public ServicoFachada(){
		
	}
	
    public Produto cadastrarProduto(String codigo, String nome){
    	ServicoProduto servico = new ServicoProduto();
    	return servico.solicitarCriacaoProduto(codigo,nome);
    	
    }
    
    public Pedido cadastrarPedido(String codigo, Produto produto, int quantidade ){
    	ServicoPedido servico = new ServicoPedido();
    	return servico.solicitarCriacaoPedido(codigo, produto, quantidade);
    }
    public Cliente cadastarCliente(String nome, String cnpj){
    	ServicoCliente servicoCliente = new ServicoCliente();
    	return servicoCliente.solicitarCriacaoCliente(nome, cnpj);
    }
    
    public AgregadorProdutoMateriaPrima associarProdutoMateriaPrima(Produto produto, List<MateriaPrima> materiasPrimas){
    	
    	ServicoProdutoMateriaPrima servicoProdutoMateriaPrima = new ServicoProdutoMateriaPrima();
		return servicoProdutoMateriaPrima.solicitarCriacaoAgregadorProdutoMateriaPrima(materiasPrimas, produto);
    	
    }

	public void cadastrarMateriaPrima(NomeMateriaPrima par) {
		// TODO Auto-generated method stub
		
	}

	public List<Produto> buscarListaProdutos() {
		
		ServicoProduto servicoProduto = new ServicoProduto();
		return servicoProduto.buscarTodos();
	}

	public List<AgregadorProdutoMateriaPrima> buscarListProdutoMateriaPrima() {
		ServicoProdutoMateriaPrima servicoProdutoMateriaPrima = new ServicoProdutoMateriaPrima();
		return servicoProdutoMateriaPrima.buscarTodosProdutosMateriaPrima();
		
	}
}
