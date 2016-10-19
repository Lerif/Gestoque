package Teste;

import java.util.ArrayList;

import Entidades.Cliente;
import Entidades.Fornecedor;
import Entidades.MateriaPrima;
import Entidades.Produto;
import Enumeradores.NomeMateriaPrima;
import Enumeradores.TipoProduto;
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
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		InterfaceMenuGeral intefaceDeMenu = new InterfaceMenuGeral();
		intefaceDeMenu.main(args);
	}

	private static Cliente testaCriacaoCliente() {
		System.out.println("TESTE CRIA��O DE CLIENTE:");
		ServicoCliente servicoCliente = new ServicoCliente();
		Cliente clienteTeste = servicoCliente.solicitarCriacaoCliente("ERNESTO", "1234");
		System.out.println("Nome: " + clienteTeste.getNome());
		System.out.println("Cnpj: " + clienteTeste.getCnpj());
		return clienteTeste;
	}

	private static void testarMateriaPrima() {
		System.out.println("\nTESTE CRIA��O DE MATERIA PRIMA:");
		MateriaPrima parafuso = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CAL);
		System.out.println("Nome Materia Prima: " + parafuso.getNomeMateriaPrima());
	}

	private static void testaCriacaoFornecedor() {
		System.out.println("\nTESTE CRIA��O DE FORNECEDOR:");
		ServicoFornecedor servicoFornecedor = new ServicoFornecedor();
		MateriaPrima parafuso = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PAR);
		MateriaPrima prego = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PRC);
		ArrayList<MateriaPrima> listMateriaPrima = new ArrayList<MateriaPrima>();
		listMateriaPrima.add(parafuso);
		listMateriaPrima.add(prego);
		Fornecedor fornecedor = servicoFornecedor.solicitarCriacaoFornecedor("Gustavo", listMateriaPrima);
		System.out.println("Nome Fornecedor: " + fornecedor.getNome());
		for (MateriaPrima materiaPrima : listMateriaPrima) {
			System.out.println("Materia Prima: " + materiaPrima.getNomeMateriaPrima());
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
		MateriaPrima mp1 = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.ARR);
		MateriaPrima mp2 = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CAL);
		MateriaPrima mp3 = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CPA);
		MateriaPrima mp4 = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PAR);
		MateriaPrima mp5 = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.PRC);

		// Teste insert
		RespositorioEstoqueMateriaPrima repositorioMateriaPrima = new RespositorioEstoqueMateriaPrima();
		repositorioMateriaPrima.insert(mp1);
		repositorioMateriaPrima.insert(mp2);
		repositorioMateriaPrima.insert(mp3);
		repositorioMateriaPrima.insert(mp4);
		repositorioMateriaPrima.insert(mp5);

		// Teste findAll
		ArrayList<MateriaPrima> materiasPrima = repositorioMateriaPrima.findAll();
		for (MateriaPrima materiaPrima : materiasPrima) {
			System.out.println(materiaPrima.getNomeMateriaPrima().getNome());
		}

		// Teste find
		MateriaPrima materiaPrima = ServicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.ARR);
		repositorioMateriaPrima.insert(materiaPrima);
		System.out.println(repositorioMateriaPrima.find(materiaPrima).getNomeMateriaPrima());

	}

}
