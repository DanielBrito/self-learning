package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numInt1 = scan.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int numInt2 = scan.nextInt();
		
		System.out.print("Digite um número real: ");
		double numReal = scan.nextDouble();
		
		System.out.println("a) Produto do dobro do primeiro com a metade do segundo: " + (2*numInt1)*((double)numInt2/2)); 
		System.out.println("b) Soma do triplo do primeiro com o terceiro: " + (3*numInt1)+numReal); 
		System.out.println("c) Terceiro elevado ao cubo: " + Math.pow(numReal, 3)); 
	}

}
