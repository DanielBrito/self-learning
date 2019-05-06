package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe14 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int qtdPares=0, qtdImpares=0;
		
		for(int i=0; i<10; i++) {
			
			System.out.printf("Digite o %do número: ", i+1);
			int num = scan.nextInt();
			
			if(num%2==0) {
				
				++qtdPares;
			}
			else {
				
				++ qtdImpares;
			}
		}

		System.out.println("\nQuantidade de números pares: " + qtdPares + "\nQuantidade de números ímpares: " + qtdImpares);
	}
}
