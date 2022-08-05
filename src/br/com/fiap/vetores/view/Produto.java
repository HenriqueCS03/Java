package br.com.fiap.vetores.view;

public class Produto {
	
	private int qtd;
	private double preco;
	private double desconto;
	
	
	public Produto(int qtd, double preco, double desconto) {
		super();
		this.qtd = qtd;
		this.preco = preco;
		this.desconto = desconto;
	}


	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getDesconto() {
		return desconto;
	}


	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public static double valorPagar(int qtd, double preco, double desconto) {
		double total = 0;
		total = (qtd * preco) * ( 100 );
		return total;
	}
	
}
