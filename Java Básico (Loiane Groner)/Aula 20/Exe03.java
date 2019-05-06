package com.daniel.cursojava.aula20;

import java.util.Scanner;

public class Exe03 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int qtdPares=0, qtdImpares=0;
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				System.out.printf("Valor da posição [%d][%d]: ", i, j);
				matriz[i][j] = scan.nextInt();
				
				if(matriz[i][j]%2==0) {
					
					++qtdPares;
				}
				else {
					
					++qtdImpares;
				}
			}
		}
		
		System.out.println();
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				System.out.printf("[%d] ", matriz[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println("\nQuantidade de elementos pares: " + qtdPares);
		System.out.println("Quantidade de elementos impares: " + qtdImpares);
	}
}
