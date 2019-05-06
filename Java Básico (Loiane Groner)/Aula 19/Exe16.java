package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe16 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int somaMenor=0, somaMaior=0, qtdIgual=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]<15) {
				
				somaMenor += vetorA[i];
			}
			
			if(vetorA[i]==15) {
				
				++qtdIgual;
			}
			
			if(vetorA[i]>15) {
				
				somaMaior += vetorA[i];
			}
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println("\n\na) " + somaMenor);
		System.out.println("b) " + qtdIgual);
		System.out.printf("c) %.2f", (float)somaMaior/10);
	}
}
