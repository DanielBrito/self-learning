package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual turno voce estuda?\nM - Matutino\nV - Vespertino\nN - Noturno\n\nOpcao: ");
		char op = scan.next().charAt(0);
		
		if(op=='m' || op=='M') {
			
			System.out.println("\nBom dia!");
		}
		else
		if(op=='v' || op=='V') {
			
			System.out.println("\nBoa tarde!");
		}
		else
		if(op=='n' || op=='N') {
			
			System.out.println("\nBoa noite!");
		}
		else {
			
			System.out.println("\nOpcao invalida!");
		}
	}
}
