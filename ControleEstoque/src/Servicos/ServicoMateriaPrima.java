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

import java.util.List;

import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
>>>>>>> master
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
<<<<<<< HEAD

<<<<<<< HEAD
	public static MateriaPrima solicitarCriacaoMateriaPrima(String tipo, int quantidade) {
		return FabricaMateriaPrima.nova().nova(tipo, quantidade);
	}
}
>>>>>>> origin/Hivison
=======
	public static MateriaPrima solicitarCriacaoMateriaPrima(NomeMateriaPrima nomeMateriaPrima) {
		return FabricaMateriaPrima.nova().nova(nomeMateriaPrima);
=======
	
	public List<MateriaPrima> buscarTodos(){
		return repositorioDeEstoqueMateriaPrima.findAll();
>>>>>>> c47502483a2b819c6dedbfbfc2f01b0655733fbb
	}

}
>>>>>>> master
