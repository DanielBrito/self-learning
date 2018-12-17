package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe01 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		double nota;
		
		do {
			
			System.out.print("Digite uma nota (0 à 10): ");
			nota = scan.nextDouble();
			
			if(nota<0 || nota>10) {
				
				System.out.println("Valor inválido!");
			}
			
		}while(nota<0 || nota>10);
		
		System.out.println("Nota digitada: " + nota);
	}
}