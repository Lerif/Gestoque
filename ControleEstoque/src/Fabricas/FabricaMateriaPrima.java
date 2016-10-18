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
