package Interface;

import java.awt.Dimension;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import Agregadores.AgregadorProdutoMateriaPrima;
import javax.swing.JCheckBox;

import Entidades.Cliente;
import Entidades.MateriaPrima;
import Entidades.Produto;
import Enumeradores.NomeMateriaPrima;
import Servicos.ServicoFachada;

public class InterfaceMenuGeral extends JFrame {

	static ServicoFachada servicoFachada = new ServicoFachada();

	public InterfaceMenuGeral() {

		initUI();
	}

	public void iniciarInterface() {
		initUI();
	}

	private void initUI() {

		createMenuBar();

		setTitle("Gestoque");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createMenuBar() {

		JMenuBar menubar = new JMenuBar();

		JMenu FuncionalidadeMenu = new JMenu("Funcionalidades");

		JMenu CadastroMenu = new JMenu("Cadastro");
		JMenuItem CadastroCliente = new JMenuItem("Cadastrar Cliente");

		CadastroCliente.addActionListener((ActionEvent event) -> {
			interfaceCadastroCliente();
		});

		JMenuItem CadastroFornecedor = new JMenuItem("Cadastrar Fornecedor");

		CadastroFornecedor.addActionListener((ActionEvent event) -> {
			interfaceCadastroFornecedor();
		});

		JMenuItem CadastroMatPrima = new JMenuItem("Cadastrar Matéria Prima");

		CadastroMatPrima.addActionListener((ActionEvent event) -> {
			interfaceCadastroMatPrima();
		});

		JMenuItem CadastroProduto = new JMenuItem("Cadastrar Produto");

		CadastroProduto.addActionListener((ActionEvent event) -> {
			interfaceCadastroProduto();
		});

		JMenuItem CadastroPedido = new JMenuItem("Cadastrar Pedido");

		CadastroPedido.addActionListener((ActionEvent event) -> {
			interfaceCadastroPedido();
		});

		JMenuItem CadastroOrdemServico = new JMenuItem("Cadastrar Ordem de serviço");

		CadastroOrdemServico.addActionListener((ActionEvent event) -> {
			interfaceCadastroOrdemServico();
		});

		CadastroMenu.add(CadastroCliente);
		CadastroMenu.add(CadastroFornecedor);
		CadastroMenu.add(CadastroMatPrima);
		CadastroMenu.add(CadastroProduto);
		CadastroMenu.add(CadastroPedido);
		CadastroMenu.add(CadastroOrdemServico);

		JMenu FabricaMenu = new JMenu("Usuário - Fábrica");
		JMenuItem SaidaProdutoMi = new JMenuItem("Gerar saída de Produto");
		JMenuItem ListarAndamentoProducao = new JMenuItem("Listar andamento da produção");
		JMenuItem ListarInsumosProduto = new JMenuItem("Listar insumos do produto");
		JMenuItem ProduzirOrdemServico = new JMenuItem("Produzir Ordem de Servico");

		ProduzirOrdemServico.addActionListener((ActionEvent event) -> {
			interfaceProduzirOrdemServico();
		});

		ListarInsumosProduto.addActionListener((ActionEvent event) -> {
			interfaceListarInsumosProduto();
		});

		JMenuItem ListarPedidos = new JMenuItem("Listar pedidos");
		JMenuItem CadastrarProdutoNovo = new JMenuItem("Cadastrar produto novo");

		FabricaMenu.add(SaidaProdutoMi);
		FabricaMenu.add(ListarAndamentoProducao);
		FabricaMenu.add(ListarInsumosProduto);
		FabricaMenu.add(ListarPedidos);
		FabricaMenu.add(CadastrarProdutoNovo);
		FabricaMenu.add(ProduzirOrdemServico);

		JMenu AlmoxarifadoMenu = new JMenu("Usuário - Almoxarifado");
		JMenuItem CadastrarEntradaInsumo = new JMenuItem("Cadastrar Entrada de insumos");
		AlmoxarifadoMenu.add(CadastrarEntradaInsumo);

		JMenu AdministrativoMenu = new JMenu("Usuário - Administrativo");

		JMenuItem ListarMaxMinEstoque = new JMenuItem("Listar Máximos/Mínimos do Estoque");
		JMenuItem ListarQtdProdutosProduzidos = new JMenuItem("Listar quantidade de produtos produzidos");

		ListarQtdProdutosProduzidos.addActionListener((ActionEvent event) -> {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Leleo");
		});

		JMenuItem ListarQtdInsumosConsumidos = new JMenuItem("Listar quantidade de insumos consumidos");

		ListarQtdInsumosConsumidos.addActionListener((ActionEvent event) -> {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Leleo");
		});

		JMenuItem ListarPedidoCliente = new JMenuItem("Listar pedidos cliente");
		JMenuItem ListarAndamentoPedido = new JMenuItem("Listar andamento do pedido");

		AdministrativoMenu.add(ListarMaxMinEstoque);

		ListarMaxMinEstoque.addActionListener((ActionEvent event) -> {
			JFrame frame = new JFrame();
			JOptionPane.showMessageDialog(frame, "Leleo");
		});

		AdministrativoMenu.add(ListarQtdProdutosProduzidos);
		AdministrativoMenu.add(ListarQtdInsumosConsumidos);
		AdministrativoMenu.add(ListarPedidoCliente);
		AdministrativoMenu.add(ListarAndamentoPedido);

		JMenuItem FabricaSubMenu = new JMenuItem("Usuário - Fábrica");
		JMenuItem AlmoxarifadoMi = new JMenuItem("Usuário - Almoxarifado");
		JMenuItem AdministrativoMi = new JMenuItem("Usuário - Administrativo");

		JMenu SairMenu = new JMenu("Sair");
		SairMenu.addActionListener((ActionEvent event) -> {
			// this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		});

		FuncionalidadeMenu.add(FabricaMenu);
		FuncionalidadeMenu.add(AlmoxarifadoMenu);
		FuncionalidadeMenu.add(AdministrativoMenu);
		FuncionalidadeMenu.add(SairMenu);

		menubar.add(CadastroMenu);
		menubar.add(FuncionalidadeMenu);
		menubar.add(Box.createHorizontalGlue());
		menubar.add(SairMenu);

		setJMenuBar(menubar);
	}

	private void interfaceProduzirOrdemServico() {

		JFrame frame = new JFrame("Gestoque - Ordem de serviço");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("Codigo da OS");
		JLabel labelQuantidade = new JLabel("Quantidade");
		JLabel labelProduto = new JLabel("Produto");
		JButton botaoConcluir = new JButton("Concluir OS");
		JButton botaoBuscarItens = new JButton("Buscar itens OS");
		JButton botaoCancelar = new JButton("Cancelar");
		JTextField textCodigo = new JTextField();
		JTextField textQuantidade = new JTextField();
		JTextField textProduto = new JTextField();

		JList list = new JList(servicoFachada.buscarArrayDeOrdemDeServicoToString());
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollableList = new JScrollPane(list);

		panel.add(scrollableList);

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		textCodigo.setPreferredSize(new Dimension(100, 20));
		panel.add(textCodigo);

		labelQuantidade.setHorizontalAlignment(0);
		panel.add(labelQuantidade);
		textQuantidade.setPreferredSize(new Dimension(100, 20));
		panel.add(textQuantidade);

		labelProduto.setHorizontalAlignment(0);
		panel.add(labelProduto);
		textProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(textProduto);

		panel.add(botaoConcluir);
		frame.setSize(500, 200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoBuscarItens);
		frame.setSize(500, 200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoCancelar);
		frame.setSize(500, 200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// salvar no estoque
			}
		});

		botaoBuscarItens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// colocar produto e quantidade nos JtextField;
			}
		});

		botaoBuscarItens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// limpar o textfield;
			}
		});

	}

	private void interfaceCadastroOrdemServico() {

		JFrame frame = new JFrame("Gestoque - Ordem de serviço");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelQuantidade = new JLabel("Quantidade");
		final JTextField idOrdemServico = new JTextField();
		final JTextField quantidadeProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");

		JList list = new JList(servicoFachada.buscarArrayDeProdutosToString());
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollableList = new JScrollPane(list);

		labelQuantidade.setHorizontalAlignment(0);
		panel.add(labelQuantidade);
		quantidadeProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(quantidadeProduto);

		panel.add(scrollableList);
		panel.add(botaoCadastrar);
		frame.setSize(500, 200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		// panel.add(botaoBuscarProduto);
		frame.setSize(500, 200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] token = list.getSelectedValue().toString().split("-");
				servicoFachada.cadastrarOrdemDeServico(idOrdemServico.getText(), token[0].trim(),
						Integer.parseInt(quantidadeProduto.getText()));

			}
		});

	}

	private void interfaceListarInsumosProduto() {

		List<AgregadorProdutoMateriaPrima> produtosMateriasPrimas = servicoFachada.buscarListProdutoMateriaPrima();

		StringBuilder mostrarNaTela = new StringBuilder();

		for (AgregadorProdutoMateriaPrima produtoMateriaPrima : produtosMateriasPrimas) {

			mostrarNaTela.append(" \n" + produtoMateriaPrima.produto().getCodigo() + " - "
					+ produtoMateriaPrima.produto().getNome() + " \n");

			for (MateriaPrima materiaPrima : produtoMateriaPrima.materiasPrimas()) {

				mostrarNaTela.append("    � " + materiaPrima.getNomeMateriaPrima().getNome() + "\n");

			}

		}
		JFrame frame = new JFrame("Gestoque - Listagem de insumos");
		JOptionPane.showMessageDialog(frame, mostrarNaTela.toString());
		// System.out.println(mostrarNaTela.toString());
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			InterfaceMenuGeral ex = new InterfaceMenuGeral();
			ex.setVisible(true);
		});
	}

	// criar interface cadastro cliente;
	public static void interfaceCadastroCliente() {
		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("Nome");
		JLabel labelNome = new JLabel("CPF ");
		final JTextField NomeCliente = new JTextField();
		final JTextField CPFCliente = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		NomeCliente.setPreferredSize(new Dimension(100, 20));
		panel.add(NomeCliente);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		CPFCliente.setPreferredSize(new Dimension(100, 20));
		panel.add(CPFCliente);

		panel.add(botaoCadastrar);
		frame.setSize(300, 100);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoCancelar);
		frame.setSize(300, 100);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List <Cliente> clientes = new ArrayList<>();
				clientes.add(Cliente.novo(NomeCliente.getText(), CPFCliente.getText()));
				
				
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NomeCliente.setText("");
				CPFCliente.setText("");

			}
		});
	}

	// criar interfaceCadastraPedido;
	public static void interfaceCadastroPedido() {

		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("ID:");
		JLabel labelNome = new JLabel("Nome:");
		JLabel labelCodigo = new JLabel("Código:");
		JLabel labelQuantidade = new JLabel("Quantidade:");
		final JTextField idDoPedido = new JTextField();
		final JTextField NomeDoProduto = new JTextField();
		final JTextField CodigoDoProduto = new JTextField();
		final JTextField QuantidadeDoProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		idDoPedido.setPreferredSize(new Dimension(100, 20));
		panel.add(idDoPedido);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		NomeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(NomeDoProduto);

		labelCodigo.setHorizontalAlignment(0);
		panel.add(labelCodigo);
		CodigoDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(CodigoDoProduto);

		labelQuantidade.setHorizontalAlignment(0);
		panel.add(labelQuantidade);
		QuantidadeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(QuantidadeDoProduto);

		panel.add(botaoCadastrar);
		frame.setSize(300, 300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoCancelar);
		frame.setSize(300, 300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("id: " + idDoPedido.getText());
				System.out.println("produto: " + CodigoDoProduto.getText());
				System.out.println("produto: " + NomeDoProduto.getText());
				System.out.println("produto: " + QuantidadeDoProduto.getText());

			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idDoPedido.setText("");
				NomeDoProduto.setText("");
				QuantidadeDoProduto.setText("");
				CodigoDoProduto.setText("");
			}
		});
	}

	// criar interface cadastro produto;
	public static void interfaceCadastroProduto() {

		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("ID");
		JLabel labelNome = new JLabel("Nome");
		final JTextField idDoProduto = new JTextField();
		final JTextField nomeDoProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");

		JTextField textParafuso = new JTextField();
		JTextField textPorca = new JTextField();
		JTextField textArruela = new JTextField();
		JTextField textAco = new JTextField();
		JTextField textAluminio = new JTextField();
		textParafuso.setPreferredSize(new Dimension(15, 15));
		textPorca.setPreferredSize(new Dimension(15, 15));
		textArruela.setPreferredSize(new Dimension(15, 15));
		textAco.setPreferredSize(new Dimension(15, 15));
		textAluminio.setPreferredSize(new Dimension(15, 15));

		JCheckBox jcbParafuso = new JCheckBox("Parafuso");
		JCheckBox jcbPorca = new JCheckBox("Porca");
		JCheckBox jcbArruela = new JCheckBox("Arruela");
		JCheckBox jcbAco = new JCheckBox("Chapa de Aço");
		JCheckBox jcbAluminio = new JCheckBox("Chapa de alumínio");

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		idDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(idDoProduto);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		nomeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(nomeDoProduto);

		panel.add(botaoCadastrar);
		frame.setSize(300, 300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoCancelar);
		frame.setSize(300, 300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		jcbParafuso.setHorizontalAlignment(0);
		jcbParafuso.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbParafuso);
		panel.add(textParafuso);

		jcbPorca.setHorizontalAlignment(0);
		jcbPorca.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbPorca);
		panel.add(textPorca);

		jcbArruela.setHorizontalAlignment(0);
		jcbArruela.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbArruela);
		panel.add(textArruela);

		jcbAco.setHorizontalAlignment(0);
		jcbAco.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbAco);
		panel.add(textAco);

		jcbAluminio.setHorizontalAlignment(0);
		jcbAluminio.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbAluminio);
		panel.add(textAluminio);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List<MateriaPrima> materiasPrimas = new ArrayList<MateriaPrima>();

				if (jcbParafuso.isSelected() == true) {
					int quantidadeParafuso;
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.PAR,
							quantidadeParafuso = Integer.parseInt(textParafuso.getText())));
				}
				if (jcbPorca.isSelected() == true) {
					int quantidadePorca;
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.PRC,
							quantidadePorca = Integer.parseInt(textPorca.getText())));
				}
				if (jcbArruela.isSelected() == true) {
					int quantidadeArruela;
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.ARR,
							quantidadeArruela = Integer.parseInt(textArruela.getText())));
				}
				if (jcbAco.isSelected() == true) {
					int quantidadeChapaAco;
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.CPA,
							quantidadeChapaAco = Integer.parseInt(textAco.getText())));
				}
				if (jcbAluminio.isSelected() == true) {
					int quantidadeChapaAluminio;
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.CAL,
							quantidadeChapaAluminio = Integer.parseInt(textAluminio.getText())));
				}

				AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima = servicoFachada.associarProdutoMateriaPrima(
						servicoFachada.cadastrarProduto(idDoProduto.getText(), nomeDoProduto.getText()),
						materiasPrimas);

				// System.out.println(agregadorProdutoMateriaPrima.toString());
				JOptionPane.showMessageDialog(frame, agregadorProdutoMateriaPrima.toString());
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idDoProduto.setText("");
				nomeDoProduto.setText("");
				textParafuso.setText("");
				textPorca.setText("");
				textAco.setText("");
				textAluminio.setText("");
				textArruela.setText("");

			}
		});
	}

	// criar interface materia prima
	public static void interfaceCadastroMatPrima() {
		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("Tipo");
		JLabel labelNome = new JLabel("Quantidade");
		final JTextField TipoMatPrima = new JTextField();
		final JTextField Quantidade = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		TipoMatPrima.setPreferredSize(new Dimension(100, 20));
		panel.add(TipoMatPrima);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		Quantidade.setPreferredSize(new Dimension(100, 20));
		panel.add(Quantidade);

		panel.add(botaoCadastrar);
		frame.setSize(350, 100);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoCancelar);
		frame.setSize(350, 100);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("tipo: " + TipoMatPrima.getText());
				System.out.println("quantidade: " + Quantidade.getText());
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TipoMatPrima.setText("");
				Quantidade.setText("");
			}
		});
	}

	// criar interface cadastro fornecedor
	public static void interfaceCadastroFornecedor() {

		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("Nome");
		JLabel labelNome = new JLabel("CNPJ");
		final JTextField NomeCliente = new JTextField();
		final JTextField CPFCliente = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");
		JButton botaoCancelar = new JButton("Cancelar");

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		NomeCliente.setPreferredSize(new Dimension(100, 20));
		panel.add(NomeCliente);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		CPFCliente.setPreferredSize(new Dimension(100, 20));
		panel.add(CPFCliente);

		panel.add(botaoCadastrar);
		frame.setSize(300, 100);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		panel.add(botaoCancelar);
		frame.setSize(300, 100);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("id: " + NomeCliente.getText());
				System.out.println("produto: " + CPFCliente.getText());
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NomeCliente.setText("");
				CPFCliente.setText("");
			}
		});
	}

}
