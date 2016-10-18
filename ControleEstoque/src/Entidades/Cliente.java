package Entidades;

public class Cliente {

	private String nome;
	private String cnpj;
	
	private Cliente(String nome,String cnpj) {
      this.setNome(nome);
      this.setCnpj(cnpj);		
	}

	public static Cliente novo(String nome,String cnpj){
		return new Cliente(nome,cnpj);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
