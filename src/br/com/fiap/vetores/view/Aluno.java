package br.com.fiap.vetores.view;

public class Aluno {
	
	private String nome;
	double notas[] = new double[3];
	

	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public double maiorNota() {
		double maiorNota = notas[0];
		for(int i = 1; i < notas.length; i ++) {
			if(notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
		}
		return maiorNota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
}
