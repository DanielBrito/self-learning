package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto voc� ganha por hora trabalhada? ");
		double salarioHora = scan.nextDouble();
		
		System.out.print("Quantas horas voc� trabalhou no m�s? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salario = salarioHora * horasTrabalhadas;
		
		double impostoDeRenda = salario*0.11;
		double inss = salario*0.08;
		double sindicato = salario*0.05;
		double salarioLiquido = salario - (impostoDeRenda+inss+sindicato);
		
		System.out.println("RELAT�RIO");
		System.out.println("Sal�rio bruto: R$" + salario);
		System.out.println("Imposto de Renda: R$" + impostoDeRenda);
		System.out.println("INSS: R$" + inss);
		System.out.println("Sindicato: R$" + sindicato);
		System.out.println("Sal�rio l�quido: R$" + salarioLiquido);
	}

}
