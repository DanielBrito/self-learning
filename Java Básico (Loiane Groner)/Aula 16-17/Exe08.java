package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe08 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int soma=0;
		
		for(int i=0; i<5; i++) {
			
			System.out.printf("Digite o %do valor: ", i+1);
			int num = scan.nextInt();
			
			soma += num;
		}
		
		System.out.println("\nSoma: " + soma + "\nMédia: " + (soma/5));
	}

}
