package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe27 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		float maior=Float.MIN_VALUE, menor=Float.MAX_VALUE, soma=0;
		int qtdTemperaturas;
		
		System.out.print("Digite a quantidade de temperaturas: ");
		qtdTemperaturas = scan.nextInt();
		
		System.out.println();
		
		for(int i=0; i<qtdTemperaturas; i++) {
			
			System.out.printf("Digite a %da temperatura: ", i+1);
			float temperatura = scan.nextFloat();
			
			soma += temperatura;
			
			if(temperatura>maior) {
				
				maior = temperatura;
			}
			
			if(temperatura<menor) {
				
				menor = temperatura;
			}
		}
		
		System.out.println("\nMenor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
		System.out.printf("Temperatura média: %.2f", (float)soma/qtdTemperaturas);

	}

}
