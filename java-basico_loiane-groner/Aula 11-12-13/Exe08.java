package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora trabalhada? ");
		double salarioHora = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalhou no m�s? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salario = salarioHora * horasTrabalhadas;
		
		System.out.println("O seu sal�rio � R$" + salario);
	}

}
