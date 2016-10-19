<<<<<<< HEAD
<<<<<<< HEAD
package Servicos;

import Entidades.MateriaPrima;
import Fabricas.FabricaMateriaPrima;

public class ServicoMateriaPrima {

	private ServicoMateriaPrima() {
	}

	public static ServicoMateriaPrima novo() {
		return new ServicoMateriaPrima();
	}

	public static MateriaPrima solicitarCriacaoMateriaPrima(String tipo, int quantidade) {
		return FabricaMateriaPrima.nova().nova(tipo, quantidade);
	}
}
=======
package Servicos;

import Entidades.MateriaPrima;
=======
package Servicos;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
>>>>>>> master
import Fabricas.FabricaMateriaPrima;

public class ServicoMateriaPrima {

	private ServicoMateriaPrima() {
	}

	public static ServicoMateriaPrima novo() {
		return new ServicoMateriaPrima();
	}

<<<<<<< HEAD
	public static MateriaPrima solicitarCriacaoMateriaPrima(String tipo, int quantidade) {
		return FabricaMateriaPrima.nova().nova(tipo, quantidade);
	}
}
>>>>>>> origin/Hivison
=======
	public static MateriaPrima solicitarCriacaoMateriaPrima(NomeMateriaPrima nomeMateriaPrima) {
		return FabricaMateriaPrima.nova().nova(nomeMateriaPrima);
	}
}
>>>>>>> master
