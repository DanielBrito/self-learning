package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double valorMorango, valorMaca, total;
		
		System.out.print("Digite a quantidade em Kg de morango: ");
		double pesoMorango = scan.nextDouble();
		
		System.out.print("Digite a quantidade em Kg de maçã: ");
		double pesoMaca = scan.nextDouble();
		
		if(pesoMorango<=5) {
			
			valorMorango = pesoMorango*2.50;
		}
		else {
			
			valorMorango = pesoMorango*2.20;
		}
		
		if(pesoMaca<=5) {
			
			valorMaca = pesoMaca*1.80;
		}
		else {
			
			valorMaca = pesoMaca*1.50;
		}
		
		
		total = valorMorango + valorMaca;
		
		if((pesoMorango+pesoMaca)>8 || total>25) {
			
			total = total - (total*0.10);
		}
		
		System.out.println("\nValor a ser pago: R$ " + total);
	}
}
