package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe03 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = scan.next();
		
		System.out.print("Digite a idade: ");
		int idade = scan.nextInt();
		
		System.out.print("Digite o salário: ");
		double salario = scan.nextDouble();
		
		System.out.print("Digite o sexo (m/f): ");
		char sexo = scan.next().charAt(0);
		
		System.out.print("Digite o estado civil (c/s/d/v): ");
		char estadoCivil = scan.next().charAt(0);
		
		System.out.println("\nRELATÓRIO");
		
		if(nome.length()>3) {
			
			System.out.println("Nome: " + nome + " (VÁLIDO)");
		}
		else {
			
			System.out.println("Nome: " + nome + " (INVÁLIDO)");
		}
		
		if(idade>=0 && idade<=150) {
			
			System.out.println("Idade: " + idade + " (VÁLIDA)");
		}
		else {
			
			System.out.println("Idade: " + idade + " (INVÁLIDA)");
		}
		
		if(salario>0) {
			
			System.out.println("Salário: R$ " + salario + " (VÁLIDO)");
		}
		else {
			
			System.out.println("Salário: R$ " + salario + " (INVÁLIDO)");
		}
		
		if(sexo=='f' || sexo=='m') {
			
			System.out.println("Sexo: " + sexo + " (VÁLIDO)");
		}
		else {
			
			System.out.println("Sexo: " + sexo + " (INVÁLIDO)");
		}
		
		if(estadoCivil=='c' || estadoCivil=='s' || estadoCivil=='d' || estadoCivil=='v') {
			
			System.out.println("Estado civil: " + estadoCivil + " (VÁLIDO)");
		}
		else {
			
			System.out.println("Estado civil: " + estadoCivil + " (INVÁLIDO)");
		}
	}
}