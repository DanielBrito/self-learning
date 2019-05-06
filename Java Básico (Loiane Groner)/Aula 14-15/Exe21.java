package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double total, desconto, valor;
		
		System.out.print("Digite o tipo de combustível: ");
		char combustivel = scan.next().charAt(0);
		
		System.out.print("Digite a quantidade de litros: ");
		int litros = scan.nextInt();
		
		if(combustivel=='a'||combustivel=='a') {
			
			if(litros<=20) {
				
				valor = (litros*1.90);
				desconto = litros*(1.90*0.03);
				total = valor-desconto;
				
				System.out.println("\nValor: R$ "+ valor + "\nDesconto: R$ " + desconto + "\nTotal: R$ " + total);
			}
			else {
				
				valor = (litros*1.90);
				desconto = litros*(1.90*0.05);
				total = valor-desconto;
				
				System.out.println("Valor: R$ "+ valor + "\nDesconto: R$ " + desconto + "\nTotal: R$ " + total);
			}
		}
		else
		if(combustivel=='g'||combustivel=='G') {
			
			if(litros<=20) {
				
				valor = (litros*2.50);
				desconto = litros*(2.50*0.04);
				total = valor-desconto;
				
				System.out.println("Valor: R$ "+ valor + "\nDesconto: R$ " + desconto + "\nTotal: R$ " + total);
			}
			else {
				
				valor = (litros*2.50);
				desconto = litros*(2.50*0.06);
				total = valor-desconto;
				
				System.out.println("Valor: R$ "+ valor + "\nDesconto: R$ " + desconto + "\nTotal: R$ " + total);
			}
		}
	}
}
