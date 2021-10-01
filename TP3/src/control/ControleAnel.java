package control;

import modelo.*;

public class ControleAnel {
	private Anel[] a;
	private int qtdAnel;
	
	public ControleAnel(ControleDados d) {
		a = d.getAnel();
		qtdAnel = d.getQtdAnel();
		
	}
	
	public String[] getNomeAnel() {
		String[] s = new String[qtdAnel];
		for(int i = 0; i < qtdAnel; i++) {
			s[i] = a[i].getNomeProd();
		}
		
		return s;
	}
	
	//===============================================//
	
	public String getNomeProd(int i) {		
		return a[i].getNomeProd();
	}
	
	//===============================================//
	
	public String getCodigoProd(int i) {		
		return a[i].getCodigoProd();
	}
	
	//===============================================//
	
	public String getTipo(int i) {		
		return a[i].getTipo();
	}
	
	//===============================================//
	
	public String getCor(int i) {
		return a[i].getCor();
	}
	
	//===============================================//
	
	public String getMaterial(int i) {
		return a[i].getMaterial();
	}
	
	//===============================================//
	
	public String getValor(int i) {
		String valor = String.valueOf(a[i].getValor());
		return valor;
	}
	
	//===============================================//
	
	public String getTamanho(int i) {
		String tamanho = String.valueOf(a[i].getTamanho());
		return tamanho;
	}
	
	//===============================================//
	
	public int getQtd() {
		return qtdAnel;
	}

	public void setQtd(int qtd) {
		this.qtdAnel = qtd;
	}
	
	//===============================================//
	
	public void setQtdAnel(int qtdAnel) {
		this.qtdAnel = qtdAnel;
	}
	
	//===============================================//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}