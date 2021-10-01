package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import control.*;

public class TelaPessoa implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel titulo;
	//===============================================//
	private JButton cadastroCliente;
	private JButton cadastroVendedor;
	//===============================================//
	private JButton refreshCliente;
	private JButton refreshVendedor;
	//===============================================//
	private static ControleDados dados;
	//===============================================//
	private JList<String> listaClienteCadastrados;
	private JList<String> listaVendedorCadastrados;
	//===============================================//
	private String[] listaCliente = new String[50];
	private String[] listaVendedor = new String[50];
	//===============================================//
	
	public void mostrarDados(ControleDados d, int op){
		dados = d;
		
		switch (op) {
		case 1:// Mostrar dados de pessoas cadastradas (JList)
			 listaCliente = new ControleClientes(dados).getNomeCliente();
			 listaClienteCadastrados = new JList<String>(listaCliente);
			 janela = new JFrame("Clientes");
			 titulo = new JLabel("Lista de Clientes");
			 cadastroCliente = new JButton("Cadastrar");
			 refreshCliente = new JButton("Recarregar");

			 titulo.setFont(new Font("Arial", Font.BOLD, 20));
			 titulo.setBounds(90, 10, 250, 30);
			 listaClienteCadastrados.setBounds(20, 50, 350, 120);
			 listaClienteCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 listaClienteCadastrados.setVisibleRowCount(10);

			 cadastroCliente.setBounds(70, 177, 100, 30);
			 refreshCliente.setBounds(200, 177, 100, 30);

			 janela.setLayout(null);

			 janela.add(titulo);
			 janela.add(listaClienteCadastrados);
			 janela.add(cadastroCliente);
			 janela.add(refreshCliente);

			 janela.setSize(400, 250);
			 janela.setVisible(true);

			 cadastroCliente.addActionListener(this);
			 refreshCliente.addActionListener(this);
			 listaClienteCadastrados.addListSelectionListener(this);
			 
			 break;
			 
		case 2:
			 listaVendedor = new ControleVendedor(dados).getNomeVendedor();
			 listaVendedorCadastrados = new JList<String>(listaVendedor);
			 janela = new JFrame("Vendedores");
			 titulo = new JLabel("Lista de Vendedores");
			 cadastroVendedor = new JButton("Cadastrar");
			 refreshVendedor = new JButton("Recarregar");

			 titulo.setFont(new Font("Arial", Font.BOLD, 20));
			 titulo.setBounds(90, 10, 250, 30);
			 listaVendedorCadastrados.setBounds(20, 50, 350, 120);
			 listaVendedorCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			 listaVendedorCadastrados.setVisibleRowCount(10);

			 cadastroVendedor.setBounds(70, 177, 100, 30);
			 refreshVendedor.setBounds(200, 177, 100, 30);

			 janela.setLayout(null);

			 janela.add(titulo);
			 janela.add(listaVendedorCadastrados);
			 janela.add(cadastroVendedor);
			 janela.add(refreshVendedor);

			 janela.setSize(400, 250);
			 janela.setVisible(true);

			 cadastroVendedor.addActionListener(this);
			 refreshVendedor.addActionListener(this);
			 listaVendedorCadastrados.addListSelectionListener(this);
			
			 break;
			 
			 
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
		

	
	
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo cliente
		if(src == cadastroCliente)
			new TelaDetalhePessoa().inserirEditar(1, dados, this, 0);

		//Cadastro de novo vendedor
		if(src == cadastroVendedor)
			new TelaDetalhePessoa().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de clientes mostrada no JList
		if(src == refreshCliente) {
			listaClienteCadastrados.setListData(new ControleClientes(dados).getNomeCliente());			
			listaClienteCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de vendedores mostrada no JList
		if(src == refreshVendedor) {
			listaVendedorCadastrados.setListData(new ControleVendedor(dados).getNomeVendedor());
			listaVendedorCadastrados.updateUI();
		}

	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaClienteCadastrados) {
			new TelaDetalhePessoa().inserirEditar(3, dados, this, 
					listaClienteCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaVendedorCadastrados) {
			new TelaDetalhePessoa().inserirEditar(4, dados, this, 
					listaVendedorCadastrados.getSelectedIndex());
		}
	}
	
	
	
	
}
