package com.daniel.cursojava.aula56;

public enum Operacao {
	
	SOMAR("+") {
		
		@Override
		public float executarOperacao(float x, float y) {

			return x+y;
		}
	}, SUBTRAIR("-") {
		
		@Override
		public float executarOperacao(float x, float y) {

			return x-y;
		}
	}, MULTIPLICAR("*") {
		
		@Override
		public float executarOperacao(float x, float y) {

			return x*y;
		}
	}, DIVIDIR("/") {
		
		@Override
		public float executarOperacao(float x, float y) {

			return x/y;
		}
	};
	
	private String simbolo;
	
	Operacao(String simbolo){
		
		this.simbolo = simbolo;
	}
	
	public String getSimbolo() {
		
		return simbolo;
	}
	
	public abstract float executarOperacao(float x, float y);
	
	@Override
	public String toString() {
		
		return this.simbolo;
	}

}
