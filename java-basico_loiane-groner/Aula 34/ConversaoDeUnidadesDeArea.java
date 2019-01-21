package com.daniel.cursojava.aula34;

public class ConversaoDeUnidadesDeArea {
	
	public static float metroQuadradoParaPÈQuadrado(float n) {
		
		return (float) (n*10.76);
	}
	
	public static float peQuadradoParaCentimetroQuadrado(float n) {
		
		return (float) (n*929);
	}
	
	public static float milhaQuadradaParaAcre(float n) {
		
		return (float) (n*640);
	}
	
	public static float acreParaPeQuadrado(float n) {
		
		return (float) (n*43560);
	}

}
