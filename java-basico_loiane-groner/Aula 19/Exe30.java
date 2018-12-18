package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe30 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[20];
		int i, j=0, contPar=0, contImpar=0;
		
		for(i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]%2==1) {
				
				++contImpar;
			}
			else {
				
				++contPar;
			}
		}
		
		int vetorB[] = new int[contPar];
		int vetorC[] = new int[contImpar];
		
		for(i=0; i<vetorA.length; i++) {
			
			if(vetorA[i]%2==0) {
				
				vetorB[j++] = vetorA[i];
			}
		}
		
		j=0;
		
		for(i=0; i<vetorA.length; i++) {
			
			if(vetorA[i]%2==1) {
				
				vetorC[j++] = vetorA[i];
			}
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
