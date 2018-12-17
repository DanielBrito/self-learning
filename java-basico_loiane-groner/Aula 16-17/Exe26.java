package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe26 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Calcular fatorial do número: ");
		int num = scan.nextInt();
		
		if(num==0) {
			
			System.out.println("\n0! = 1");
		}
		else {
			
			int resultado = 1;
			
			for(int i=num; i>=1; i--) {
				
				resultado *= i;
			}
			
			System.out.println("\n" + num + "! = " + resultado);
		}
	}
}
