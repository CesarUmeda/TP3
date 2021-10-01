package control;

import modelo.*;

public class ControlePulseira {
	private Pulseira[] p;
	private int qtdPulseira;
	
	public ControlePulseira(ControleDados d) {
		p = d.getPulseira();
		qtdPulseira = d.getQtdPulseira();
		
	}
	
	public String[] getNomePulseira() {
		String[] s = new String[qtdPulseira];
		for(int i = 0; i < qtdPulseira; i++) {
			s[i] = p[i].getNomeProd();
		}
		
		return s;
	}
	
	//===============================================//
	
	public String getNomeProd(int i) {		
		return p[i].getNomeProd();
	}
	
	//===============================================//
	
	public String getCodigoProd(int i) {		
		return p[i].getCodigoProd();
	}
	
	//===============================================//
	
	public String getTipo(int i) {		
		return p[i].getTipo();
	}
	
	//===============================================//
	
	public String getCor(int i) {
		return p[i].getCor();
	}
	
	//===============================================//
	
	public String getMaterial(int i) {
		return p[i].getMaterial();
	}
	
	//===============================================//
	
	public String getValor(int i) {
		String valor = String.valueOf(p[i].getValor());
		return valor;
	}
	
	//===============================================//
	
	public String getTamanho(int i) {
		String tamanho = String.valueOf(p[i].getTamanho());
		return tamanho;
	}
	
	//===============================================//
	
	public int getQtd() {
		return qtdPulseira;
	}

	public void setQtd(int qtd) {
		this.qtdPulseira = qtd;
	}
	
	//===============================================//
	
	public void setQtdPulseira(int qtdPulseira) {
		this.qtdPulseira = qtdPulseira;
	}
	
	//===============================================//
	
	
}
