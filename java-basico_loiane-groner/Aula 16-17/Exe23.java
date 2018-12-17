package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe23 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Loja Quase Dois - Tabela de preços\n");

		for(int i=1; i<=50; i++) {
			
			System.out.printf("%d - R$ %.2f\n", i, i*1.99);
		}
	}
}
