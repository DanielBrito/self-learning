package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media>=9 && media<=10) {
			
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: A");
			System.out.println("Situação: Aprovado");
		}
		else
		if(media>=7.5 && media<9) {
			
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: B");
			System.out.println("Situação: Aprovado");
		}
		else
		if(media>=6 && media<7.5) {
			
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: C");
			System.out.println("Situação: Aprovado");
		}
		else
		if(media>=4 && media<6) {
			
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: D");
			System.out.println("Situação: Reprovado");
		}
		else {
			
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: E");
			System.out.println("Situação: Reprovado");
		}
	}
}
