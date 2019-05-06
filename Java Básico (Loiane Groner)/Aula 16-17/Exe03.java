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
		
		System.out.print("Digite o sal�rio: ");
		double salario = scan.nextDouble();
		
		System.out.print("Digite o sexo (m/f): ");
		char sexo = scan.next().charAt(0);
		
		System.out.print("Digite o estado civil (c/s/d/v): ");
		char estadoCivil = scan.next().charAt(0);
		
		System.out.println("\nRELAT�RIO");
		
		if(nome.length()>3) {
			
			System.out.println("Nome: " + nome + " (V�LIDO)");
		}
		else {
			
			System.out.println("Nome: " + nome + " (INV�LIDO)");
		}
		
		if(idade>=0 && idade<=150) {
			
			System.out.println("Idade: " + idade + " (V�LIDA)");
		}
		else {
			
			System.out.println("Idade: " + idade + " (INV�LIDA)");
		}
		
		if(salario>0) {
			
			System.out.println("Sal�rio: R$ " + salario + " (V�LIDO)");
		}
		else {
			
			System.out.println("Sal�rio: R$ " + salario + " (INV�LIDO)");
		}
		
		if(sexo=='f' || sexo=='m') {
			
			System.out.println("Sexo: " + sexo + " (V�LIDO)");
		}
		else {
			
			System.out.println("Sexo: " + sexo + " (INV�LIDO)");
		}
		
		if(estadoCivil=='c' || estadoCivil=='s' || estadoCivil=='d' || estadoCivil=='v') {
			
			System.out.println("Estado civil: " + estadoCivil + " (V�LIDO)");
		}
		else {
			
			System.out.println("Estado civil: " + estadoCivil + " (INV�LIDO)");
		}
	}
}