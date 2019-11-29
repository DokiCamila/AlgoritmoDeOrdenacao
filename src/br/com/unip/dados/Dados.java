package br.com.unip.dados;

public class Dados {

	public static int[] gerarArray() {

		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = (int) (Math.random() * quantidade);
			System.out.println(i + ": "  + vetor[i]);
		}
		return vetor;
	}
	
	
}
