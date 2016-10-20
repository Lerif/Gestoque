package Entidades;

import Enumeradores.NomeMateriaPrima;

public class MateriaPrima {

	private NomeMateriaPrima nomeMateriaPrima;
	private int quantidadeMateriaPrima;

	private MateriaPrima(NomeMateriaPrima nomeMateriaPrima, int quantidadeMateriaPrima) {
		this.nomeMateriaPrima = nomeMateriaPrima;
		this.quantidadeMateriaPrima = quantidadeMateriaPrima;
	}

	public static MateriaPrima nova(NomeMateriaPrima nomeMateriaPrima, int quantidadeMateriaPrima) {
		return new MateriaPrima(nomeMateriaPrima, quantidadeMateriaPrima);
	}

	public NomeMateriaPrima getNomeMateriaPrima() {
		return nomeMateriaPrima;
	}
	public int getQuantidadeMateriaPrima(){
		return quantidadeMateriaPrima;
	}
	/*public void setQuantidadeMateriaPrima(int quantidadeMateriaPrima){
		this.quantidadeMateriaPrima = quantidadeMateriaPrima;
	}*/

	public void setTipo(NomeMateriaPrima nomeMateriaPrima, int quantidade) {
		this.nomeMateriaPrima = nomeMateriaPrima;
		this.quantidadeMateriaPrima = quantidade;
	}
}