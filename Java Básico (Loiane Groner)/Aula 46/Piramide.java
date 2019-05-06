package com.daniel.cursojava.aula46;

public class Piramide extends Figura3D {
	
	private float altura;
    private float arestaBase;
    private float apotema;
    private float numPoliBase;
    private Figura2D base;

	public Piramide(String nome, String cor, float altura, float arestaBase, float apotema, float numPoliBase,
			Figura2D base) {
		
		super(nome, cor);
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotema = apotema;
		this.numPoliBase = numPoliBase;
		this.base = base;
	}

	public void setNumPoliBase(int numPoliBase) {
    	
        this.numPoliBase = numPoliBase;
    }

	public float getAltura() {
		
		return altura;
	}

	public void setAltura(float altura) {
		
		this.altura = altura;
	}

	public float getArestaBase() {
		
		return arestaBase;
	}

	public void setArestaBase(float arestaBase) {
		
		this.arestaBase = arestaBase;
	}

	public float getApotema() {
		
		return apotema;
	}

	public void setApotema(float apotema) {
		
		this.apotema = apotema;
	}

	public float getNumPoliBase() {
		
		return numPoliBase;
	}

	public void setNumPoliBase(float numPoliBase) {
		
		this.numPoliBase = numPoliBase;
	}

	public Figura2D getBase() {
		
		return base;
	}

	public void setBase(Figura2D base) {
		
		this.base = base;
	}
    
	@Override
    public float calcularArea() {
		
        if (base!=null){
        	
            return (numPoliBase*((arestaBase*apotema)/2))+base.calcularArea();
        }
        
        return 0;
    }

    @Override
    public float calcularVolume() {
    	
        if (base!=null){
        	
           return (base.calcularArea()*altura)/3; 
        }
        
        return 0;
    }
}
