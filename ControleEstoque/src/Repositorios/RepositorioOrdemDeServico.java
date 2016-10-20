package Repositorios;

import java.util.ArrayList;
import java.util.List;

import Entidades.OrdemDeServico;

public class RepositorioOrdemDeServico implements RepositorioGenerico<OrdemDeServico> {

	public static List<OrdemDeServico> ordemDeServicos = new ArrayList<>();

	@Override
	public ArrayList<OrdemDeServico> select(OrdemDeServico ordemDeServico) { //This will smell
		ArrayList<OrdemDeServico> retornoSelect = new ArrayList<>();
		for (OrdemDeServico ordemDeServicoLista : ordemDeServicos) {
			if (ordemDeServicos.contains(ordemDeServico.hashCode())) {
				retornoSelect.add(ordemDeServicoLista);
			} else {
				retornoSelect = null;
			}

		}

		return retornoSelect;
	}

	@Override
	public void insert(OrdemDeServico ordemDeServico) {
		ordemDeServicos.add(ordemDeServico);

	}

	@Override
	public List<OrdemDeServico> findAll() {
		return ordemDeServicos;
	}

}
