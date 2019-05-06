package com.daniel.cursojava.aula36;

import java.util.Scanner;

public class TestaCurso {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Curso curso = new Curso("Ci�ncia da Computa��o", "Integral", new Professor("Daniel", "Programa��o Gen�tica", "danielbrito@ufc.com.br"));

		for(int i=0; i<5; i++) {
			
			System.out.println("ALUNO " + (i+1));
			
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			
			System.out.print("Matr�cula: ");
			int matricula = scan.nextInt();
			
			float[] notas = new float[4];
			
			for(int j=0; j<notas.length; j++) {
				
				System.out.printf("%da nota: ", j+1);
				notas[j] = scan.nextFloat();
			}
			
			scan.nextLine();
			
			Aluno aluno = new Aluno(nome, matricula, notas);
			curso.adicionarAluno(aluno);
			
			System.out.println();
		}
		
		System.out.println("\nRELAT�RIO\n");
		
		System.out.println(curso.verificarSituacao());
	}
}
