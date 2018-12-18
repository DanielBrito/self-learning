package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe27 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		char vetorB[] = new char[10];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]<7) {
				
				vetorB[i] = 'a';
			}
			else
			if(vetorA[i]==7) {
				
				vetorB[i] = 'b';
			}
			else
			if(vetorA[i]>7 && vetorA[i]<10) {
				
				vetorB[i] = 'c';
			}
			else
			if(vetorA[i]==10) {
				
				vetorB[i] = 'd';
			}
			else
			if(vetorA[i]>10) {
				
				vetorB[i] = 'e';
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
