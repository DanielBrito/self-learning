package com.daniel.cursojava.aula34;

public class Calculadora {
	
	public static float somar(float x, float y) {
		
		return x+y;
	}
	
	public static float subtrair(float x, float y) {
		
		return x-y;
	}
	
	public static float multiplicar(float x, float y) {
		
		return x*y;
	}
	
	public static float dividir(float x, float y) {
		
		if(y==0) {
			
			return Float.NaN;
		}
		
		return x/y;
	}
	
	public static float potencia(float x, float y) {
		
		return (float) Math.pow(x,y);
	}
	
	public static int fatorial(int x) {
		
		if(x==0) {
			
			return 1;
		}
		
		return x * fatorial(x-1);
	}
}
