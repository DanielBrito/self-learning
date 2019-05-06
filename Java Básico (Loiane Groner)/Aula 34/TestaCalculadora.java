package com.daniel.cursojava.aula34;

public class TestaCalculadora {
	
	public static void main(String[] args) {
		
		System.out.println("10+15 = " + Calculadora.somar(10,15));
		System.out.println("10-10 = " + Calculadora.subtrair(10,10));
		System.out.println("3*2 = " + Calculadora.multiplicar(3,2));
		System.out.println("50/2 = " + Calculadora.dividir(50,2));
		System.out.println("2^10 = " + Calculadora.potencia(2,10));
		System.out.println("5! = " + Calculadora.fatorial(5));
	}

}
