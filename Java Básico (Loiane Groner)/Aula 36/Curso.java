package com.daniel.cursojava.aula36;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos = new Aluno[5];
	private int posicao=0;
	
	public Curso(String nome, String horario, Professor professor) {
		
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
	}
	
	public void adicionarAluno(Aluno novo) {
		
		alunos[posicao++] = novo;
	}
	
	public float calcularMediaGeral() {
		
		float soma=0;
		
		for(int i=0; i<alunos.length; i++) {
			
			soma += alunos[i].calcularMedia();
		}
		
		return (float) soma/alunos.length;
	}
	
	public String verificarSituacao() {
		
		String str = "";
		
		str += "Curso: " + nome;
		str += "\nProfessor: " + professor.getNome();
		str += "\n\n";
		
		for(int i=0; i<alunos.length; i++) {
			
			str += alunos[i].verificarStatus();
			str += "\n\n";
		}
		
		str += "Média geral: " + calcularMediaGeral();
		
		return str;
	}
}