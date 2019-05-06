package com.daniel.cursojava.aula27;

import java.util.Scanner;

public class TestaAluno {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nome;
		int matricula;
		String curso;
		String[] disciplinas = new String[3];
		float[][] notas = new float[3][3];
		
		System.out.println("UFC - Universidade Federal do Ceará\n");
		
		System.out.print("Digite o nome do aluno: ");
		nome = scan.nextLine();
		
		System.out.print("Digite a matrícula: ");
		matricula = scan.nextInt();
		
		scan.nextLine(); // Consumir caractere
		
		System.out.print("Digite o curso: ");
		curso = scan.nextLine();
		
		for(int i=0; i<disciplinas.length; i++) {
			
			System.out.printf("Digite o nome da %da disciplina: ", i+1);
			disciplinas[i] = scan.nextLine();
		}
		
		for(int i=0; i<notas.length; i++) {
			
			System.out.println("\n" + disciplinas[i]);
			
			for(int j=0; j<notas[i].length; j++) {
				
				System.out.printf("Digite a %da nota: ", j+1);
				notas[i][j] = scan.nextFloat();
			}
		}
		
		Aluno aluno = new Aluno(nome, matricula, curso, disciplinas, notas);
		
		aluno.verificarAprovacao();
	}
}
