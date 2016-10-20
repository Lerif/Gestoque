package Enumeradores;

public enum MinimoMaximoProduto {
	MAX(30), //
	MIN(5); //

	private int quantidade;

	private MinimoMaximoProduto(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeMinimoMaximoProduto() {
		return this.quantidade;
	}

}
