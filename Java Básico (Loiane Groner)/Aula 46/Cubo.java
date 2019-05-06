package com.daniel.cursojava.aula46;

public class Cubo extends Figura3D {
	
	private int lado;

	public Cubo(String nome, String cor, int lado) {
		
		super(nome, cor);
		this.lado = lado;
	}

	public int getLado() {
		
		return lado;
	}

	public void setLado(int lado) {
		
		this.lado = lado;
	}

	@Override
    public float calcularArea() {
		
        return 6*(lado*lado);
    }

    @Override
    public float calcularVolume() {
    	
        return lado*lado*lado;
    }
}
