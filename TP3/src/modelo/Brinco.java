package modelo;

public class Brinco extends Produto{
		
	public Brinco() {
		super();
	}
	
	public Brinco(String nP, String cP, String t, String c, String m, double v) {
		
		this.nomeProd = nP;
		this.codigoProd = cP;
		this.tipo = t;
		this.cor = c;
		this.material = m;
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
