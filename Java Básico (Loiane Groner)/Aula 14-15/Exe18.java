package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int numero = scan.nextInt();
		
		if(numero%2==0) {
			
			System.out.println("O n�mero " + numero + " � par.");
		}
		else {
			
			System.out.println("O n�mero " + numero + " � �mpar.");
		}
	}
}
