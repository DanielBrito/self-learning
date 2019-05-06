package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe07 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int maior = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
			
			System.out.printf("Digite o %do número: ", (i+1));
			int num = scan.nextInt();
			
			if(num>maior) {
				
				maior = num;
			}
		}
		
		System.out.println("\nO maior número é: " + maior);
	}

}
