package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {
	
	private String nomeProd;
	private String codigoProd;
	private String codigoVenda;
	private String nomeVendedor;
	private SimpleDateFormat data;
	private double valor;
	
	public Venda(String nP, String cP, String cV, String nV, SimpleDateFormat simpleDateFormat, double v) {
		this.nomeProd = nP;
		this.codigoProd = cP;
		this.codigoVenda = cV;
		this.nomeVendedor = nV;
		this.data = simpleDateFormat;
		this.valor = v;
		
	}
	
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public String getCodigoProd() {
		return codigoProd;
	}
	public void setCodigoProd(String codigoProd) {
		this.codigoProd = codigoProd;
	}
	public String getCodigoVenda() {
		return codigoVenda;
	}
	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	public SimpleDateFormat getData() {
		return data;
	}
	public void setData(SimpleDateFormat data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
