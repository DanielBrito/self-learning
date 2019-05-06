package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe19 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		float[] nota1 = new float[10], nota2 = new float[10], result = new float[10];
		
		for(int i=0; i<10; i++) {
			
			System.out.printf("Primeira nota do aluno %d: ", i+1);
			nota1[i] = scan.nextFloat();
			
			System.out.printf("Segunda nota do aluno %d: ", i+1);
			nota2[i] = scan.nextFloat();
			
			result[i] = (nota1[i]+nota2[i])/2;
			
			System.out.println();
		}
		
		for(int i=0; i<10; i++) {
			
			if(result[i]<7) {
				
				System.out.println("\nMédia do aluno " + (i+1) + ": " + result[i] + " - Reprovado");
			}
			else {
				
				System.out.println("\nMédia do aluno " + (i+1) + ": " + result[i] + " - Aprovado");
			}
		}
	}
}
