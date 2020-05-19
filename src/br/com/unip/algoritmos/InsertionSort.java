package br.com.unip.algoritmos;

import java.util.Arrays;

public class InsertionSort {

	
	public static void start(String[] vetor) {
		System.out.println("Iniciando método InsertionSort");
		
		int i,j;
		String chave;
		
		
		for (j = 1; j < vetor.length; j++) {
			
			chave = vetor[j];
			i = j -1 ;
			
			while ( i >= 0 ) {
				if(chave.compareTo(vetor[i]) > 0 ) {
					break;
				}
				vetor[i +1] = vetor[i];
				i--;
				
			}
			vetor[ i + 1 ] = chave;
			System.out.println(Arrays.toString(vetor));
		}
		System.out.println(Arrays.toString(vetor));
	}
	
}
