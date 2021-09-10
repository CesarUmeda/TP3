package TP3;

import java.util.Date;
import java.util.GregorianCalendar;

public class TP {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("César");
		
		c1.setCpf("12345678900");
		
		c1.setEndereco("Riacho Fundo");
		
		c1.setRg("1234567");
		
		Telefone t1 = new Telefone();
		t1.setDDD(98);
		t1.setNumero(99234576);
		
		
		System.out.println("");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCpf());
		System.out.println("Endereço: " + c1.getEndereco());
		System.out.println("RG: " + c1.getRg());
		System.out.println(t1.toString());
		System.out.println("");
		
		Vendedor v1 = new Vendedor();
		v1.setNome("Ulysses");
		
		v1.setCpf("11111111111");
		
		v1.setMatricula("123");
		
		v1.setEndereco("Aguas Claras");
		
		v1.setRg("0987654");
		
		v1.setSalario(1500);
		
		System.out.println("");
		System.out.println("Nome: " + v1.getNome());
		System.out.println("CPF: " + v1.getCpf());
		System.out.println("Matrículoa: " + v1.getMatricula());
		System.out.println("Endereço: " + v1.getEndereco());
		System.out.println("RG: " + v1.getRg());
		System.out.println("Salário: R$" + v1.getSalario());
		System.out.println("");
		
		Colar colar1 = new Colar();
		colar1.setNomeProd("Colar de Ouro Song Yuqi");
		
		colar1.setCodigoProd("1010");
		
		colar1.setTipo("Corrente");
		
		colar1.setCor("Dourado");
		
		colar1.setMaterial("Ouro");
		
		colar1.setValor(800);
		
		colar1.setTamanho(4);
		
		System.out.println("");
		System.out.println("Produto: " + colar1.getNomeProd());
		System.out.println("Código: " + colar1.getCodigoProd());
		System.out.println("Tipo: " + colar1.getTipo());
		System.out.println("Cor: " + colar1.getCor());
		System.out.println("Material: " + colar1.getMaterial());
		System.out.println("Valor: R$" + colar1.getValor());
		System.out.println("Tamanho: " + colar1.getTamanho());
		System.out.println("");
		
		Venda venda1 = new Venda();
		venda1.setNomeProd("Anel de Falange Huang Zitao");
		
		venda1.setCodigoProd("1221");
		
		venda1.setCodigoVenda("5643");
		
		venda1.setNomeVendedor("Juarez");
		
		GregorianCalendar d = new GregorianCalendar();
		Date agora = d.getTime();
		
		venda1.setData(agora);
		
		venda1.setValor(120);
		
		System.out.println("");
		System.out.println("Produto: " + venda1.getNomeProd());
		System.out.println("Código: " + venda1.getCodigoProd());
		System.out.println("Código de Venda: " + venda1.getCodigoVenda());
		System.out.println("Vendedor: " + venda1.getNomeVendedor());
		System.out.println("Data: " + venda1.getData());
		System.out.println("Valor: R$" + venda1.getValor());
		System.out.println("");
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
