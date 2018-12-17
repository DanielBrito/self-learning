package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe30 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int tabuada, min, max;
		
		System.out.print("Montar a tabuada de: ");
		tabuada = scan.nextInt();
		
		System.out.print("Começar por: ");
		min = scan.nextInt();
		
		System.out.print("Terminar em: ");
		max = scan.nextInt();
		
		if(max<min) {
			
			System.out.println("O valor inicial deve ser menor que o valor final.");
			
			System.out.print("Começar por: ");
			min = scan.nextInt();
			
			System.out.print("Terminar em: ");
			max = scan.nextInt();			
		}
		
		System.out.printf("\nTabuada do %d começando em %d e terminando em %d:\n", tabuada, min, max);
		
		for(int i=min; i<=max; i++) {
			
			System.out.printf("%d * %d = %d\n", tabuada, i, tabuada*i);
		}
	}
}
