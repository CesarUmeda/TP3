package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import control.*;

public class TelaProdutos implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	//===============================================//
	private JButton cadastroAnel;
	private JButton cadastroBrinco;
	private JButton cadastroColar;
	private JButton cadastroPulseira;
	//===============================================//
	private JButton refreshAnel;
	private JButton refreshBrinco;
	private JButton refreshColar;
	private JButton refreshPulseira;
	//===============================================//
	private static ControleDados dados;
	//===============================================//
	private JList<String> listaAnelCadastrados;
	private JList<String> listaBrincoCadastrados;
	private JList<String> listaColarCadastrados;
	private JList<String> listaPulseiraCadastrados;
	//===============================================//
	private String[] listaAnel = new String[50];
	private String[] listaBrinco = new String[50];
	private String[] listaColar = new String[50];
	private String[] listaPulseira = new String[50];
	//===============================================//

	public void mostrarDados(ControleDados d, int op){
		dados = d;
		
		switch (op) {
		case 1:// Mostrar dados de produtos cadastrados (JList)
			 listaAnel = new ControleAnel(dados).getNomeAnel();
			 listaAnelCadastrados = new JList<String>(listaAnel);
			 janela = new JFrame("Anéis");
			 titulo = new JLabel("Lista de Anéis");
			 cadastroAnel = new JButton("Cadastrar");
			 refreshAnel = new JButton("Recarregar");

			 titulo.setFont(new Font("Arial", Font.BOLD, 20));
			 titulo.setBounds(90, 10, 250, 30);
			 listaAnelCadastrados.setBounds(20, 50, 350, 120);
			 listaAnelCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 listaAnelCadastrados.setVisibleRowCount(10);

			 cadastroAnel.setBounds(70, 177, 100, 30);
			 refreshAnel.setBounds(200, 177, 100, 30);

			 janela.setLayout(null);

			 janela.add(titulo);
			 janela.add(listaAnelCadastrados);
			 janela.add(cadastroAnel);
			 janela.add(refreshAnel);

			 janela.setSize(400, 250);
			 janela.setVisible(true);

			 cadastroAnel.addActionListener(this);
			 refreshAnel.addActionListener(this);
			 listaAnelCadastrados.addListSelectionListener(this);
			 
			 break;
			 
		case 2:
			 listaBrinco = new ControleBrinco(dados).getNomeBrinco();
			 listaBrincoCadastrados = new JList<String>(listaBrinco);
			 janela = new JFrame("Brincos");
			 titulo = new JLabel("Lista de Brincos");
			 cadastroBrinco = new JButton("Cadastrar");
			 refreshBrinco = new JButton("Recarregar");

			 titulo.setFont(new Font("Arial", Font.BOLD, 20));
			 titulo.setBounds(90, 10, 250, 30);
			 listaBrincoCadastrados.setBounds(20, 50, 350, 120);
			 listaBrincoCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 listaBrincoCadastrados.setVisibleRowCount(10);

			 cadastroBrinco.setBounds(70, 177, 100, 30);
			 refreshBrinco.setBounds(200, 177, 100, 30);

			 janela.setLayout(null);

			 janela.add(titulo);
			 janela.add(listaBrincoCadastrados);
			 janela.add(cadastroBrinco);
			 janela.add(refreshBrinco);

			 janela.setSize(400, 250);
			 janela.setVisible(true);

			 cadastroBrinco.addActionListener(this);
			 refreshBrinco.addActionListener(this);
			 listaBrincoCadastrados.addListSelectionListener(this);
			
			 break;
			 
		case 3:
			 listaColar = new ControleColar(dados).getNomeColar();
			 listaColarCadastrados = new JList<String>(listaColar);
			 janela = new JFrame("Colares");
			 titulo = new JLabel("Lista de Colares");
			 cadastroColar = new JButton("Cadastrar");
			 refreshColar = new JButton("Recarregar");

			 titulo.setFont(new Font("Arial", Font.BOLD, 20));
			 titulo.setBounds(90, 10, 250, 30);
			 listaColarCadastrados.setBounds(20, 50, 350, 120);
			 listaColarCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 listaColarCadastrados.setVisibleRowCount(10);

			 cadastroColar.setBounds(70, 177, 100, 30);
			 refreshColar.setBounds(200, 177, 100, 30);

			 janela.setLayout(null);

			 janela.add(titulo);
			 janela.add(listaColarCadastrados);
			 janela.add(cadastroColar);
			 janela.add(refreshColar);

			 janela.setSize(400, 250);
			 janela.setVisible(true);

			 cadastroColar.addActionListener(this);
			 refreshColar.addActionListener(this);
			 listaColarCadastrados.addListSelectionListener(this);
			
			 break;
			 
		case 4:
			 listaPulseira = new ControlePulseira(dados).getNomePulseira();
			 listaPulseiraCadastrados = new JList<String>(listaPulseira);
			 janela = new JFrame("Pulseiras");
			 titulo = new JLabel("Lista de Pulseiras");
			 cadastroPulseira = new JButton("Cadastrar");
			 refreshPulseira = new JButton("Recarregar");

			 titulo.setFont(new Font("Arial", Font.BOLD, 20));
			 titulo.setBounds(90, 10, 250, 30);
			 listaPulseiraCadastrados.setBounds(20, 50, 350, 120);
			 listaPulseiraCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 listaPulseiraCadastrados.setVisibleRowCount(10);

			 cadastroPulseira.setBounds(70, 177, 100, 30);
			 refreshPulseira.setBounds(200, 177, 100, 30);

			 janela.setLayout(null);

			 janela.add(titulo);
			 janela.add(listaPulseiraCadastrados);
			 janela.add(cadastroPulseira);
			 janela.add(refreshPulseira);

			 janela.setSize(400, 250);
			 janela.setVisible(true);

			 cadastroPulseira.addActionListener(this);
			 refreshPulseira.addActionListener(this);
			 listaPulseiraCadastrados.addListSelectionListener(this);
			
			 break;
			 


			 
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo anel
		if(src == cadastroAnel)
			new TelaDetalheProduto().inserirEditar(1, dados, this, 0);

		//Cadastro de novo brinco
		if(src == cadastroBrinco)
			new TelaDetalheProduto().inserirEditar(2, dados, this, 0);
		
		//Cadastro de novo colar
		if(src == cadastroColar)
			new TelaDetalheProduto().inserirEditar(3, dados, this, 0);
		
		//Cadastro de novo pulseira
		if(src == cadastroPulseira)
			new TelaDetalheProduto().inserirEditar(4, dados, this, 0);

		// Atualiza a lista de anel no JList
		if(src == refreshAnel) {
			listaAnelCadastrados.setListData(new ControleAnel(dados).getNomeAnel());			
			listaAnelCadastrados.updateUI();
		}

		// Atualiza a lista de brinco no JList
		if(src == refreshBrinco) {
			listaBrincoCadastrados.setListData(new ControleBrinco(dados).getNomeBrinco());
			listaBrincoCadastrados.updateUI();
		}
		
		// Atualiza a lista de colar no JList
		if(src == refreshColar) {
			listaColarCadastrados.setListData(new ControleColar(dados).getNomeColar());
			listaColarCadastrados.updateUI();
		}
		
		// Atualiza a lista de pulseira no JList
		if(src == refreshPulseira) {
			listaPulseiraCadastrados.setListData(new ControlePulseira(dados).getNomePulseira());
			listaPulseiraCadastrados.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaAnelCadastrados) {
			new TelaDetalheProduto().inserirEditar(5, dados, this, listaAnelCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaBrincoCadastrados) {
			new TelaDetalheProduto().inserirEditar(6, dados, this, listaBrincoCadastrados.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaColarCadastrados) {
			new TelaDetalheProduto().inserirEditar(7, dados, this, listaColarCadastrados.getSelectedIndex());
		}
		
		if(e.getValueIsAdjusting() && src == listaPulseiraCadastrados) {
			new TelaDetalheProduto().inserirEditar(8, dados, this, listaPulseiraCadastrados.getSelectedIndex());
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
