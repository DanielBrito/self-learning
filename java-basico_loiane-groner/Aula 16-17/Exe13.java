package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe13 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int base, expoente, resultado=1;
		
		System.out.print("Digite a base: ");
		base = scan.nextInt();
		
		System.out.print("Digite o expoente: ");
		expoente = scan.nextInt();
		
		for(int i=expoente; i>0; i--) {
			
			resultado *= base ;
		}
		
		System.out.println("\nResultado: " + resultado);
	}
}
