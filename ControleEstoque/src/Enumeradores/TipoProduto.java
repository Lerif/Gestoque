package Enumeradores;

public enum TipoProduto {

	AL("Aluminio", 200.00), FR("Ferro", 100.00), CR("Cromado", 150.00);

	private double preco;
	private String tipo;

	private TipoProduto(String tipo, Double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
