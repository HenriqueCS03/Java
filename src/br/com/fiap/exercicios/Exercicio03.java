package br.com.fiap.exercicios;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

import br.com.fiap.vetores.view.Aluno;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		int qtdAlunos= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Alunos: "));
		
		 Aluno alunos[] = new Aluno[qtdAlunos];
		 for(int i = 0; i < alunos.length ; i ++) {
			 String nomeAl = JOptionPane.showInputDialog("Digite o nome do Aluno:");
			 double notas[] = new double[3];
			 for(int j = 0; j < notas.length; j++ ) {
			 notas[j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (j + 1) + "° nota do aluno: "));
			 }
			 alunos[i] = new Aluno(nomeAl, notas);	 
		 }
		Aluno alunoComMaiorNota = alunos[0];
		for(int i = 0; i < alunos.length; i++) {
			if(alunos[i].maiorNota() > alunoComMaiorNota.maiorNota()) {
				alunoComMaiorNota = alunos[i]; 
			}
			
		}
		JOptionPane.showMessageDialog(null, "A maior nota é: " + alunoComMaiorNota.maiorNota() + "\nDo aluno: " + alunoComMaiorNota.getNome());
	}
}
