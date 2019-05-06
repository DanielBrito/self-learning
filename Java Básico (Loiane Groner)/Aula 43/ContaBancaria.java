package com.daniel.cursojava.aula43;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private float saldo;
	
	public ContaBancaria(String nomeCliente, int numConta) {
		
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = 0;
	}

	public String getNomeCliente() {
		
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		
		return numConta;
	}

	public void setNumConta(int numConta) {
		
		this.numConta = numConta;
	}

	public float getSaldo() {
		
		return saldo;
	}

	public void setSaldo(float saldo) {
		
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		
		if(valor<0 || saldo<valor) {
			
			return false;
		}
		else {
			
			saldo -= valor;
		}
		
		return true;		
	}
	
	public boolean depositar(float valor) {
		
		if(valor<0) {
			
			return false;
		}
		else {
			
			saldo += valor;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		
		return "\nNome: " + nomeCliente + 
			   "\nConta: " + numConta + 
			   "\nSaldo: " + saldo;
	}
}
