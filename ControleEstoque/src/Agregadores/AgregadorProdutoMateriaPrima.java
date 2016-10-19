<<<<<<< HEAD
<<<<<<< HEAD
package Agregadores;

public class AgregadorProdutoMateriaPrima {

	int quantidade;
	
	public AgregadorProdutoMateriaPrima(int quantidade) {
		this.quantidade = quantidade;
	}
}
=======
package Agregadores;

public class AgregadorProdutoMateriaPrima {

	public AgregadorProdutoMateriaPrima() {
		// TODO Auto-generated constructor stub
		
		
		
		}
	}

>>>>>>> origin/Hivison
=======
package Agregadores;

import java.util.List;

import Entidades.MateriaPrima;
import Entidades.Produto;
import Repositorios.RepositorioAgregadorProdutoMateriaPrima;

public class AgregadorProdutoMateriaPrima {

	RepositorioAgregadorProdutoMateriaPrima repositorioProdutoMateria;
	
	
	public AgregadorProdutoMateriaPrima(int quantidade) {
		repositorioProdutoMateria = new RepositorioAgregadorProdutoMateriaPrima();
	}
	
	public void agregarProdutoEMateriaPrima(Produto produto, List<MateriaPrima> listaDeMateriasPrimas){
		repositorioProdutoMateria.inserir(produto, listaDeMateriasPrimas);
	}
	
}

>>>>>>> master
