package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double resultado;
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = scan.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		double num2 = scan.nextInt();
		
		System.out.print("Digite a opera��o que deseja realizar: ");
		char op = scan.next().charAt(0);
		
		if(op=='+') {
			
			resultado = num1+num2;
			
			if(resultado%2==0) {
				
				System.out.print("O resultado " + resultado + " � par e ");
			}
			else {
				
				System.out.print("O resultado " + resultado + " � �mpar e ");
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
				
				System.out.print("O resultado " + resultado + " � par e ");
			}
			else {
				
				System.out.print("O resultado " + resultado + " � �mpar e ");
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
				
				System.out.print("O resultado " + resultado + " � par e ");
			}
			else {
				
				System.out.print("O resultado " + resultado + " � �mpar e ");
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
				
				System.out.println("N�o � poss�vel realizar divis�o por zero.");
			}
			else {
				
				resultado = num1/num2;
				
				if(resultado%2==0) {
					
					System.out.print("O resultado " + resultado + " � par e ");
				}
				else {
					
					System.out.print("O resultado " + resultado + " � �mpar e ");
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
