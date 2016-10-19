<<<<<<< HEAD
<<<<<<< HEAD
package Entidades;

public class MateriaPrima {

	private String tipo;
	private int quantidade;

	private MateriaPrima(String tipo, int quantidade) {
		this.tipo = tipo;
		this.quantidade = quantidade;

	}

	public static MateriaPrima nova(String tipo, int quantidade) {
		return new MateriaPrima(tipo, quantidade);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
=======
package Entidades;

public class MateriaPrima {

	private String tipo;
	private int quantidade;

	private MateriaPrima(String tipo, int quantidade) {
		this.tipo = tipo;
		this.quantidade = quantidade;

	}

	public static MateriaPrima nova(String tipo, int quantidade) {
		return new MateriaPrima(tipo, quantidade);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
>>>>>>> origin/Hivison
=======
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
>>>>>>> master
