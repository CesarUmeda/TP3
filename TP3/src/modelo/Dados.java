package modelo;

import java.text.SimpleDateFormat;
import java.util.*;

public class Dados {
	private Anel[] anel = new Anel[20];
	private int qtdAnel = 0;
	private Brinco[] brinco = new Brinco[20];
	private int qtdBrinco = 0;
	private Colar[] colar = new Colar[20];
	private int qtdColar = 0;
	private Pulseira[] pulseira = new Pulseira[20];
	private int qtdPulseira = 0;
	private Cliente[] cliente = new Cliente[50];
	private int qtdClientes = 0;
	private Vendedor[] vendedor = new Vendedor[50];
	private int qtdVendedores = 0;
	private Telefone[] telefone = new Telefone[50];
	private int qtdTelefone = 0;
	private Venda[] venda = new Venda[50];
	private int qtdVenda = 0;
	private SimpleDateFormat[] sdf = new SimpleDateFormat[50];
	private int qtdSimpleDateFormat = 0;
	
	public void fillWithSomeData() {
		for(int i = 0; i < 5; i++) {
				telefone[i] = new Telefone((i+1)*100, (i+1)*1000000);
				
				vendedor[i] = new Vendedor("Vendedor " + i, "CPF" + i, "Endereço" + i, "RG" + i, telefone[i], "Matrícula" + i, (1+i));
				
				cliente[i] = new Cliente("Cliente " + i, "CPF" + i, "Endereço" + i, "RG" + i, telefone[i]);
				
				pulseira[i] = new Pulseira("Pulseira " + i, "Código" + i, "Tipo" + i, "Cor" + i, "Material" + i, (i)*50, i+55);
				
				colar[i] = new Colar("Colar " + i, "Código" + i, "Tipo" + i, "Cor" + i, "Material" + i, (i)*50, i+55);
				
				brinco[i] = new Brinco("Brinco " + i, "Código" + i, "Tipo" + i, "Cor" + i, "Material" + i, i+55);
				
				anel[i] = new Anel("Anel " + i, "Código" + i, "Tipo" + i, "Cor" + i, "Material" + i, (i)*50, i+55);
				
				venda[i] = new Venda("Produto " + i, "Código do Produto" + i, "Código de Venda" + i, "Nome do Vendedor" + i, sdf[i], (i+567));
							
		}
		qtdAnel = 5;
		qtdBrinco = 5;
		qtdColar = 5;
		qtdPulseira = 5;
		qtdClientes = 5;
		qtdVendedores = 5;
		qtdTelefone = 5;
		qtdVenda = 5;
		qtdSimpleDateFormat = 5;
			
	}
	
	public Anel[] getAnel(){
		return anel;
	}
	
	public void setAnel(Anel[] anel) {
		this.anel = anel;
	}
	
	public void inserirEditarAnel(Anel a, int pos) {
		this.anel[pos] = a;
		if(pos == qtdAnel) qtdAnel++;
	}
	
	public int getQtdAnel() {
		return qtdAnel;
	}
	
	public void setQtdAnel(int qtdAnel) {
		this.qtdAnel = qtdAnel;
	}
	
	//===============================================//
	
	public Brinco[] getBrinco() {
		return brinco;
	}
	
	public void setBrinco(Brinco[] brinco) {
		this.brinco = brinco;
	}
	
	public void inserirEditarBrinco(Brinco b, int pos) {
		this.brinco[pos] = b;
		if(pos == qtdBrinco) qtdBrinco++;
	}
	
	public int getQtdBrinco() {
		return qtdBrinco;
	}
	public void setQtdBrinco(int qtdBrinco) {
		this.qtdBrinco = qtdBrinco;
	}
	
	//===============================================//
	
	public Colar[] getColar() {
		return colar;
	}
	
	public void setColar(Colar[] colar) {
		this.colar = colar;
	}
	
	public void inserirEditarColar(Colar c, int pos) {
		this.colar[pos] = c;
		if(pos == qtdColar) qtdColar++;
	}
	
	public int getQtdColar() {
		return qtdColar;
	}
	public void setQtdColar(int qtdColar) {
		this.qtdColar = qtdColar;
	}
	
	//===============================================//
	
	public Pulseira[] getPulseira() {
		return pulseira;
	}
	
	public void setPulseira(Pulseira[] pulseira) {
		this.pulseira = pulseira;
	}
	
	public void inserirEditarPulseira(Pulseira p, int pos) {
		this.pulseira[pos] = p;
		if(pos == qtdPulseira) qtdPulseira++;
	}
	
	public int getQtdPulseira() {
		return qtdPulseira;
	}
	public void setQtdPulseira(int qtdPulseira) {
		this.qtdPulseira = qtdPulseira;
	}
	
	//===============================================//
	
	public Cliente[] getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}
	
	public void inserirEditarCliente(Cliente cli, int pos) {
		this.cliente[pos] = cli;
		if(pos == qtdClientes) qtdClientes++;
	}
	
	public int getQtdClientes() {
		return qtdClientes;
	}
	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
	
	//===============================================//
	
	public Vendedor[] getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Vendedor[] vendedor) {
		this.vendedor = vendedor;
	}
	
	public void inserirEditarVendedor(Vendedor v, int pos) {
		this.vendedor[pos] = v;
		if(pos == qtdVendedores) qtdVendedores++;
	}
	
	public int getQtdVendedores() {
		return qtdVendedores;
	}
	public void setQtdVendedores(int qtdVendedores) {
		this.qtdVendedores = qtdVendedores;
	}
	
	//===============================================//
	
	public Telefone[] getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	public int getQtdTelefone() {
		return qtdTelefone;
	}
	public void setQtdTelefone(int qtdTelefone) {
		this.qtdTelefone = qtdTelefone;
	}
	
	//===============================================//
	
	public Venda[] getVenda() {
		return venda;
	}
	
	public void setVenda(Venda[] venda) {
		this.venda = venda;
	}
	
	public void inserirEditarVenda(Venda vnd, int pos) {
		this.venda[pos] = vnd;
		if(pos == qtdVenda) qtdVenda++;
	}
	
	public int getQtdVenda() {
		return qtdVenda;
	}
	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
