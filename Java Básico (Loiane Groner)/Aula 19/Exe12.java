package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe12 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int soma=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
			
			soma += vetorA[i];
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println("\n\nSoma dos elementos: " + soma);
	}
}
