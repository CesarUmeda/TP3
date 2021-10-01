package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.*;

public class TelaDetalhePessoa implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCpf = new JLabel("CPF: ");
	private JTextField valorCpf;
	private JLabel labelEnd = new JLabel("Endereco: ");
	private JTextField valorEnd;
	private JLabel labelRg = new JLabel("RG: ");
	private JTextField valorRg;
	private JLabel labelTelefone = new JLabel("Telefone");
	private JTextField valorDDD;
	private JTextField valorTelefone;
	private JLabel labelMat = new JLabel("Matrícula: ");
	private JTextField valorMat;
	private JLabel labelSalario = new JLabel("Salário: ");
	private JTextField valorSalario;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, ControleDados d, 
			TelaPessoa p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Cliente";
		if (op == 2) s = "Cadastro de Vendedor";
		if (op == 3) s = "Detalhe de Cliente";
		if (op == 4) s = "Detalhe de Vendedor";

		janela = new JFrame(s);

		//Preenche dados com dados da pessoa clicada
		if (op == 3) {
			valorNome = new JTextField(dados.getCliente()[pos].getNome(), 200);
			valorCpf = new JTextField(dados.getCliente()[pos].getCpf(), 200);
			valorEnd = new JTextField(dados.getCliente()[pos].getEndereco(),200);
			valorRg = new JTextField(dados.getCliente()[pos].getRg(), 200);
			valorDDD = new JTextField(String.valueOf(dados.getCliente()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getCliente()[pos].getNumTel().getNumero()), 10);
			valorMat = new JTextField(200);
			valorSalario = new JTextField(200);

		} else if (op == 4) { 
			valorNome = new JTextField(dados.getVendedor()[pos].getNome(), 200);
			valorCpf = new JTextField(dados.getVendedor()[pos].getCpf(), 200);
			valorEnd = new JTextField(dados.getVendedor()[pos].getEndereco(),200);
			valorRg = new JTextField(dados.getVendedor()[pos].getRg(), 200);
			valorDDD = new JTextField(String.valueOf(dados.getVendedor()[pos].getNumTel().getDDD()), 3);
			valorTelefone = new JTextField(String.valueOf(dados.getVendedor()[pos].getNumTel().getNumero()), 10);
			valorMat = new JTextField(dados.getVendedor()[pos].getMatricula(), 200);
			valorSalario = new JTextField(String.valueOf(dados.getVendedor()[pos].getSalario()), 200);

		} else { //Não preenche com dados

			valorNome = new JTextField(200);
			valorCpf = new JTextField(200);
			valorEnd = new JTextField(200);
			valorRg = new JTextField(200);
			valorDDD = new JTextField(3);
			valorTelefone = new JTextField(10);
			valorMat = new JTextField(200);
			valorSalario = new JTextField(200);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelCpf.setBounds(30, 50, 150, 25);
		valorCpf.setBounds(180, 50, 180, 25);
		labelEnd.setBounds(30, 80, 180, 25);
		valorEnd.setBounds(180, 80, 180, 25);		
		labelRg.setBounds(30, 110, 150, 25);
		valorRg.setBounds(180, 110, 180, 25);
		labelTelefone.setBounds(30, 140, 150, 25);
		valorDDD.setBounds(180, 140, 28, 25);
		valorTelefone.setBounds(210, 140, 65, 25);
		labelMat.setBounds(30, 170, 150, 25);
		valorMat.setBounds(180, 170, 180, 25);

		//Coloca os campos relacionados a endereco de cliente
		if (op == 1 || op == 3 ) {
			this.janela.add(labelEnd);
			this.janela.add(valorEnd);

		}

		//Coloca campos relacionados a material e salario
		if (op == 2 || op == 4) {

			this.janela.add(labelMat);
			this.janela.add(valorMat);
			this.janela.add(labelSalario);
			this.janela.add(valorSalario);
		}

		//Coloca botoes de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
		this.janela.add(labelRg);
		this.janela.add(valorRg);
		this.janela.add(labelTelefone);
		this.janela.add(valorDDD);
		this.janela.add(valorTelefone);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 350);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res;
				if(opcao == 1) //cadastro de novo cliente
					novoDado[0] = Integer.toString(dados.getQtdClientes());
				else if (opcao == 2) // cadastro de novo vendedor
					novoDado[0] = Integer.toString(dados.getQtdVendedores());
				else //edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorCpf.getText();
				novoDado[4] =  valorRg.getText();
				novoDado[5] =  valorDDD.getText();
				novoDado[6] =  valorTelefone.getText();
				

				if (opcao == 1 || opcao == 3) {
					novoDado[3] =  valorEnd.getText();
					res = dados.inserirEditarCliente(novoDado);
				} else {
					novoDado[7] =  valorMat.getText();
					res = dados.inserirEditarVendedor(novoDado);
					novoDado[8] =  valorSalario.getText();
					res = dados.inserirEditarVendedor(novoDado);
				}

				if(res) {
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

			if (opcao == 3) {//exclui cliente
				res = dados.removerCliente(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoCliente(); 
			}
				
			if (opcao == 4){ //exclui vendedor
				res = dados.removerVendedor(posicao);
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoVendedor(); 
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

	public void mensagemErroExclusaoCliente() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoVendedor() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);
	}

}