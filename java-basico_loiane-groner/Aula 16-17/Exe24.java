package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe24 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Digite o pre�o unit�rio do p�o: ");
		float preco = scan.nextFloat();
		
		System.out.println("\nPanificadora P�o de Ontem - Tabela de pre�os\n");

		for(int i=1; i<=50; i++) {
			
			System.out.printf("%d - R$ %.2f\n", i, i*preco);
		}
	}
}
