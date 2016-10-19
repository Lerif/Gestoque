package Servicos;

import Entidades.Cliente;
import Entidades.Produto;
import Fabricas.FabricaCliente;
import Fabricas.FabricaProduto;
import Repositorios.RepositorioCliente;

public class ServicoCliente {

	RepositorioCliente repositorioCLiente = new RepositorioCliente();
	public ServicoCliente() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Cliente solicitarCriacaoCliente(String nome, String cnpj){
		Cliente cliente = FabricaCliente.nova().criarCliente(nome,cnpj);
		 repositorioCLiente.insert(cliente);
		 return cliente;
	}
	
	
	}

=======
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