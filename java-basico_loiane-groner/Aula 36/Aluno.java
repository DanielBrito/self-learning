package com.daniel.cursojava.aula36;

public class Aluno {
	
	private String nome;
	private int matricula;
	private float[] notas = new float[4];
	
	public Aluno(String nome, int matricula, float[] notas) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public float calcularMedia() {
		
		float soma=0;
		
		for(int i=0; i<notas.length; i++) {
			
			soma += notas[i];
		}
		
		return (float) soma/notas.length;
	}

	public String verificarStatus() {
		
		String str = "";
		float soma=0;
		
		str += "Nome : " + nome;
		str += "\nMatrícula: " + matricula;
		
		for(int i=0; i<notas.length; i++) {
			
			soma += notas[i];
		}
		
		float media = soma/4;
		
		str += "\nMédia: " + media;
		
		if(media>=7) {
			
			str += "\nSituação: Aprovado";
		}
		else {
			
			str += "\nSituação: Reprovado";
		}
		
		return str;
	}
}
