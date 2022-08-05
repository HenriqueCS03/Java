package br.com.fiap.vetores.view;

import javax.swing.JOptionPane;

public interface Exemplo01 {

	public static void main(String[] args) {
		//Declarar um vetor de 5 nomes
		String nomes[] = new String[5];
		
		//Adicionar os nomes no vetores(Usuário digita)
		for(int i = 0; i < nomes.length; i++) {	
		nomes[i] = JOptionPane.showInputDialog("Digite o nome do vetor " + (i+1));
		}
//		JOptionPane.showMessageDialog(null, nomes);
		
		String linha ="";
		
		for(String e : nomes) {
			linha += e + ", ";
			
		}
		JOptionPane.showMessageDialog(null, linha);
		
//		//Criar um laço de repetição e exibir os nomes dos vetores
//		for(int i = 0; i < nomes.length; i++) {
//			System.out.println(nomes[i]);
//			
//		}
//		int i = 0;
//		while( i < nomes.length) {
//			System.out.println(nomes[i]);
//			System.out.println(i);
//		i++;	
//		}
		
		
		
		
	}

}
