package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe21 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int qtdTurmas=0, qtdAlunos=0, total=0;
		
		System.out.print("Digite a quantidade de turmas: ");
		qtdTurmas = scan.nextInt();
		
		for(int i=0; i<qtdTurmas; i++) {
			
			System.out.printf("\nTURMA %d\n", i+1);
			
			System.out.print("Digite a quantidade de alunos: ");
			qtdAlunos = scan.nextInt();	
			
			while(qtdAlunos<0 || qtdAlunos>40) {
				
				System.out.print("Digite a quantidade de alunos: ");
				qtdAlunos = scan.nextInt();				
			}
			
			total += qtdAlunos;
		}
		
		System.out.printf("\nNúmero médio de alunos: %.2f", ((float)total/qtdTurmas));
	}
}
