package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = scan.next().charAt(0);
		
		if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
			
			System.out.println("A letra digitada é uma vogal.");
		}
		else {
			
			System.out.println("A letra digitada é uma consoante.");
		}
	}
}
