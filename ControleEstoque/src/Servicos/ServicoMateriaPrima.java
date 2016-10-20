package Servicos;

import java.util.List;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
import Fabricas.FabricaMateriaPrima;
import Repositorios.RespositorioMateriaPrima;

public class ServicoMateriaPrima {

	private RespositorioMateriaPrima repositorioDeEstoqueMateriaPrima;
	
	public ServicoMateriaPrima() {
		repositorioDeEstoqueMateriaPrima = new RespositorioMateriaPrima();
	}

	public MateriaPrima solicitarCriacaoMateriaPrima(NomeMateriaPrima nomeMateriaPrima) {
		MateriaPrima nova = FabricaMateriaPrima.nova().nova(nomeMateriaPrima);
		repositorioDeEstoqueMateriaPrima.insert(nova);
		return nova;
	}
	
	public List<MateriaPrima> buscarTodos(){
		return repositorioDeEstoqueMateriaPrima.findAll();
	}

}
