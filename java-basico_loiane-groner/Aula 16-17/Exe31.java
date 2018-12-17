package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe31 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		double salario = 1000.00;
		double percentual = 0.015;
		
		for(int i=1996; i<=2018; i++) {
			
			salario += salario*(percentual);
			
			percentual *= 2;
		}
		
		System.out.printf("Salário atual: %.2f", salario);
	}
}