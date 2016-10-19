package Entidades;

import Enumeradores.NomeMateriaPrima;

public class MateriaPrima {

	private NomeMateriaPrima nomeMateriaPrima;
	
	private MateriaPrima(NomeMateriaPrima nomeMateriaPrima) {
		this.nomeMateriaPrima = nomeMateriaPrima;
	}

	public static MateriaPrima nova(NomeMateriaPrima nomeMateriaPrima) {
		return new MateriaPrima(nomeMateriaPrima);
	}

	public NomeMateriaPrima getNomeMateriaPrima() {
		return nomeMateriaPrima;
	}

	public void setTipo(NomeMateriaPrima nomeMateriaPrima) {
		this.nomeMateriaPrima = nomeMateriaPrima;
	}
	
	
}
