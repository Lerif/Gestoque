package Servicos;

import Entidades.Cliente;
import Fabricas.FabricaCliente;

public class ServicoCliente {

	public ServicoCliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente solicitarCriacaoCliente(String nome, String cnpj){
		return FabricaCliente.nova().criarCliente(nome, cnpj);
	}
}
