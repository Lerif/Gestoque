package Servicos;

import java.util.List;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.OrdemDeServico;
import Fabricas.FabricaOrdemDeServico;
import Repositorios.RepositorioOrdemDeServico;

public class ServicoOrdemDeServico {
	
	public RepositorioOrdemDeServico repositorioOrdemDeServico = new RepositorioOrdemDeServico();
	
	private ServicoOrdemDeServico(){
		
	}
	
	public static ServicoOrdemDeServico novo(){
		return new ServicoOrdemDeServico();
	}
	
	public OrdemDeServico solicitaCriacaoPedido(String codigo, int quantidade, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima){
		OrdemDeServico ordemDeServico = FabricaOrdemDeServico.nova().novo(codigo, quantidade, agregadorProdutoMateriaPrima);//REFATORAR
		repositorioOrdemDeServico.insert(ordemDeServico);
		return ordemDeServico;
	}
	
	public List<OrdemDeServico> buscarTodos(){
		return repositorioOrdemDeServico.findAll();
	}

}
