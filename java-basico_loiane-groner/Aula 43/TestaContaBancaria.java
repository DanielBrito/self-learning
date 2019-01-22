package com.daniel.cursojava.aula43;

public class TestaContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria("Daniel", 123);
		ContaPoupanca cp = new ContaPoupanca("Caroline", 234, 22);
		ContaEspecial ce = new ContaEspecial("Francisca", 456, 1000);
		
		cb.depositar(500);
		cp.depositar(2000);
		ce.depositar(300);
		
		System.out.println("Conta Bancária: " + cb.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		System.out.println("Conta Especial: " + ce.getSaldo());
		
		System.out.println();
		
		ce.sacar(10000);
		
		System.out.println("Conta Especial: " + ce.getSaldo());
		
		System.out.println();
		
		cp.calcularNovoSaldo(0.5f);
		
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
		System.out.println();
		
		System.out.println(cb);
		System.out.println(cp);
		System.out.println(ce);
	}
}
