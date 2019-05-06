package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe17 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int qtd=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("Idade da %da pessoa: ", i+1);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]>35) {
				
				++qtd;
			}
		}
		
		System.out.println("\n" + qtd+ " pessoas têm mais de 35 anos de idade.");
	}
}
