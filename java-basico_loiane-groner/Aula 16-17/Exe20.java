package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe20 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int soma=0;
		
		System.out.print("Digite a quantidade de pessoas: ");
		int qtdPessoas = scan.nextInt();
		
		System.out.println();
		
		for(int i=0; i<qtdPessoas; i++) {
			
			System.out.printf("Digite a idade da %da pessoa: ", i+1);
			int idade = scan.nextInt();
			
			soma += idade;
		}
		
		float media = (float)soma/qtdPessoas;
		
		if(media>0 && media<=25) {
			
			System.out.println("\nA turma é jovem.");
		}
		else
		if(media>25 && media<=60) {
			
			System.out.println("\nA turma é adulta.");
		}
		else {
			
			System.out.println("\nA turma é idosa.");
		}
	}
}
