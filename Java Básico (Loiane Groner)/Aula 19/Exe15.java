package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe15 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int qtdPares=0, qtdImpares=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]%2==1) {
				
				++qtdImpares;
			}	
			else {
				
				++qtdPares;
			}
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.printf("\n\nPercentual de elementos pares: %.1f%%\n", 100*((float) qtdPares/10));
		System.out.printf("\nPercentual de elementos ímpares: %.1f%%", 100*((float) qtdImpares/10));
	}
}
