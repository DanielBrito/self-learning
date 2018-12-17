package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe35 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int i, j;
		double soma=0;
		
		System.out.print("Digite o valor de n: ");
		int n = scan.nextInt();
		
		for(i=1, j=1; i<=n; i++, j+=2) {
			
			soma += i/j;
		}

		System.out.println("\nSoma: " + soma);
	}
}