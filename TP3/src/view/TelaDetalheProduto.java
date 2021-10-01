package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.*;

public class TelaDetalheProduto implements ActionListener{
	private JFrame janela;
	private JLabel labelNomeProd = new JLabel("Nome do Produto: ");
	private JTextField valorNomeProd;
	
	private JLabel labelCodigoProd = new JLabel("Código do Produto: ");
	private JTextField valorCodigoProd;
	
	private JLabel labelTipo = new JLabel("Tipo: ");
	private JTextField valorTipo;
	
	private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	
	private JLabel labelValor = new JLabel("Valor: ");
	private JTextField valorValor;
	
	private JLabel labelTamanho = new JLabel("Tamanho: ");
	private JTextField valorTamanho;
	
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, TelaProdutos p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Anel";
		if (op == 2) s = "Cadastro de Brinco";
		if (op == 3) s = "Cadastro de Colar";
		if (op == 4) s = "Cadastro de Pulseira";
		if (op == 5) s = "Detalhe de Anel";
		if (op == 6) s = "Detalhe de Brinco";
		if (op == 7) s = "Detalhe de Colar";
		if (op == 8) s = "Detalhe de Pulseira";

		janela = new JFrame(s);

		//Preenche dados com dados do produto clicado
		if (op == 5) {
			valorNomeProd = new JTextField(dados.getAnel()[pos].getNomeProd(), 200);
			valorCodigoProd = new JTextField(dados.getAnel()[pos].getCodigoProd(),200);
			valorTipo = new JTextField(dados.getAnel()[pos].getTipo(), 200);
			valorCor = new JTextField(dados.getAnel()[pos].getCor(), 200);
			valorMaterial = new JTextField(dados.getAnel()[pos].getMaterial(), 200);
			valorValor = new JTextField(String.valueOf(dados.getAnel()[pos].getValor()),200);
			valorTamanho = new JTextField(String.valueOf(dados.getAnel()[pos].getTamanho()),200);
			
		}else if (op == 6) {
			valorNomeProd = new JTextField(dados.getBrinco()[pos].getNomeProd(), 200);
			valorCodigoProd = new JTextField(dados.getBrinco()[pos].getCodigoProd(),200);
			valorTipo = new JTextField(dados.getBrinco()[pos].getTipo(), 200);
			valorCor = new JTextField(dados.getBrinco()[pos].getCor(), 200);
			valorMaterial = new JTextField(dados.getBrinco()[pos].getMaterial(), 200);
			valorValor = new JTextField(String.valueOf(dados.getBrinco()[pos].getValor()),200);
			valorTamanho = new JTextField("Tamanho Único");
			
		}else if (op == 7) {
			valorNomeProd = new JTextField(dados.getColar()[pos].getNomeProd(), 200);
			valorCodigoProd = new JTextField(dados.getColar()[pos].getCodigoProd(),200);
			valorTipo = new JTextField(dados.getColar()[pos].getTipo(), 200);
			valorCor = new JTextField(dados.getColar()[pos].getCor(), 200);
			valorMaterial = new JTextField(dados.getColar()[pos].getMaterial(), 200);
			valorValor = new JTextField(String.valueOf(dados.getColar()[pos].getValor()),200);
			valorTamanho = new JTextField(String.valueOf(dados.getColar()[pos].getTamanho()),200);
			
		}else if (op == 8) {
			valorNomeProd = new JTextField(dados.getPulseira()[pos].getNomeProd(), 200);
			valorCodigoProd = new JTextField(dados.getPulseira()[pos].getCodigoProd(),200);
			valorTipo = new JTextField(dados.getPulseira()[pos].getTipo(), 200);
			valorCor = new JTextField(dados.getPulseira()[pos].getCor(), 200);
			valorMaterial = new JTextField(dados.getPulseira()[pos].getMaterial(), 200);
			valorValor = new JTextField(String.valueOf(dados.getPulseira()[pos].getValor()),200);
			valorTamanho = new JTextField(String.valueOf(dados.getPulseira()[pos].getTamanho()),200);	
			
		
		} else { //Não preenche com dados

			valorNomeProd = new JTextField(200);
			valorCodigoProd = new JTextField(200);
			valorTipo = new JTextField(200);
			valorCor = new JTextField(200);
			valorMaterial = new JTextField(200);
			valorValor = new JTextField(200);
			valorTamanho = new JTextField(200);

			botaoSalvar.setBounds(245, 240, 115, 30);
		}

		labelNomeProd.setBounds(30, 20, 150, 25);
		valorNomeProd.setBounds(180, 20, 180, 25);
		labelCodigoProd.setBounds(30, 50, 150, 25);
		valorCodigoProd.setBounds(180, 50, 180, 25);
		labelTipo.setBounds(30, 80, 150, 25);
		valorTipo.setBounds(180, 80, 180, 25);		
		labelCor.setBounds(30, 110, 150, 25);
		valorCor.setBounds(180, 110, 180, 25);
		labelMaterial.setBounds(30, 140, 150, 25);
		valorMaterial.setBounds(180, 140, 180, 25);
		labelValor.setBounds(30, 170, 150, 25);
		valorValor.setBounds(180, 170, 180, 25);
		labelTamanho.setBounds(30, 200, 150, 25);
		valorTamanho.setBounds(180, 200, 180, 25);
		
