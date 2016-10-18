package Entidades;

//import Enumeradores.TipoProduto;

public class Produto {

	private String codigo;
	//private TipoProduto tipo;
	private String nome;

/*	private Produto(String codigo, TipoProduto tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
*/
	private Produto(String codigo,String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	/*
	public static Produto novo(String codigo, TipoProduto tipo) {
		return new Produto(codigo, tipo);
	}
	*/
	
	public static Produto novo(String codigo, String nome){
		return new Produto(codigo, nome);
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
/*
	public TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
*/
	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.codigo != null ? this.codigo.hashCode() : 0);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!Produto.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final Produto other = (Produto) obj;
	    if ((this.codigo == null) ? (other.codigo != null) : !this.codigo.equals(other.codigo)) {
	        return false;
	    }
	    return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
