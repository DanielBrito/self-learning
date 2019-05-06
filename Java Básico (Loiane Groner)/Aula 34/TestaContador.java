package com.daniel.cursojava.aula34;

public class TestaContador {

	public static void main(String[] args) {
	
		Contador cont1 = new Contador();
		Contador cont2 = new Contador();
		Contador cont3 = new Contador();
		Contador cont4 = new Contador();
		
		System.out.println("Valor do contador: " + Contador.retornarContador());
		
		Contador.zerarContador();
		
		System.out.println("Valor do contador: " + Contador.retornarContador());
	}
}
