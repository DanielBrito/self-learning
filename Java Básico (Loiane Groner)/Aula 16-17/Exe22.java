package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe22 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		float soma=0;
	
		System.out.print("Digite a quantidade de CDs: ");
		int qtdCDs = scan.nextInt();
		
		System.out.println();
		
		for(int i=0; i<qtdCDs; i++) {
			
			System.out.printf("Digite o preço do %do CD: ", i+1);
			float preco = scan.nextFloat();
			
			soma += preco;
		}
		
		System.out.printf("\nValor médio de cada CD: R$ %.2f", soma/qtdCDs);
	}
}
