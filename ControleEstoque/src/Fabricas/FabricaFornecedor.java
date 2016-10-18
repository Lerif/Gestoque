package Fabricas;

import java.util.ArrayList;

import Entidades.Fornecedor;
import Entidades.MateriaPrima;

public class FabricaFornecedor extends AbstrataFabrica<FabricaFornecedor>{

	private FabricaFornecedor() {
		// TODO Auto-generated constructor stub
	}
	
	public static FabricaFornecedor nova(){
		return new FabricaFornecedor();
	}
	
	public Fornecedor novo(String nome, ArrayList<MateriaPrima> listMateriaPrima){
		return Fornecedor.novo(nome, listMateriaPrima);
	}
}
