package com.daniel.cursojava.aula46;

public class Quadrado extends Figura2D {

	private float lado;
	
	public Quadrado(String nome, String cor, float lado) {
		
		super(nome, cor);
		this.lado = lado;
	}

	public float getLado() {
		
		return lado;
	}

	public void setLado(float lado) {
		
		this.lado = lado;
	}

	@Override
	public float calcularArea() {
		
		return lado*lado;
	}
}
