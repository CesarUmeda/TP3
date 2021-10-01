package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import control.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Loja MonBiju");
	private static JLabel titulo = new JLabel("Menu Principal");
	private static JButton anel = new JButton("Anéis");
	private static JButton brinco = new JButton("Brincos");
	private static JButton colar = new JButton("Colares");
	private static JButton pulseira = new JButton("Pulseiras");
	private static JButton cliente = new JButton("Clientes");
	private static JButton vendedor = new JButton("Vendedores");
	private static JButton vendas = new JButton("Vendas");
	private static JButton sair = new JButton("Sair");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(220, 10, 150, 30);
		anel.setBounds(140, 100, 120, 30);
		brinco.setBounds(140, 150, 120, 30);
		colar.setBounds(140, 200, 120, 30);
		pulseira.setBounds(140, 250, 120, 30);
		cliente.setBounds(340, 100, 120, 30);
		vendedor.setBounds(340, 150, 120, 30);
		vendas.setBounds(340, 200, 120, 30);
		sair.setBounds(340, 250, 120, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(anel);
		janela.add(brinco);
		janela.add(colar);
		janela.add(pulseira);
		janela.add(cliente);
		janela.add(vendedor);
		janela.add(vendas);
		janela.add(sair);
		
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		anel.addActionListener(menu);
		brinco.addActionListener(menu);
		colar.addActionListener(menu);
		pulseira.addActionListener(menu);
		cliente.addActionListener(menu);
		vendedor.addActionListener(menu);
		vendas.addActionListener(menu);
		sair.addActionListener(menu);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
Object src = e.getSource();
		
		if(src == anel)
			new TelaProdutos().mostrarDados(dados, 1);
		
		if(src == brinco)
			new TelaProdutos().mostrarDados(dados, 2);
		
		if(src == colar)
			new TelaProdutos().mostrarDados(dados, 3);
		
		if(src == pulseira)
			new TelaProdutos().mostrarDados(dados, 4);
		
		if(src == cliente)
			new TelaPessoa().mostrarDados(dados, 1);
		
		if(src == vendedor)
			new TelaPessoa().mostrarDados(dados, 2);
		
		if(src == vendas)
			new TelaVenda().mostrarDados(dados, 1);
		
		
		if(src == sair)
			 System.exit(0);
		
	}
	
	

}
