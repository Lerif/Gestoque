package Teste;

import java.util.ArrayList;

import Entidades.Cliente;
import Entidades.Fornecedor;
import Entidades.MateriaPrima;
import Entidades.Produto;
<<<<<<< 281f4550e2e059379563f0afb73b7334a9c97a19
import Enumeradores.NomeMateriaPrima;
import Enumeradores.TipoProduto;
=======
//import Enumeradores.TipoProduto;
>>>>>>> Código com interface refatorada 1.2
import Interface.InterfaceMenuGeral;
import Repositorios.RepositorioCliente;
import Repositorios.RepositorioEstoqueProduto;
import Repositorios.RespositorioEstoqueMateriaPrima;
import Servicos.ServicoCliente;
import Servicos.ServicoFornecedor;
import Servicos.ServicoMateriaPrima;
import Servicos.ServicoProduto;

public class ControleEstoqueTeste {

	public ControleEstoqueTeste() {
	}

	public static void main(String[] args) {
<<<<<<< 281f4550e2e059379563f0afb73b7334a9c97a19

		testarEstoqueMateriaPrima();

		 InterfaceMenuGeral intefaceDeMenu = new InterfaceMenuGeral();
		 InterfaceMenuGeral.main(args);
	}

	private static Cliente testaCriacaoCliente() {
		System.out.println("TESTE CRIACAO DE CLIENTE:");
=======
		
		InterfaceMenuGeral.main(args);
		
		// testaCriacaoCliente();
		// testarMateriaPrima();
		// testaCriacaoFornecedor();
		// testarCricaoProduto();
		// testarEstoqueProduto();
		// testarSelectEstoqueProduto();
		// testarInsertCliente();
		// testarMateriaPrima();
		// testarEstoqueMateriaPrima();
	}

	private static Cliente testaCriacaoCliente() {
		System.out.println("TESTE CRIAÇÃO DE CLIENTE:");
>>>>>>> Código com interface refatorada 1.2
		ServicoCliente servicoCliente = new ServicoCliente();
		Cliente clienteTeste = servicoCliente.solicitarCriacaoCliente("ERNESTO", "1234");
		System.out.println("Nome: " + clienteTeste.getNome());
		System.out.println("Cnpj: " + clienteTeste.getCnpj());
		return clienteTeste;
	}

