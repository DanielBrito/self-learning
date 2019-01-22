package com.daniel.cursojava.aula43;

public class Peixe extends Animal {
	
	private String caracteristicas;
    
    public Peixe() {
    	
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }
    
    @Override
    public String toString() {
    	
    	return super.toString() + "\nCaracterísticas: " + caracteristicas;
    }

}
