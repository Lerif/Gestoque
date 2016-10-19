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
