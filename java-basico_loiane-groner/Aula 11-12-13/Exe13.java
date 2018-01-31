package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo para download (Mb): ");
		double tamanho = scan.nextDouble();
		
		System.out.print("Digite a velocidade da internet (Mbps): ");
		double velocidade = scan.nextDouble();
		
		double tempo = tamanho/velocidade;
		
		System.out.print("Tempo estimado para download: " + tempo + " segundos.");
	}

}
