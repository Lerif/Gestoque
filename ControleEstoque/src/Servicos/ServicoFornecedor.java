package Servicos;

import java.util.ArrayList;
import Entidades.Fornecedor;
import Entidades.MateriaPrima;
import Fabricas.FabricaFornecedor;

public class ServicoFornecedor {

	public ServicoFornecedor() {	
	}

	public Fornecedor solicitarCriacaoFornecedor(String nome, ArrayList<MateriaPrima> listMateriaPrima){
		return FabricaFornecedor.nova().novo(nome, listMateriaPrima);
	}
}
