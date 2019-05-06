package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe10 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int numA, numB;
		
		System.out.print("Digite o primeiro valor: ");
		numA = scan.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		numB = scan.nextInt();
		
		System.out.println();
		
		if(numB>=numA) {
			
			for(int i=numA; i<=numB; i++) {
				
				System.out.print(i + " ");
			}
		}
		else {
			
			for(int i=numB; i<=numA; i++) {
				
				System.out.print(i + " ");
			}
		}
	}
}
