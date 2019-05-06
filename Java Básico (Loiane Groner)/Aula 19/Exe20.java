package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe20 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		float dolar;
		
		System.out.print("Digite a cotação do dólar: ");
		dolar = scan.nextFloat();
		
		System.out.println();
		
		for(int i=1; i<=20; i++) {
			
			System.out.printf("%.2f * %d = %.2f\n", dolar, i, dolar*i);
		}
	}
}
