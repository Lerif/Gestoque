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
