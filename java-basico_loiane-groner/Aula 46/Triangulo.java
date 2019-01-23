package com.daniel.cursojava.aula46;

public class Triangulo extends Figura2D {

	private float base;
	private float altura;
	
	public Triangulo(String nome, String cor, float base, float altura) {
		
		super(nome, cor);
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		
		return base;
	}

	public void setBase(float base) {
		
		this.base = base;
	}

	public float getAltura() {
		
		return altura;
	}

	public void setAltura(float altura) {
		
		this.altura = altura;
	}

	@Override
	public float calcularArea() {

		return (base*altura)/2.0f;
	}
}
