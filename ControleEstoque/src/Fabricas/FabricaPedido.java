package Fabricas;

import Entidades.Pedido;
//import Enumeradores.TipoProduto;
import Entidades.Produto;

public class FabricaPedido extends AbstrataFabrica<FabricaProduto>{

	private FabricaPedido() {
		
	}
	
	public static FabricaPedido nova(){
		return new FabricaPedido();
	}


	public Pedido novo(String codigo, Produto produto, int quantidade){
		return Pedido.novo(codigo, produto, quantidade);
	}
}
