package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe24 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		
		for(int i=0; i<vetor.length; i++) {
			
			System.out.print("Valor " + (i+1) + ": ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println();
		
		for(int i=0; i<vetor.length; i++) {
			
			System.out.print("[" + vetor[i] + "] ");
		}
		
		for(int i=0, j=(vetor.length)-1; i<vetor.length || j>=0; i++, j--) {
			
			if(vetor[i]!=vetor[j]) {
				
				System.out.println("\n\nO vetor não é palíndromo");
				return;
			}
		}
		
		System.out.println("\n\nO vetor é palíndromo");
	}
}
