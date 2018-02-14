package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double resultado;
		
		System.out.print("Digite o primeiro número: ");
		double num1 = scan.nextInt();
		
		System.out.print("Digite o segundo número: ");
		double num2 = scan.nextInt();
		
		System.out.print("Digite a operação que deseja realizar: ");
		char op = scan.next().charAt(0);
		
		if(op=='+') {
			
			resultado = num1+num2;
			
			if(resultado%2==0) {
				
				System.out.print("O resultado " + resultado + " é par e ");
			}
			else {
				
				System.out.print("O resultado " + resultado + " é ímpar e ");
			}
			
			if(resultado<0) {
				
				System.out.print("negativo.");
			}
			else {
				
				System.out.print("positivo.");
			}
		}
		else
		if(op=='-') {
			
			resultado = num1-num2;
			
			if(resultado%2==0) {
				
				System.out.print("O resultado " + resultado + " é par e ");
			}
			else {
				
				System.out.print("O resultado " + resultado + " é ímpar e ");
			}
			
			if(resultado<0) {
				
				System.out.print("negativo.");
			}
			else {
				
				System.out.print("positivo.");
			}
		}
		else
		if(op=='*') {
			
			resultado = num1*num2;
			
			if(resultado%2==0) {
				
				System.out.print("O resultado " + resultado + " é par e ");
			}
			else {
				
				System.out.print("O resultado " + resultado + " é ímpar e ");
			}
			
			if(resultado<0) {
				
				System.out.print("negativo.");
			}
			else {
				
				System.out.print("positivo.");
			}
		}
		else {
			
			if(num2==0) {
				
				System.out.println("Não é possível realizar divisão por zero.");
			}
			else {
				
				resultado = num1/num2;
				
				if(resultado%2==0) {
					
					System.out.print("O resultado " + resultado + " é par e ");
				}
				else {
					
					System.out.print("O resultado " + resultado + " é ímpar e ");
				}
				
				if(resultado<0) {
					
					System.out.print("negativo.");
				}
				else {
					
					System.out.print("positivo.");
				}
			}
		}
	}
}
