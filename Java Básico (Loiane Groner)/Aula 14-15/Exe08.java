package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double min = Integer.MAX_VALUE,  preco;
		int codigo = 0;
		
		for(int i=1; i<=3; i++) {
			
			System.out.print("Digite o preço do produto " + i + ": ");
			preco = scan.nextDouble();
			
			if(preco<min) {
				
				min = preco;
				codigo = i;
			}
		}
		
		System.out.println("\nO produto " + codigo + " possui menor preco: R$ " + min);
	}
}
