package control;

import modelo.*;

import java.text.SimpleDateFormat;


public class ControleVenda {
	private Venda[] venda;
	private int qtdVenda;
	
	public ControleVenda(ControleDados d) {
		venda = d.getVenda();
		qtdVenda = d.getQtdVenda();
		
	}
	
	public String[] getNomeVenda() {
		String[] s = new String[qtdVenda];
		for(int i = 0; i < qtdVenda; i++) {
			s[i] = venda[i].getNomeProd();
		}
		
		return s;
	}
	
		//===============================================//
	
		public String getNomeProd(int i) {
			return venda[i].getNomeProd();
		}
		
		//===============================================//
		
		public String getcodigoProd(int i) {
			return venda[i].getCodigoProd();
		}
		
		//===============================================//
		
		public String getCodigoVenda(int i) {
			return venda[i].getCodigoVenda();
		}
		
		//===============================================//
		
		public String getNomeVendedor(int i) {
			return venda[i].getNomeVendedor();
		}
		
		//===============================================//
		
		public SimpleDateFormat getData(int i) {
			return venda[i].getData();
		}
		
		//===============================================//
}
