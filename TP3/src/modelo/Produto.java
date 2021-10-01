package modelo;

public abstract class Produto {
		
	protected String nomeProd;
	protected String codigoProd;
	protected String tipo;
	protected String cor;
	protected String material;
	protected double valor;
	
	
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
