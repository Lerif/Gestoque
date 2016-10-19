package Fabricas;

import Enumeradores.NomeMateriaPrima;

public class FabricaMateriaPrima extends AbstrataFabrica<FabricaMateriaPrima> {

	private FabricaMateriaPrima() {
	}

	public static FabricaMateriaPrima nova() {
		return new FabricaMateriaPrima();
	}

	public MateriaPrima nova(NomeMateriaPrima nomeMateriaPrima) {
		return MateriaPrima.nova(nomeMateriaPrima);
	}
}
