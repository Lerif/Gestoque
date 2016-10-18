package Servicos;

import Entidades.Cliente;
import Entidades.Pedido;
import Entidades.Produto;

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
}
