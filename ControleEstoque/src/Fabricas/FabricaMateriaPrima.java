<<<<<<< HEAD
<<<<<<< HEAD
package Fabricas;

import Entidades.MateriaPrima;

public class FabricaMateriaPrima extends AbstrataFabrica<FabricaMateriaPrima> {

	private FabricaMateriaPrima() {
	}

	public static FabricaMateriaPrima nova() {
		return new FabricaMateriaPrima();
	}

	public MateriaPrima nova(String tipo, int quantidade) {
		return MateriaPrima.nova(tipo, quantidade);
	}
}
=======
package Fabricas;

import Entidades.MateriaPrima;
=======
package Fabricas;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
>>>>>>> master

public class FabricaMateriaPrima extends AbstrataFabrica<FabricaMateriaPrima> {

	private FabricaMateriaPrima() {
	}

	public static FabricaMateriaPrima nova() {
		return new FabricaMateriaPrima();
	}

<<<<<<< HEAD
	public MateriaPrima nova(String tipo, int quantidade) {
		return MateriaPrima.nova(tipo, quantidade);
	}
}
>>>>>>> origin/Hivison
=======
	public MateriaPrima nova(NomeMateriaPrima nomeMateriaPrima) {
		return MateriaPrima.nova(nomeMateriaPrima);
	}
}
>>>>>>> master
