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
import javax.swing.WindowConstants;

import Agregadores.AgregadorProdutoMateriaPrima;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;

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

		JMenuItem CadastroMatPrima = new JMenuItem("Cadastrar Mat�ria Prima");

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

		CadastroMenu.add(CadastroCliente);
		CadastroMenu.add(CadastroFornecedor);
		CadastroMenu.add(CadastroMatPrima);
		CadastroMenu.add(CadastroProduto);
		CadastroMenu.add(CadastroPedido);

		JMenu FabricaMenu = new JMenu("Usu�rio - F�brica");
		JMenuItem SaidaProdutoMi = new JMenuItem("Gerar sa�da de Produto");
		JMenuItem ListarAndamentoProducao = new JMenuItem("Listar andamento da produ��o");
		JMenuItem ListarInsumosProduto = new JMenuItem("Listar insumos do produto");

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

		JMenu AlmoxarifadoMenu = new JMenu("Usu�rio - Almoxarifado");
		JMenuItem CadastrarEntradaInsumo = new JMenuItem("Cadastrar Entrada de insumos");
		AlmoxarifadoMenu.add(CadastrarEntradaInsumo);

		JMenu AdministrativoMenu = new JMenu("Usu�rio - Administrativo");

		JMenuItem ListarMaxMinEstoque = new JMenuItem("Listar M�ximos/M�nimos do Estoque");
		JMenuItem ListarQtdProdutosProduzidos = new JMenuItem("Listar quantidade de produtos produzidos");
		JMenuItem ListarQtdInsumosConsumidos = new JMenuItem("Listar quantidade de insumos consumidos");
		JMenuItem ListarPedidoCliente = new JMenuItem("Listar pedidos cliente");
		JMenuItem ListarAndamentoPedido = new JMenuItem("Listar andamento do pedido");

		AdministrativoMenu.add(ListarMaxMinEstoque);
		AdministrativoMenu.add(ListarQtdProdutosProduzidos);
		AdministrativoMenu.add(ListarQtdInsumosConsumidos);
		AdministrativoMenu.add(ListarPedidoCliente);
		AdministrativoMenu.add(ListarAndamentoPedido);

		JMenuItem FabricaSubMenu = new JMenuItem("Usu�rio - F�brica");
		JMenuItem AlmoxarifadoMi = new JMenuItem("Usu�rio - Almoxarifado");
		JMenuItem AdministrativoMi = new JMenuItem("Usu�rio - Administrativo");

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

	private void interfaceListarInsumosProduto() {
		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		String[] selections = { "green", "red", "orange", "dark blue" };
		JList list = new JList(selections);
		list.setSelectedIndex(1);
		frame.pack();

		JButton botaoCadastrar = new JButton("Escolher");
		JButton botaoCancelar = new JButton("Cancelar");

		panel.add(list);
		frame.setSize(100, 200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

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

				// Get the current state of the checkbox
				// boolean b = checkbox.isSelected();
				System.out.println(list.getSelectedValue());

			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.clearSelection();
				list.setSelectedIndex(0);
			}
		});

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
		JLabel labelNome = new JLabel("CPF");
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

				// System.out.println("Codigo: " + produto.getCodigo());
				// System.out.println("Tipo do produto: " + produto.getNome());
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
		JLabel labelCodigo = new JLabel("C�digo:");
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

		JCheckBox jcbParafuso = new JCheckBox("Parafuso");
		JCheckBox jcbPorca = new JCheckBox("Porca");
		JCheckBox jcbArruela = new JCheckBox("Arruela");
		JCheckBox jcbAco = new JCheckBox("Chapa de A�o");
		JCheckBox jcbAluminio = new JCheckBox("Chapa de alum�nio");

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

		jcbPorca.setHorizontalAlignment(0);
		jcbPorca.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbPorca);

		jcbArruela.setHorizontalAlignment(0);
		jcbArruela.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbArruela);

		jcbAco.setHorizontalAlignment(0);
		jcbAco.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbAco);

		jcbAluminio.setHorizontalAlignment(0);
		jcbAluminio.setPreferredSize(new Dimension(100, 50));
		panel.add(jcbAluminio);

		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				List<MateriaPrima> materiasPrimas = new ArrayList<MateriaPrima>();

				if (jcbParafuso.isSelected() == true) {
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.PAR));
				}
				if (jcbPorca.isSelected() == true) {
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.PRC));
				}
				if (jcbArruela.isSelected() == true) {
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.ARR));
				}
				if (jcbAco.isSelected() == true) {
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.CPA));
				}
				if (jcbAluminio.isSelected() == true) {
					materiasPrimas.add(MateriaPrima.nova(NomeMateriaPrima.CAL));
				}

				AgregadorProdutoMateriaPrima agregadorProdutoMateriaPrima = servicoFachada.associarProdutoMateriaPrima(
						servicoFachada.cadastrarProduto(idDoProduto.getText(), nomeDoProduto.getText()),
						materiasPrimas);
				
				System.out.println(agregadorProdutoMateriaPrima.toString());
			}
		});

		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idDoProduto.setText("");
				nomeDoProduto.setText("");
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
