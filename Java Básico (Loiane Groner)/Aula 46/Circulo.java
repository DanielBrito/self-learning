package com.daniel.cursojava.aula46;

public class Circulo extends Figura2D {

	private float raio;
	
	public Circulo(String nome, String cor, float raio) {
		
		super(nome, cor);
		this.raio = raio;
	}

	public float getRaio() {
		
		return raio;
	}

	public void setRaio(float raio) {
		
		this.raio = raio;
	}
	
	@Override
    public float calcularArea() {
		
        return (float) ((raio*raio)*Math.PI);
    }
}
