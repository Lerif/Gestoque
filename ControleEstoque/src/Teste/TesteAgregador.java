package Teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.MateriaPrima;
import Entidades.Produto;
import Enumeradores.NomeMateriaPrima;
import Repositorios.RepositorioEstoqueProduto;
import Servicos.ServicoProdutoMateriaPrima;
import Servicos.ServicoMateriaPrima;
import Servicos.ServicoProduto;

public class TesteAgregador {

	@Test
	public void test_solicitarCriacaoProduto() {
		
		ServicoMateriaPrima servicoMateriaPrima = new ServicoMateriaPrima();
		
		//MateriaPrima materiaPrima1 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.ARR);
		//MateriaPrima materiaPrima2 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CAL);
		//MateriaPrima materiaPrima3 = servicoMateriaPrima.solicitarCriacaoMateriaPrima(NomeMateriaPrima.CPA);
		
		List<MateriaPrima> buscarTodos = servicoMateriaPrima.buscarTodos();
		
		ServicoProduto servicoProduto = new ServicoProduto();
		Produto produto = servicoProduto.solicitarCriacaoProduto("123", "Aluminio");
		assert (produto.getCodigo().equals("123"));
		assert (produto.getNome().equals("Aluminio"));
		
		
		ServicoProdutoMateriaPrima servicoProdutoMateriaPrima = new ServicoProdutoMateriaPrima();
		AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima = servicoProdutoMateriaPrima.solicitarCriacaoAgregadorProdutoMateriaPrima(buscarTodos, produto);
		System.out.println(agregadorProdutoMateriaPrima);
		
		List<MateriaPrima> buscarPorProduto = servicoProdutoMateriaPrima.buscarPorProduto(produto);
		
		assertTrue(!buscarPorProduto.isEmpty());
			for (MateriaPrima materiaPrima : buscarPorProduto) {
				System.out.println(materiaPrima.getNomeMateriaPrima().getNome());
			}
		

	}

}
