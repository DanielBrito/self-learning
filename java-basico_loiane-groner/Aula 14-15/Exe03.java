package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite seu sexo (F/M): ");
		char sexo = scan.next().charAt(0);
		
		if(sexo=='F' || sexo=='f') {
			
			System.out.println("Sexo Feminino.");
		}
		else
		if(sexo=='M' || sexo=='m') {
			
			System.out.println("Sexo Masculino.");
		}
		else {
			
			System.out.println("Sexo Inválido.");
		}

	}

}
