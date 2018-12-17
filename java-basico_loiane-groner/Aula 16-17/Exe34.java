package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe34 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		double soma=0;
		
		System.out.print("Digite o valor de n: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			soma += 1/i;
		}

		System.out.println("\nSoma: " + soma);
	}
}