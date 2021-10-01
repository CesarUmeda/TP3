package control;

import modelo.*;

public class ControleBrinco {
	private Brinco[] b;
	private int qtdBrinco;
	
	public ControleBrinco(ControleDados d) {
		b = d.getBrinco();
		qtdBrinco = d.getQtdBrinco();
		
	}
	
	public String[] getNomeBrinco() {
		String[] s = new String[qtdBrinco];
		for(int i = 0; i < qtdBrinco; i++) {
			s[i] = b[i].getNomeProd();
		}
		
		return s;
	}
	
	//===============================================//
	
	public String getNomeProd(int i) {		
		return b[i].getNomeProd();
	}
	
	//===============================================//
	
	public String getCodigoProd(int i) {		
		return b[i].getCodigoProd();
	}
	
	//===============================================//
	
	public String getTipo(int i) {		
		return b[i].getTipo();
	}
	
	//===============================================//
	
	public String getCor(int i) {
		return b[i].getCor();
	}
	
	//===============================================//
	
	public String getMaterial(int i) {
		return b[i].getMaterial();
	}
	
	//===============================================//
	
	public String getValor(int i) {
		String valor = String.valueOf(b[i].getValor());
		return valor;
	}
	
	//===============================================//
	
	public int getQtd() {
		return qtdBrinco;
	}

	public void setQtd(int qtd) {
		this.qtdBrinco = qtd;
	}
	
	//===============================================//
	
	public void setQtdBrinco(int qtdBrinco) {
		this.qtdBrinco = qtdBrinco;
	}
	
	//===============================================//
	
	
}
