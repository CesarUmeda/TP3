package modelo;

public class Vendedor extends Pessoa {
	
	private String matricula;
	private double salario;
	
	public Vendedor() {
		super();
	}
	
	public Vendedor(String n, String c, String e, String r, Telefone tel, String m, double s) {
		
		this.nome = n;
		this.cpf = c;
		this.endereco = e;
		this.rg = r;
		this.numTel = tel;
		matricula = m;
		salario = s;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	public Telefone getNumTel() {
		return numTel;
	}

	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	} 

	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
