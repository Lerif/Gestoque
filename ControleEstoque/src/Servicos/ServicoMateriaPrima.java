package Servicos;

import java.util.List;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
import Fabricas.FabricaMateriaPrima;
import Repositorios.RespositorioEstoqueMateriaPrima;

public class ServicoMateriaPrima {

	private RespositorioEstoqueMateriaPrima repositorioDeEstoqueMateriaPrima;
	
	public ServicoMateriaPrima() {
		repositorioDeEstoqueMateriaPrima = new RespositorioEstoqueMateriaPrima();
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
