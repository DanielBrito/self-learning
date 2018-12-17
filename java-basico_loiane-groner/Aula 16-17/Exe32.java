package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe32 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		double total=0;
		int codigo=0, quantidade;
		
		System.out.println("PEDIDO (0 - Sair):");
		
		while(true) {
			
			System.out.print("\nDigite o código: ");
			codigo = scan.nextInt();
			
			if(codigo==0) {
				
				break;
			}
			
			System.out.print("Digite a quantidade: ");
			quantidade = scan.nextInt();
			
			if(codigo==100 || codigo==103) {
				
				total += quantidade*1.20;
			}
			
			if(codigo==101 || codigo==104) {
				
				total += quantidade*1.30;
			}
			
			if(codigo==102) {
				
				total += quantidade*1.50;
			}
			
			if(codigo==105) {
				
				total += quantidade*1.00;
			}
			
		}
		
		System.out.println("\nTotal: R$ " + total);
	}
}
