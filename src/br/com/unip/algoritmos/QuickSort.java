package br.com.unip.algoritmos;

public class QuickSort {
	
	
	public static void start(String[] vetor,  int inicio,  int fim) {
		
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			start(vetor, inicio, posicaoPivo);
			start(vetor, posicaoPivo + 1, fim);
		}
	}

	private static int separar(String[] vetor, int inicio, int fim) {
		String pivo = vetor[inicio];
		int i = inicio;
		int f = fim;
		while (true) {
				while(vetor[f].compareTo(pivo) >= 0 && i < f) {
					f--;
				}
				while(vetor[i].compareTo(pivo) < 0 && i < f) {
					i++;
				}
				if (i < f) {
					String st = vetor[i];
					vetor[i] = vetor[f];
					vetor[f] = st;
					
				}else {
					System.out.println(vetor[f]);
					return f;
				}
			}
	
	}

	
}
