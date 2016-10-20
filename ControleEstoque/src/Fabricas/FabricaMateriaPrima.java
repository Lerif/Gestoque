package Fabricas;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;

public class FabricaMateriaPrima extends AbstrataFabrica<FabricaMateriaPrima> {

	private FabricaMateriaPrima() {
	}

	public static FabricaMateriaPrima nova() {
		return new FabricaMateriaPrima();
	}

	public MateriaPrima nova(NomeMateriaPrima nomeMateriaPrima,int quantidadeMateriaPrima) {
		return MateriaPrima.nova(nomeMateriaPrima,quantidadeMateriaPrima);
	}
}