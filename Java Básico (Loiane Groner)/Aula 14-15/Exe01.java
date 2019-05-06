package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite outro numero: ");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			
			System.out.println("O maior numero é " + num1);
		}
		else
		if(num2>num1) {
			
			System.out.println("O maior numero é " + num2);	
		}
		else {
			
			System.out.println("Os números são iguais");
		}
	}
}
