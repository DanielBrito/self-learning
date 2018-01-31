package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		int[] notas = new int[4];
		int soma = 0;
		double media = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<notas.length; i++) {
			
			System.out.println("Digite a nota " + (i+1));
			notas[i] = scan.nextInt();
			
			soma += notas[i];
		}
		
		media = soma/notas.length;
		
		System.out.println("A media do aluno é " + media);
	}

}
