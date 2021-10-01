package control;

import modelo.*;

public class ControleClientes {
	private Cliente[] cli;
	private int qtdCliente;
	
	public ControleClientes(ControleDados d) {
		cli = d.getCliente();
		qtdCliente = d.getQtdClientes();
		
	}
	
	public String[] getNomeCliente() {
		String[] s = new String[qtdCliente];
		for(int i = 0; i < qtdCliente; i++) {
			s[i] = cli[i].getNome();
		}
		
		return s;
	}
	
	//===============================================//
	
	public String getNome(int i) {
		return cli[i].getNome();
	}
	
	//===============================================//
	
	public String getCpf(int i) {
		return cli[i].getCpf();
	}
	
	//===============================================//
	
	public String getEndereco(int i) {
		return cli[i].getEndereco();
	}
	
	//===============================================//
	
	public String getRg(int i) {
		return cli[i].getRg();
	}
	
	//===============================================//
	
	public Telefone getTelefone(int i) {
		return cli[i].getNumTel();
	}
	
	
	
	
	
	
	
	

}
