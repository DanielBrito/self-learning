package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe05 {

	private static Scanner scan;

	public static void main(String[] args) {

		int populacaoA, populacaoB;
		scan = new Scanner(System.in);
		int anos=0;
		
		System.out.print("Digite a população do país A: ");
		populacaoA = scan.nextInt();
		
		System.out.print("Digite a população do país B: ");
		populacaoB = scan.nextInt();
		
		while(populacaoA<=populacaoB) {
			
			populacaoA += populacaoA*0.03;
			populacaoB += populacaoB*0.015;
			++anos;
		}
		
		System.out.println("\nAnos: " + anos);
	}

}
