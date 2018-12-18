package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe03 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[15];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
		}
		
		int vetorB[] = new int[15];
		
		for(int i=0; i<vetorB.length; i++) {
			
			vetorB[i] = (int) Math.pow(vetorA[i], 2);
		}
		
		System.out.print("\nVetor A: ");
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.print("\nVetor B: ");
		
		for(int i=0; i<vetorB.length; i++) {
			
			System.out.print("[" + vetorB[i] + "] ");
		}
	}
}
