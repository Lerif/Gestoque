package Servicos;

import java.util.ArrayList;
import java.util.List;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.OrdemDeServico;
import Fabricas.FabricaOrdemDeServico;
import Repositorios.RepositorioOrdemDeServico;

public class ServicoOrdemDeServico {
	
	public RepositorioOrdemDeServico repositorioOrdemDeServico = new RepositorioOrdemDeServico();
	private boolean flagProduzido = false;
	
	public boolean isFlagProduzido() {
		return flagProduzido;
	}

	public void setFlagProduzido(boolean flagProduzido) {
		this.flagProduzido = flagProduzido;
	}

	private ServicoOrdemDeServico(){
		
	}
	
	public static ServicoOrdemDeServico novo(){
		return new ServicoOrdemDeServico();
	}
	
	public OrdemDeServico solicitarOrdemDeServico(String codigo, int quantidade, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima){
		OrdemDeServico ordemDeServico = FabricaOrdemDeServico.nova().novo(codigo, quantidade, agregadorProdutoMateriaPrima);//REFATORAR
		repositorioOrdemDeServico.insert(ordemDeServico);
		return ordemDeServico;
	}
	
	public List<OrdemDeServico> buscarTodos(){
		return repositorioOrdemDeServico.findAll();
	}

	public Object[] arrayStringFromOrdemDeServico() {
		
		List<String> stringOrdemDeServico = new ArrayList<>();
		
		for (OrdemDeServico ordemDeServico : this.buscarTodos()) {
			stringOrdemDeServico.add(ordemDeServico.toString());
		}
		
		return (Object[]) stringOrdemDeServico.toArray();
	}

}
