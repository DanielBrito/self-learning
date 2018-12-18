package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe29 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[20];
		int i, j=0;
		
		for(i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
		}
		
		for(i=0; i<vetorB.length; i++) {
			
			System.out.printf("VetorB[%d] = ", i);
			vetorB[i] = scan.nextInt();
		}
		
		for(i=0; i<vetorA.length; i++) {
			
			vetorC[j] = vetorA[i];
			j++;
		}
		
		for(i=0 ; i<vetorB.length; i++) {
			
			vetorC[j] = vetorB[i];
			j++;
		}
		
		System.out.print("\nVetor A: ");
		
		for(i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.print("\nVetor B: ");
		
		for(i=0; i<vetorB.length; i++) {
			
			System.out.print("[" + vetorB[i] + "] ");
		}
		
		System.out.print("\nVetor C: ");
		
		for(i=0; i<vetorC.length; i++) {
			
			System.out.print("[" + vetorC[i] + "] ");
		}
	}
}
