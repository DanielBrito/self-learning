package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe18 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		
		int divisores=0;
		
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				
				++divisores;
			}
			
			if(divisores>2 || num==1) {
				
				System.out.println("\nO número não é primo.");
				
				return;
			}
		}
		
		System.out.println("\nO número é primo.");
	}
}