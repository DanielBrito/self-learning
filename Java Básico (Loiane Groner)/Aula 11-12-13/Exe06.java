package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do raio do c�rculo: ");
		double raio = scan.nextDouble();
		
		double areaCirculo = 3.14 * Math.pow(raio, 2.0);
		
		System.out.println("A �rea do c�rculo � " + areaCirculo);
	}

}
