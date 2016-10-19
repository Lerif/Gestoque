package Servicos;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
import Fabricas.FabricaMateriaPrima;

public class ServicoMateriaPrima {

	private ServicoMateriaPrima() {
	}

	public static ServicoMateriaPrima novo() {
		return new ServicoMateriaPrima();
	}

	public static MateriaPrima solicitarCriacaoMateriaPrima(NomeMateriaPrima nomeMateriaPrima) {
		return FabricaMateriaPrima.nova().nova(nomeMateriaPrima);
	}
}
