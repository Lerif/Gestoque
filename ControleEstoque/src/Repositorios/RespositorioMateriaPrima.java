package Repositorios;

import java.util.ArrayList;

import Entidades.MateriaPrima;

public class RespositorioMateriaPrima implements RepositorioGenerico<MateriaPrima> {

	ArrayList<MateriaPrima> estoqueMateriaPrima = new ArrayList<MateriaPrima>();

	public RespositorioMateriaPrima() {
	}

	public void insert(MateriaPrima materiaPrima) {
		estoqueMateriaPrima.add(materiaPrima);
	}

	public void delete(MateriaPrima materiaPrima) {
		for (MateriaPrima materiaPrimaItem : estoqueMateriaPrima) {
			if (materiaPrima.getNomeMateriaPrima().equals(materiaPrimaItem.getNomeMateriaPrima()))
				estoqueMateriaPrima.remove(materiaPrimaItem);
		}
	}

	public ArrayList<MateriaPrima> select(MateriaPrima materiaPrima) {
		ArrayList<MateriaPrima> listaResposta = new ArrayList<MateriaPrima>();
		for (MateriaPrima materiaPrimaItem : estoqueMateriaPrima) {
			listaResposta.add(materiaPrimaItem);
		}
		return listaResposta;

	}

	public void update(MateriaPrima materiaPrima) {
		for (MateriaPrima materiaPrimaItem : estoqueMateriaPrima) {
			if (materiaPrima.getNomeMateriaPrima().equals(materiaPrimaItem.getNomeMateriaPrima())) {
				estoqueMateriaPrima.remove(materiaPrimaItem);
				estoqueMateriaPrima.add(materiaPrima);
			}
		}

	}

	public ArrayList<MateriaPrima> findAll() {
		return estoqueMateriaPrima;
	}

	public MateriaPrima find(MateriaPrima materiaPrima) {
		for (MateriaPrima materiaPrimaItem : estoqueMateriaPrima) {
			if (materiaPrima.getNomeMateriaPrima().equals(materiaPrimaItem.getNomeMateriaPrima())) {
				return materiaPrimaItem;
			}
		}
		return null;
	}
}
