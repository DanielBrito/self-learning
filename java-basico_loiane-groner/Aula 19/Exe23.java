package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe23 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("Valor " + (i+1) + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			if(vetorA[i]%2==1) {
				
				System.out.println("\nO vetor não tem todos os elementos pares");
				return;
			}
		}
		
		System.out.println("\nO vetor tem todos os elementos pares");		
	}
}
