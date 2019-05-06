package com.daniel.cursojava.aula34;

public class ConversaoDeUnidadesDeTempo {
	
	public static float minutoParaSegundo(int t) {
		
		return (float) (t*60);
	}
	
	public static float horaParaMinuto(int t) {
		
		return (float) (t*60);
	}
	
	public static float diaParaHora(int t) {
		
		return (float) (t*24);
	}
	
	public static float semanaParaDia(int t) {
		
		return (float) (t*7);
	}
	
	public static float mesParaDia(int t) {
		
		return (float) (t*30);
	}
	
	public static float anoParaDia(int t) {
		
		return (float) (t*365.25);
	}
}
