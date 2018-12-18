package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe25 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
		}
		
		int vetorB[] = new int[10];
		
		for(int i=0; i<vetorB.length; i++) {
			
			if(vetorA[i]%2==0) {
				
				vetorB[i] = 1;
			}
			else {
				
				vetorB[i] = 0;
			}
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
