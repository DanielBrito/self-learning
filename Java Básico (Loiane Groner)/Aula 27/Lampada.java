package com.daniel.cursojava.aula27;

public class Lampada {
	
	String fabricante;
	float preco;
	String tipo;
	String tensao;
	int potencia;
	boolean ligada;
	
	public void ligar() {
		
		ligada = true;
	}
	
	public void desligar() {
		
		ligada = false;
	}
}