	private static void testarMateriaPrima() {
		ServicoMateriaPrima servicoMateriaPrima = new ServicoMateriaPrima();

		System.out.println("\nTESTE CRIA��O DE MATERIA PRIMA:");
		MateriaPrima parafuso = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.ARR);
		System.out.println("Materia Prima: " + parafuso.getNomeMateriaPrima().getNome());
	}

	private static void testaCriacaoFornecedor() {
		System.out.println("\nTESTE CRIA��O DE FORNECEDOR:");
		ServicoFornecedor servicoFornecedor = new ServicoFornecedor();
		ServicoMateriaPrima servicoMateriaPrima = new ServicoMateriaPrima();

		MateriaPrima parafuso = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PAR);
		MateriaPrima prego = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PRC);
		ArrayList<MateriaPrima> listMateriaPrima = new ArrayList<MateriaPrima>();
		listMateriaPrima.add(parafuso);
		listMateriaPrima.add(prego);
		Fornecedor fornecedor = servicoFornecedor.solicitarCriacaoFornecedor("Gustavo", listMateriaPrima);
		System.out.println("Nome Fornecedor: " + fornecedor.getNome());
		for (MateriaPrima materiaPrima : listMateriaPrima) {
			System.out.println("Materia Prima: " + materiaPrima.getNomeMateriaPrima().getNome());
		}
	}

	private static void testarCricaoProduto() {
		System.out.println("\nTESTE CRIA��O DE PRODUTO:");
		ServicoProduto servicoProduto = ServicoProduto.novo();
		// Produto produto = servicoProduto.solicitarCriacaoProduto("1020",
		// TipoProduto.AL);
		Produto produto = servicoProduto.solicitarCriacaoProduto("1020", "Reboque redondo");
		// System.out.println("Tipo: " + produto.getTipo().getTipo());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Codigo: " + produto.getCodigo());
	}

	private static void testarEstoqueProduto() {
		System.out.println("\nTESTE INSERT EM ESTOQUE DE PRODUTO:");
		ServicoProduto servicoProduto = ServicoProduto.novo();
		RepositorioEstoqueProduto repositorioEstoqueProduto = new RepositorioEstoqueProduto();
		for (int i = 1; i <= 10; i++) {
			Produto produto = servicoProduto.solicitarCriacaoProduto("1020", "Reboque Redondo");
			repositorioEstoqueProduto.insert(produto);
		}

		int i = 1;
		for (Produto produto : repositorioEstoqueProduto.estoqueProduto) {
			System.out.println("Produto " + i);
			System.out.println("Codigo produto em estoque: " + produto.getCodigo());
			System.out.println("Tipo produto em estoque " + produto.getNome());
			i++;
			System.out.println("\n");
		}
	}

	private static void testarSelectEstoqueProduto() {
		System.out.println("TESTE SELECT EM ESTOQUE DE PRODUTO:");
		RepositorioEstoqueProduto repositorioEstoqueProduto = new RepositorioEstoqueProduto();
		ServicoProduto servicoProduto = ServicoProduto.novo();
		ArrayList<Produto> retornoSelect = new ArrayList<Produto>();
		Produto produto = null;
		for (int i = 1; i <= 10; i++) {
			produto = servicoProduto.solicitarCriacaoProduto(Integer.toString(i), "Alumínio" + i);
			repositorioEstoqueProduto.insert(produto);
		}
		Produto produto_ = servicoProduto.solicitarCriacaoProduto("2000", "Ferro");
		retornoSelect = repositorioEstoqueProduto.select(produto);
		if (retornoSelect != null) {
			for (Produto retornoProduto : retornoSelect) {
				System.out.println("Produto encontrado!");
			}
		} else {
			System.out.println("Produto n�o encontrado!");
		}
	}

	public static void testarInsertCliente() {
		System.out.println("\nTESTE INSERT CLIENTE:");
		RepositorioCliente repositorioCliente = new RepositorioCliente();
		ServicoCliente servicoCliente = new ServicoCliente();
		Cliente clienteTeste = servicoCliente.solicitarCriacaoCliente("THALES", "3216");
		repositorioCliente.insert(clienteTeste);
		System.out.println(repositorioCliente.findAll().get(0).getNome());
		System.out.println(repositorioCliente.findAll().get(0).getCnpj());
	}

	public static void testarEstoqueMateriaPrima() {

		ServicoMateriaPrima servicoMateriaPrima = new ServicoMateriaPrima();

		MateriaPrima mp1 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.ARR);
		MateriaPrima mp2 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CAL);
		MateriaPrima mp3 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CPA);
		MateriaPrima mp4 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PAR);
		MateriaPrima mp5 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PRC);

		// teste de insert
		RespositorioEstoqueMateriaPrima repositorioEstoqueMateriaPrima = new RespositorioEstoqueMateriaPrima();
		repositorioEstoqueMateriaPrima.insert(mp1);
		repositorioEstoqueMateriaPrima.insert(mp2);
		repositorioEstoqueMateriaPrima.insert(mp3);
		repositorioEstoqueMateriaPrima.insert(mp4);
		repositorioEstoqueMateriaPrima.insert(mp5);

		// teste de findAll
		ArrayList<MateriaPrima> materiasPrimas = repositorioEstoqueMateriaPrima.findAll();
		for (MateriaPrima materiasPrima : materiasPrimas) {
			System.out.println(materiasPrima.getNomeMateriaPrima().getNome());
		}

		// teste find
		MateriaPrima materiaPrima = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CAL);
		repositorioEstoqueMateriaPrima.insert(materiaPrima);
		System.out.println(repositorioEstoqueMateriaPrima.find(materiaPrima).getNomeMateriaPrima().getNome());

	}

}
