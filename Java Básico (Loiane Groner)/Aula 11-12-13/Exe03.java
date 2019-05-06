package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + soma);
	}
}
