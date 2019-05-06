package com.daniel.cursojava.aula46;

public class FiguraGeometrica {
	
	private String nome;
	private String cor;

	public FiguraGeometrica(String nome, String cor) {
		
		this.nome = nome;
		this.cor = cor;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		
		this.cor = cor;
	}	
}
