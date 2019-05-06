package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		double grauF = scan.nextDouble();
		
		double grauC = (5*(grauF-32))/9;
		
		System.out.println("Temperatura em graus Celsius: " + grauC);	
	}
}
