package Fabricas;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.OrdemDeServico;

public class FabricaOrdemDeServico extends AbstrataFabrica<FabricaOrdemDeServico> {

	private FabricaOrdemDeServico(){
		
	}
	
	public static FabricaOrdemDeServico nova(){
		return new FabricaOrdemDeServico();
	}
	
	public OrdemDeServico novo(String codigo, int quantidade, AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima){
		return OrdemDeServico.novo(codigo, quantidade, agregadorProdutoMateriaPrima);
	}
}
