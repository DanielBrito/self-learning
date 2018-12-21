package com.daniel.cursojava.aula27;

import java.util.Scanner;

public class TestaContaCorrente {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente(123, 0, true, 1000);
	
		System.out.println("Cheque especial: " + conta1.verificaChequeEspecial());
		System.out.println("Saldo: " + conta1.verificarSaldo());
		conta1.depositar(-10);
		conta1.depositar(500);
		System.out.println("Saldo: " + conta1.verificarSaldo());
		conta1.realizarSaque(300);
		System.out.println("Saldo: " + conta1.verificarSaldo());
		conta1.realizarSaque(2000);
		System.out.println("Saldo: " + conta1.verificarSaldo());
	}
}
