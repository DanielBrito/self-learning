package com.daniel.cursojava.aula27;

public class Aluno {
	
	private String nome;
	private int matricula;
	private String curso;
	private String[] disciplinas = new String[3];
	private float[][] notas = new float[3][3];
	
	public Aluno(String nome, int matricula, String curso, String[] disciplinas, float[][] notas) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.notas = notas;
	}
	
	public void verificarAprovacao() {
		
		float soma;
		
		for(int i=0; i<disciplinas.length; i++) {
			
			soma=0;
			
			System.out.println("\n" + disciplinas[i]);
	
			for(int k=0; k<notas[i].length; k++) {
				
				System.out.printf("Nota [%d]: %.2f\n", k+1, notas[i][k]);
				soma += notas[i][k];					
			}
			
			if((soma/3)>=7) {
				
				System.out.println("Resultado: Aprovado");
			}
			else {
				
				System.out.println("Resultado: Reprovado");
			}
			
			System.out.println();
		}
	}
}