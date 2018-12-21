package com.daniel.cursojava.aula27;

public class ContaCorrente{
	
	private int numero;
	private float saldo;
	private boolean especial;
	private float limite;
	
	public ContaCorrente(int numero, float saldo, boolean especial, float limite) {
		
		this.numero = numero;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}
	
	public boolean depositar(float valor) {
		
		if(valor<=0) {
			
			System.out.println("\nN�o � poss�vel depositar este valor.");
			return false;
		}
		else {
			
			System.out.println("\nDep�sito realizado com sucesso.");
			saldo += valor;
		}
		
		return true;
	}
	
	public boolean verificaChequeEspecial() {
		
		return especial==true;
	}
	
	public float verificarSaldo() {
		
		return saldo;
	}
	
	public boolean realizarSaque(float valor) {
		
		if(valor<0){
			
			System.out.println("\nN�o � poss�vel sacar este valor.");
			return false;
		}
		else
		if((saldo+limite)<valor){
			
			System.out.println("\nSaldo insuficiente.");
			return false;
		}
		else {
			
			System.out.println("\nSaque realizado com sucesso.");
			saldo -= valor;
		}
		
		return true;
	}
}
