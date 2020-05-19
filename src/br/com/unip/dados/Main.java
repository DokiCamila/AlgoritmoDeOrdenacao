package br.com.unip.dados;

import java.io.IOException;
import java.util.Scanner;

import br.com.unip.algoritmos.*;


public class Main {
	public static void main(String[] args) throws IOException {
			
		 System.out.println("Selecione qual dos algoritmos você deseja testar:");
		 System.out.println("1 - BubbleSort;");
		 System.out.println("2 - InsertionSort;");
		 System.out.println("3 - QuickSort;");
		
		
		 
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int opcao = Integer.parseInt(in.nextLine()); 
        
        if (opcao == 1 ) {
        	String[] vetorTeste= Dados.gerarArray();
        	long tempoInicial = System.currentTimeMillis();
        	BubbleSort.start(vetorTeste);
    		long tempoFinal = System.currentTimeMillis();
    		System.out.println(" BubbleSort executado em = " + (tempoFinal - tempoInicial) + " ms");
        	
        }else if (opcao == 2) {
        	String[] vetorTeste= Dados.gerarArray();
        	long tempoInicial = System.currentTimeMillis();
        	InsertionSort.start(vetorTeste);
    		long tempoFinal = System.currentTimeMillis();
    		System.out.println(" InsertionSort executado em = " + (tempoFinal - tempoInicial) + " ms");
        	
        }else if (opcao == 3) {
        	String[] vetorTeste= Dados.gerarArray();
        	long tempoInicial = System.currentTimeMillis();
        	QuickSort.start(vetorTeste,0, vetorTeste.length - 1);
    		long tempoFinal = System.currentTimeMillis();
    		System.out.println(" QuickSort executado em = " + (tempoFinal - tempoInicial) + " ms");
        }else {
        	System.out.println("Opção Invalida!!");
        }
		
	}
	
	
}
