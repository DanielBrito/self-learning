package com.daniel.cursojava.aula43;

public abstract class Pessoa {
	
	private String nome;
	private float renda;
	
	public Pessoa(String nome, float renda) {
		
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public float getRenda() {
		
		return renda;
	}

	public void setRenda(float renda) {
		
		this.renda = renda;
	}
	
	public abstract float calcularImposto();
}
