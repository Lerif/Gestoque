<<<<<<< HEAD
<<<<<<< HEAD
package Fabricas;

import Entidades.Produto;
//import Enumeradores.TipoProduto;

public class FabricaProduto extends AbstrataFabrica<FabricaProduto>{

	private FabricaProduto() {
		// TODO Auto-generated constructor stub
	}
	
	public static FabricaProduto nova(){
		return new FabricaProduto();
	}

/*	public Produto novo(String codigo, TipoProduto tipo){
		return Produto.novo(codigo, tipo);
	}
	*/
	public Produto novo(String codigo, String nome){
		return Produto.novo(codigo, nome);
	}
}
=======
package Fabricas;

import Entidades.Produto;
//import Enumeradores.TipoProduto;
=======
package Fabricas;

import Entidades.Produto;
>>>>>>> master

public class FabricaProduto extends AbstrataFabrica<FabricaProduto>{

	private FabricaProduto() {
		// TODO Auto-generated constructor stub
	}
	
	public static FabricaProduto nova(){
		return new FabricaProduto();
	}

<<<<<<< HEAD
/*	public Produto novo(String codigo, TipoProduto tipo){
		return Produto.novo(codigo, tipo);
	}
	*/
	public Produto novo(String codigo, String nome){
		return Produto.novo(codigo, nome);
	}
}
>>>>>>> origin/Hivison
=======
	public Produto novo(String codigo, String nome){
		return Produto.novo(codigo, nome);
	}
}
>>>>>>> master
