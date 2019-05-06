package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe25 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		while(true) {
			
			float preco=0, total=0, recebido=0;
			int contador=1;
			
			System.out.println("LOJAS TABAJARA\n");
			
			do {
				
				System.out.printf("Produto %d: R$ ", contador++);
				preco = scan.nextFloat();
				
				total += preco;				
				
			}while(preco!=0);
			
			System.out.printf("\nTotal: R$ %.2f", total);
			
			System.out.print("\nDinheiro: R$ " );
			recebido = scan.nextFloat();
			
			System.out.printf("Troco: R$ %.2f\n\n", recebido-total);	
		}
	}
}
