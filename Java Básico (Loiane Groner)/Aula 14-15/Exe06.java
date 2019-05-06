package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int num3 = scan.nextInt();
		
		int maior;
		
		maior = (num1+num2 + Math.abs(num1-num2))/2;
		
		maior = (maior+num3 + Math.abs(maior-num3))/2;
		
		System.out.println("O maior número é " + maior);
	}

}
