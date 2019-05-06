package com.daniel.cursojava.aula36;

public class Professor {
	
	private String nome;
	private String departamento;
	private String email;
	
	public Professor(String nome, String departamento, String email) {
		
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
	}
	
	public String getNome() {
		
		return nome;
	}
}
