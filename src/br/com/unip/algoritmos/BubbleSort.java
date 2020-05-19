package br.com.unip.algoritmos;

public class BubbleSort {


	public static void start(String vetor[]) {
		System.out.println("Iniciando método BubbleSort");
		
		String temp;
		
			for (int j= 0; j < vetor.length; j++) {
				for (int i = j + 1; i < vetor.length; i++ ) {
					if (vetor[i].compareTo(vetor[j]) < 0 ) {
						temp = vetor[j];
						vetor[j] = vetor[i];
						vetor[i] = temp;
					}
				}
				System.out.println(vetor[j]);
			}
		
	}

	
}
