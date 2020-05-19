package br.com.unip.dados;

import java.util.Scanner;

import br.com.unip.algoritmos.BubbleSort;
import br.com.unip.algoritmos.InsertionSort;
import br.com.unip.algoritmos.QuickSort;

public class Dados {
	
	public String pal;
	
	int posicao;
	

	public static String[] gerarArray() {
		

		int contador = 0;
		String[] lista = new String[10];
		Scanner in = new Scanner(System.in);
  
        
        	System.out.println("Digite a palavra desejada: \r\n");
       
        	while(contador<10) {
        		lista[contador] = in.nextLine();
        		contador++;
        		System.out.println("Proxima...\r\n");
        	}
			return lista;
        		

        
	
	}
}