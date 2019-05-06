package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double percentualAumento=0, novoSalario=0, valorAumento=0;
		
		System.out.print("Digite o seu salario: ");
		double salario = scan.nextDouble();
		
		if(salario<=280) {
			
			percentualAumento = 20;
			novoSalario = salario*(1+(percentualAumento/100));
			valorAumento = novoSalario - salario;
		}
		else
		if(salario>280 && salario<=700) {
			
			percentualAumento = 15;
			novoSalario = salario*(1+(percentualAumento/100));
			valorAumento = novoSalario - salario;
		}
		else
		if(salario>700 && salario<1500) {
			
			percentualAumento = 10;
			novoSalario = salario*(1+(percentualAumento/100));
			valorAumento = novoSalario - salario;
		}
		else
		if(salario>=1500) {
			
			percentualAumento = 5;
			novoSalario = salario*(1+(percentualAumento/100));
			valorAumento = novoSalario - salario;
		}
		
		System.out.println("\nSalario antes do reajuste: R$ " + salario);
		System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
		System.out.println("Valor do aumento: R$ " + valorAumento);
		System.out.println("Novo salario: R$ " + novoSalario);

	}

}
