package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("Digite um ano: ");
			int ano = scan.nextInt();
			
			if((ano%4==0 && ano%100!=0) || (ano%400==0)) {
				
				System.out.println("É bissexto.\n");
			}
			else {
				
				System.out.println("Não é bissexto.\n");
			}
		}
	}
}