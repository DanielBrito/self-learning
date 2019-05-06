package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menor=Integer.MAX_VALUE, meio=0, maior=Integer.MIN_VALUE;
		
		System.out.print("Digite o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int num2 = scan.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		int num3 = scan.nextInt();
		
		if(num1<=num2 && num1<=num3) {
			
			menor = num1;
			
			if(num2<=num3) {
				
				meio = num2;
				maior = num3;
			}
			else {
				
				meio = num3;
				maior = num2;
			}
		}
		
		if(num2<=num1 && num2<=num3) {
			
			menor = num2;
			
			if(num1<=num3) {
				
				meio = num1;
				maior = num3;
			}
			else {
				
				meio = num3;
				maior = num1;
			}
		}
		
		if(num3<=num1 && num3<=num2) {
			
			menor = num3;
			
			if(num1<=num2) {
				
				meio = num1;
				maior = num2;
			}
			else {
				
				meio = num2;
				maior = num1;
			}
		}
		
		System.out.println("Ordem descrescente: " + maior + " " + meio + " " + menor);
	}
}
