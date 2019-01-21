package com.daniel.cursojava.aula34;

public class Contador {
	
	public static int contador;
	
	public Contador() {
		
		++contador;
	}
	
	public static void zerarContador() {
		
		contador=0;
	}
	
	public static int retornarContador() {
		
		return contador;
	}
}
