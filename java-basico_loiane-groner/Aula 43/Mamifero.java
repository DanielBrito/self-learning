package com.daniel.cursojava.aula43;

public class Mamifero extends Animal {
	
	private String alimento;
    
    public Mamifero() {
    	
        super();
        this.setCor("Castanho");
        this.setAmbiente("Terra");
        this.alimento = "Mel";
    }
    
    @Override
    public String toString() {
    	
    	return super.toString() + "\nAlimento: " + alimento;
    }
}
