package control;

import modelo.*;

public class ControleColar {
	private Colar[] c;
	private int qtdColar;
	
	public ControleColar(ControleDados d) {
		c = d.getColar();
		qtdColar = d.getQtdColar();
		
	}
	
	public String[] getNomeColar() {
		String[] s = new String[qtdColar];
		for(int i = 0; i < qtdColar; i++) {
			s[i] = c[i].getNomeProd();
		}
		
		return s;
	}
	
	//===============================================//
	
	public String getNomeProd(int i) {		
		return c[i].getNomeProd();
	}
	
	//===============================================//
	
	public String getCodigoProd(int i) {		
		return c[i].getCodigoProd();
	}
	
	//===============================================//
	
	public String getTipo(int i) {		
		return c[i].getTipo();
	}
	
	//===============================================//
	
	public String getCor(int i) {
		return c[i].getCor();
	}
	
	//===============================================//
	
	public String getMaterial(int i) {
		return c[i].getMaterial();
	}
	
	//===============================================//
	
	public String getValor(int i) {
		String valor = String.valueOf(c[i].getValor());
		return valor;
	}
	
	//===============================================//
	
	public String getTamanho(int i) {
		String tamanho = String.valueOf(c[i].getTamanho());
		return tamanho;
	}
	
	//===============================================//
	
	public int getQtd() {
		return qtdColar;
	}

	public void setQtd(int qtd) {
		this.qtdColar = qtd;
	}
	
	//===============================================//
	
	public void setQtdColar(int qtdColar) {
		this.qtdColar = qtdColar;
	}
	
	//===============================================//
	

}