		if (op == 5 || op == 6 || op == 7 || op == 8) {
			botaoSalvar.setBounds(120, 240, 115, 30);
			botaoExcluir.setBounds(245, 240, 115, 30);
			this.janela.add(botaoExcluir);
		}

		
		

	
		this.janela.add(labelNomeProd);
		this.janela.add(valorNomeProd);
		this.janela.add(labelCodigoProd);
		this.janela.add(valorCodigoProd);
		this.janela.add(labelTipo);
		this.janela.add(valorTipo);
		this.janela.add(labelCor);
		this.janela.add(valorCor);
		this.janela.add(labelMaterial);
		this.janela.add(valorMaterial);
		this.janela.add(labelValor);
		this.janela.add(valorValor);
		this.janela.add(labelTamanho);
		this.janela.add(valorTamanho);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(450, 375);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo produto
					novoDado[0] = Integer.toString(dados.getQtdAnel());
				else if (opcao == 2)
					novoDado[0] = Integer.toString(dados.getQtdBrinco());
				else if (opcao == 3)
					novoDado[0] = Integer.toString(dados.getQtdColar());
				else if (opcao == 4)
					novoDado[0] = Integer.toString(dados.getQtdPulseira());
				else //edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNomeProd.getText();
				novoDado[2] =  valorCodigoProd.getText();
				novoDado[3] =  valorTipo.getText();
				novoDado[4] =  valorCor.getText();
				novoDado[5] =  valorMaterial.getText();
				novoDado[6] =  valorValor.getText();
				novoDado[7] =  valorTamanho.getText();
				
				if (opcao == 1) {
					novoDado[1] =  valorNomeProd.getText();
					res = dados.inserirEditarAnel(novoDado);
				
					novoDado[2] =  valorCodigoProd.getText();
					res = dados.inserirEditarAnel(novoDado);
					
					novoDado[3] =  valorTipo.getText();
					res = dados.inserirEditarAnel(novoDado);
					
					novoDado[4] =  valorCor.getText();
					res = dados.inserirEditarAnel(novoDado);
					
					novoDado[5] =  valorMaterial.getText();
					res = dados.inserirEditarAnel(novoDado);
					
					novoDado[6] =  valorValor.getText();
					res = dados.inserirEditarAnel(novoDado);
					
					novoDado[7] =  valorTamanho.getText();
					res = dados.inserirEditarAnel(novoDado);
				}
				
				if (opcao == 2) {
					novoDado[1] =  valorNomeProd.getText();
					res = dados.inserirEditarBrinco(novoDado);
				
					novoDado[2] =  valorCodigoProd.getText();
					res = dados.inserirEditarBrinco(novoDado);
					
					novoDado[3] =  valorTipo.getText();
					res = dados.inserirEditarBrinco(novoDado);
					
					novoDado[4] =  valorCor.getText();
					res = dados.inserirEditarBrinco(novoDado);
					
					novoDado[5] =  valorMaterial.getText();
					res = dados.inserirEditarBrinco(novoDado);
					
					novoDado[6] =  valorValor.getText();
					res = dados.inserirEditarBrinco(novoDado);
				}
				
				if (opcao == 3) {
					novoDado[1] =  valorNomeProd.getText();
					res = dados.inserirEditarColar(novoDado);
				
					novoDado[2] =  valorCodigoProd.getText();
					res = dados.inserirEditarColar(novoDado);
					
					novoDado[3] =  valorTipo.getText();
					res = dados.inserirEditarColar(novoDado);
					
					novoDado[4] =  valorCor.getText();
					res = dados.inserirEditarColar(novoDado);
					
					novoDado[5] =  valorMaterial.getText();
					res = dados.inserirEditarColar(novoDado);
					
					novoDado[6] =  valorValor.getText();
					res = dados.inserirEditarColar(novoDado);
					
					novoDado[7] =  valorTamanho.getText();
					res = dados.inserirEditarColar(novoDado);
				}
				
				if (opcao == 4) {
					novoDado[1] =  valorNomeProd.getText();
					res = dados.inserirEditarPulseira(novoDado);
				
					novoDado[2] =  valorCodigoProd.getText();
					res = dados.inserirEditarPulseira(novoDado);
					
					novoDado[3] =  valorTipo.getText();
					res = dados.inserirEditarPulseira(novoDado);
					
					novoDado[4] =  valorCor.getText();
					res = dados.inserirEditarPulseira(novoDado);
					
					novoDado[5] =  valorMaterial.getText();
					res = dados.inserirEditarPulseira(novoDado);
					
					novoDado[6] =  valorValor.getText();
					res = dados.inserirEditarPulseira(novoDado);
					
					novoDado[7] =  valorTamanho.getText();
					res = dados.inserirEditarPulseira(novoDado);
				}

				
				if(res = true) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 5) {//exclui anel
				res = dados.removerAnel(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAnel(); 
			}
			
			if (opcao == 6){ //exclui brinco
				res = dados.removerBrinco(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoBrinco(); 
			}
			
			if (opcao == 7){ //exclui colar
				res = dados.removerColar(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoColar(); 
			}
			
			if (opcao == 8){ //exclui pulseira
				res = dados.removerPulseira(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoPulseira(); 
			}

			
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n ", null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAnel() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoBrinco() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoColar() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoPulseira() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
