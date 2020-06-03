package br.com.unip.dados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import br.com.unip.algoritmos.BubbleSort;
import br.com.unip.algoritmos.InsertionSort;
import br.com.unip.algoritmos.QuickSort;

public class Dados {
	


	public static String[] gerarArray() throws FileNotFoundException {
		

		int contador = 0;
		String[] lista = new String[100];
		BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
  
		try {
			while(br.ready()){
					lista[contador] = br.readLine();
					contador++;
				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return lista;
        		

        
	
	}
}