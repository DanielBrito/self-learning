package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe19 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int soma=0;
		
		System.out.print("Digite a quantidade de notas: ");
		int qtdNotas = scan.nextInt();
		
		System.out.println();
		
		for(int i=0; i<qtdNotas; i++) {
			
			System.out.printf("Digite a %da nota: ", i+1);
			int nota = scan.nextInt();
			
			soma += nota;			
		}
		
		System.out.println("\nMédia aritmética: " + (soma/qtdNotas));
	}
}
