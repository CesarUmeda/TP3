package control;

import modelo.*;

public class ControleVendedor {
	private Vendedor[] v;
	private int qtdVendedor;
	
	public ControleVendedor(ControleDados d) {
		v = d.getVendedor();
		qtdVendedor = d.getQtdVendedores();
		
	}
	
	public String[] getNomeVendedor() {
		String[] s = new String[qtdVendedor];
		for(int i = 0; i < qtdVendedor; i++) {
			s[i] = v[i].getNome();
		}
		
		return s;
	}
	
	//===============================================//
	
	public String getNome(int i) {
		return v[i].getNome();
	}
	
	//===============================================//
	
	public String getCpf(int i) {
		return v[i].getCpf();
	}
	
	//===============================================//
	
	public String getEndereco(int i) {
		return v[i].getEndereco();
	}
	
	//===============================================//
	
	public String getRg(int i) {
		return v[i].getRg();
	}
	
	//===============================================//
	
	public Telefone getTelefone(int i) {
		return v[i].getNumTel();
	}
	
	//===============================================//
	
	public String getMatricula(int i) {
		String matricula = String.valueOf(v[i].getMatricula());
		return matricula;
	}
	
	//===============================================//
	
	public String getSalario(int i) {
		String salario = String.valueOf(v[i].getSalario());
		return salario;
	}
	
	
}
