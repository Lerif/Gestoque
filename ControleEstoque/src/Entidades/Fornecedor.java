package Entidades;

import java.util.ArrayList;

public class Fornecedor{
	private String nome;
	private ArrayList<MateriaPrima> listMateriaPrima;

	
	private Fornecedor(String nome, ArrayList<MateriaPrima> listMateriaPrima) {
		this.setNome(nome);
		this.setListMateriaPrima(listMateriaPrima);
	}
	
	public static Fornecedor novo(String nome, ArrayList<MateriaPrima> listMateriaPrima){
		return new Fornecedor(nome, listMateriaPrima);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<MateriaPrima> getListMateriaPrima() {
		return listMateriaPrima;
	}

	public void setListMateriaPrima(ArrayList<MateriaPrima> listMateriaPrima) {
		this.listMateriaPrima = listMateriaPrima;
	}
}
