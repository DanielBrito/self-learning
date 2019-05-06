package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe14 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int soma=0, qtdImpares=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]%2==1) {
				
				soma += vetorA[i];
				++qtdImpares;
			}
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.printf("\n\nMédia aritmética dos elementos ímpares: %.2f", (float)soma/qtdImpares);
	}
}
