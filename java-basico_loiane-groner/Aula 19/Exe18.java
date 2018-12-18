package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe18 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int maior=Integer.MIN_VALUE, menor=Integer.MAX_VALUE, posicaoMaior=0, posicaoMenor=0;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("Idade da %da pessoa: ", i+1);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]>maior) {
				
				maior = vetorA[i];
				posicaoMaior = i;
			}
			
			if(vetorA[i]<menor) {
				
				menor = vetorA[i];
				posicaoMenor = i;
			}
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println("\n\nMaior idade: " + maior + " -> Posicao [" + posicaoMaior + "]");
		System.out.println("Menor idade: " + menor + " -> Posicao [" + posicaoMenor + "]");
	}
}
