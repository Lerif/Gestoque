package Interface;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Agregadores.AgregadorProdutoMateriaPrima;
import Entidades.MateriaPrima;
import Enumeradores.NomeMateriaPrima;
import Servicos.ServicoFachada;

public class InterfaceCadastroDoProduto {

	static ServicoFachada servicoFachada = new ServicoFachada();
	
	public InterfaceCadastroDoProduto(ServicoFachada servicoFachada) {
		this.servicoFachada = servicoFachada;
	}
	
	public void criarInterfaceDoProduto(){
		JFrame frame = new JFrame("Gestoque - Cadastro de Produtos");
		frame.setLocationRelativeTo(null);
		
		Container panel = frame.getContentPane();
		panel.setLayout(new GridBagLayout());
		
		GridBagConstraints gridBag = new GridBagConstraints();
		gridBag.fill = GridBagConstraints.HORIZONTAL;
		
		JLabel labelInvisivel;
		
		gridBag.weighty = 0.1;
		gridBag.weightx = 0.5;
		
		/*gridBag.gridx = 0;
		gridBag.gridy = 0;
		labelInvisivel = new JLabel("");
		panel.add(labelInvisivel, gridBag);*/
		
		gridBag.gridx = 0;
		gridBag.gridy = 0;
		JLabel labelCodigo = new JLabel("Codigo");
		panel.add(labelCodigo, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 0;
		JTextField idDoProduto = new JTextField();
		panel.add(idDoProduto, gridBag);
		
		// Campos de escritas
		gridBag.gridx = 0;
		gridBag.gridy = 1;
		JLabel labelNome = new JLabel("Nome");
		panel.add(labelNome, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 1;
		JTextField nomeDoProduto = new JTextField();
		panel.add(nomeDoProduto, gridBag);
		
		// Lista de materiais
		gridBag.gridx = 0;
		gridBag.gridy = 2;
		labelInvisivel = new JLabel("");
		panel.add(labelInvisivel, gridBag);
		gridBag.gridx = 1;
		gridBag.gridy = 2;
		gridBag.weightx = 0;
		gridBag.gridwidth = 3;
		JLabel labelMateriais = new JLabel("Materiais necessarios para a criar o produto");
		panel.add(labelMateriais, gridBag);
		gridBag.weightx = 0.5;
		gridBag.gridwidth = 1;

		// CheckBoxes com text de quantidade
		JLabel labelQuantidade = new JLabel("Qtd.");
		
		gridBag.gridx = 1;
		gridBag.gridy = 3;
		JCheckBox jcbParafuso = new JCheckBox("Parafuso");
		panel.add(jcbParafuso, gridBag);
		gridBag.gridx = 2;
		labelQuantidade = new JLabel("Qtd.");
		panel.add(labelQuantidade, gridBag);
		gridBag.gridx = 3;
		JTextField textParafuso = new JTextField();
		textParafuso.setPreferredSize(new Dimension(70, 20));
		panel.add(textParafuso, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 4;
		JCheckBox jcbPorca = new JCheckBox("Porca");
		panel.add(jcbPorca, gridBag);
		gridBag.gridx = 2;
		labelQuantidade = new JLabel("Qtd.");
		panel.add(labelQuantidade, gridBag);
		gridBag.gridx = 3;
		JTextField textPorca = new JTextField();
		panel.add(textPorca, gridBag);
		
		
		gridBag.gridx = 1;
		gridBag.gridy = 5;
		JCheckBox jcbArruela = new JCheckBox("Arruela");
		panel.add(jcbArruela, gridBag);
		gridBag.gridx = 2;
		labelQuantidade = new JLabel("Qtd.");
		panel.add(labelQuantidade, gridBag);
		gridBag.gridx = 3;
		JTextField textArruela = new JTextField();
		panel.add(textArruela, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 6;
		JCheckBox jcbAco = new JCheckBox("Chapa de Aço");
		panel.add(jcbAco, gridBag);
		gridBag.gridx = 2;
		labelQuantidade = new JLabel("Qtd.");
		panel.add(labelQuantidade, gridBag);
		gridBag.gridx = 3;
		JTextField textAco = new JTextField();
		panel.add(textAco, gridBag);
		
		gridBag.gridx = 1;
		gridBag.gridy = 7;
		JCheckBox jcbAluminio = new JCheckBox("Chapa de alumínio");
		panel.add(jcbAluminio, gridBag);
		gridBag.gridx = 2;
		labelQuantidade = new JLabel("Qtd.");
		panel.add(labelQuantidade, gridBag);
		gridBag.gridx = 3;
		JTextField textAluminio = new JTextField();
		panel.add(textAluminio, gridBag);
		
		// Botoes
		gridBag.weightx = 1;
		gridBag.gridx = 0;
		gridBag.gridy = 8;
		JButton botaoCadastrar = new JButton("Cadastrar");
		panel.add(botaoCadastrar, gridBag);
		
		gridBag.gridx = 2;
		gridBag.gridy = 8;
		JButton botaoCancelar = new JButton("Limpar");
		panel.add(botaoCancelar, gridBag);
		
		frame.setSize(500, 350);
		frame.setVisible(true);
		
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
				
				jcbParafuso.setSelected(false);
				jcbPorca.setSelected(false);
				jcbArruela.setSelected(false);
				jcbAco.setSelected(false);
				jcbAluminio.setSelected(false);

			}
		});
	}
	
}
