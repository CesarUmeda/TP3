package TP3;

public class Cliente extends Pessoa {
	
	public Cliente() {
		super();
	}
	
	public Cliente(String n, String c, String e, String r, Telefone tel) {
		
		this.nome = n;
		this.cpf = c;
		this.endereco = e;
		this.rg = r;
		this.numTel = tel;
				
	}
	
	public String toString() {	
		return "Nome do Cliente: " + nome;
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
	
	public void status() {
		System.out.println("Informações");
		System.out.println("Nome: " + this.nome);
	}
	
	
	
}
