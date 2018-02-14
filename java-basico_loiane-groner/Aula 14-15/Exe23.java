package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double total = 0, desconto = 0, valorPagar = 0;
		
		System.out.print("Digite o tipo de carne:\nF-ile duplo\nA-lcatra\nP-icanha\nOpcao: ");
		char op = scan.next().charAt(0);
		
		System.out.print("Digite a quantidade comprada em Kg: ");
		double qtd = scan.nextDouble();
		
		if(op=='f'||op=='F') {
			
			if(qtd<=5) {
				
				total = qtd*4.90;
			}
			else {
				
				total = qtd*5.80;
			}
		}
		else
		if(op=='a'||op=='A') {
			
			if(qtd<=5) {
				
				total = qtd*5.90;
			}
			else {
				
				total = qtd*6.80;
			}
		}
		else
		if(op=='p'||op=='P') {
			
			if(qtd<=5) {
				
				total = qtd*6.90;
			}
			else {
				
				total = qtd*7.80;
			}
		}
		
		System.out.print("Pagamento com cartão Tabajara? ");
		char formaPgt = scan.next().charAt(0);
		
		if(formaPgt=='s'||formaPgt=='S') {
			
			desconto = total*0.05;
			valorPagar = total - desconto;
		}
		
		System.out.println("\n");
		
		System.out.print("Tipo de carne: ");
		
		if(op=='f'||op=='f') {
			
			System.out.println("File duplo");
		}
		else
		if(op=='a'||op=='A') {
			
			System.out.println("Alcatra");
		}
		else {
			
			System.out.println("Picanha");
		}
		
		System.out.println("Quantidade: " + qtd + "Kg");
		
		System.out.println("Total: " + total);
		
		System.out.print("Tipo de pagamento: ");
		
		if(formaPgt=='s'||formaPgt=='S') {
			
			System.out.println("Cartão Tabajara");
		}
		else {
			
			System.out.println("Dinheiro");
		}
		
		System.out.println("Desconto: R$ " + desconto);
		
		System.out.println("Valor a pagar: R$ " + valorPagar);
	}
}