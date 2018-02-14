package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double impostoDeRenda=0;
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = scan.nextInt();
		
		System.out.print("Digite o valor recebido por hora: R$ ");
		double valorHora = scan.nextDouble();
		
		double salarioBruto = horasTrabalhadas*valorHora;
		
		if(salarioBruto<=900) {
			
			impostoDeRenda = 0; // Isento
		}
		else
		if(salarioBruto>900 && salarioBruto<=1500) {
			
			impostoDeRenda = 5;
		}
		else
		if(salarioBruto>1500 && salarioBruto<=2500) {
			
			impostoDeRenda = 10;
		}
		else
		if(salarioBruto>2500) {
			
			impostoDeRenda = 20;
		}
		
		double valorImpostoDeRenda = salarioBruto*(impostoDeRenda/100);
		double valorINSS = salarioBruto*0.10;
		double totalDescontos = valorImpostoDeRenda + valorINSS;
		
		System.out.println("Salario Bruto: ("+ horasTrabalhadas + "*" + valorHora + "):R$ " + salarioBruto);
		System.out.println("(-) IR (" + impostoDeRenda + "%):R$: " + valorImpostoDeRenda);
		System.out.println("(-) INSS (10%):R$: " + valorINSS);
		System.out.println("FGTS (11%):R$ " + salarioBruto*0.11);
		System.out.println("Total de descontos:R$ " + totalDescontos);
		System.out.println("Salario Liquido:R$ " + (salarioBruto-totalDescontos));
	}
}
