package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1 = scan.nextInt();
		
		if(num1>maior) {
			
			maior = num1;
		}
		
		if(num1<menor) {
			
			menor = num1;
		}
		
		System.out.print("Digite o segundo n�mero: ");
		num2 = scan.nextInt();
		
		if(num2>maior) {
			
			maior = num2;
		}
		
		if(num2<menor) {
			
			menor = num2;
		}
		
		System.out.print("Digite o terceiro n�mero: ");
		num3 = scan.nextInt();
		
		if(num3>maior) {
			
			maior = num3;
		}
		
		if(num3<menor) {
			
			menor = num3;
		}
		
		System.out.println("Menor n�mero: " + menor);
		System.out.println("Maior n�mero: " + maior);
	}
}
