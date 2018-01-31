package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("O dobro da area do quadrado é " + area*2);
	}

}
