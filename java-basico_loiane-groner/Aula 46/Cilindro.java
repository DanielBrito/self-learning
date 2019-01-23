package com.daniel.cursojava.aula46;

public class Cilindro extends Figura3D {
	
	private int altura;
    private float raio;

	public Cilindro(String nome, String cor, int altura, float raio) {
		
		super(nome, cor);
		this.altura = altura;
		this.raio = raio;
	}

	public int getAltura() {
		
		return altura;
	}

	public void setAltura(int altura) {
		
		this.altura = altura;
	}

	public float getRaio() {
		
		return raio;
	}

	public void setRaio(float raio) {
		
		this.raio = raio;
	}

	@Override
    public float calcularArea() {
        
		float areaBase = (float) (Math.PI*(raio*raio));
		float areaLateral = (float) (2*Math.PI*raio*altura);
		float areaTotal = (2*areaBase) + areaLateral;
        
        return areaTotal;
    }

    @Override
    public float calcularVolume() {
    	
        return (float) (Math.PI*(raio*raio)*altura);
    }
}
