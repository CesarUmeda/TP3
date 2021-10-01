package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import control.*;

public class TelaVenda implements ActionListener, ListSelectionListener{
	private JFrame janela;
	private JLabel titulo;
	//===============================================//
	private JButton cadastroVenda;
	//===============================================//
	private JButton refreshVenda;
	//===============================================//
	private static ControleDados dados;
	//===============================================//
	private JList<String> listaVendaCadastrados;
	//===============================================//
	private String[] listaVenda = new String[50];
	//===============================================//
	
	public void mostrarDados(ControleDados d, int op){
		dados = d;
		switch (op){
		case 1:// Mostrar dados de vendas (JList)
		 	listaVenda = new ControleVenda(dados).getNomeVenda();
		 	listaVendaCadastrados = new JList<String>(listaVenda);
		 	janela = new JFrame("Vendas");
		 	titulo = new JLabel("Lista de Vendas");
		 	cadastroVenda = new JButton("Cadastrar");
		 	refreshVenda = new JButton("Recarregar");

		 	titulo.setFont(new Font("Arial", Font.BOLD, 20));
		 	titulo.setBounds(90, 10, 250, 30);
		 	listaVendaCadastrados.setBounds(20, 50, 350, 120);
		 	listaVendaCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		 	listaVendaCadastrados.setVisibleRowCount(10);

		 	cadastroVenda.setBounds(70, 177, 100, 30);
		 	refreshVenda.setBounds(200, 177, 100, 30);

		 	janela.setLayout(null);

		 	janela.add(titulo);
		 	janela.add(listaVendaCadastrados);
		 	janela.add(cadastroVenda);
		 	janela.add(refreshVenda);

		 	janela.setSize(400, 250);
		 	janela.setVisible(true);

		 	cadastroVenda.addActionListener(this);
		 	refreshVenda.addActionListener(this);
		 	listaVendaCadastrados.addListSelectionListener(this);
		 break;
		 
		 default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	
	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de Venda
		if(src == cadastroVenda)
			new TelaDetalheVenda().inserirEditar(1, dados, null, 0);


	// Atualiza a lista de Vendas mostrada no JList
		if(src == refreshVenda) {
			listaVendaCadastrados.setListData(new ControleVenda(dados).getNomeVenda());			
			listaVendaCadastrados.updateUI();
		}


	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaVendaCadastrados) {
			new TelaDetalheVenda().inserirEditar(2, dados, this, listaVendaCadastrados.getSelectedIndex());
		}


	}
	
	
	
	
	
	
}
