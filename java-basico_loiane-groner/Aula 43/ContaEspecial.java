package com.daniel.cursojava.aula43;

public class ContaEspecial extends ContaBancaria {
	
	private float limite;

	public ContaEspecial(String nomeCliente, int numConta, float limite) {
		
		super(nomeCliente, numConta);
		this.limite = limite;
	}

	public float getLimite() {
		
		return limite;
	}

	public void setLimite(float limite) {
		
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nLimite: " + limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		
		if(valor<0) {
			
			return false;
		}
		else
		if(this.getSaldo()+limite<valor) {
			
			return false;
		}
		else {
			
			this.setSaldo(this.getSaldo()-valor);
		}
		
		return true;
	}
}
