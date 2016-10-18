package Entidades;

public class Pedido {

	private String codigo;
	private Produto produto;
	private int quantidade;


private Pedido(String codigo, Produto produto, int quantidade){
	this.codigo = codigo;
	this.produto = produto;
	this.quantidade = quantidade;
}

public static Pedido novo(String codigo, Produto produto,int quantidade){
	return new Pedido(codigo,produto,quantidade);
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public Produto getProduto() {
	return produto;
}

public void setProduto(Produto produto) {
	this.produto = produto;
}
public int getQnt() {
	return quantidade;
}

public void setQnt(int quantidade) {
	this.quantidade = quantidade;
}

}