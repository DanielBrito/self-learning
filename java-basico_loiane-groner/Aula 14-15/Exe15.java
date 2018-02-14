package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do primeiro lado: ");
		int lado1 = scan.nextInt();
		
		System.out.print("Digite o tamanho do segundo lado: ");
		int lado2 = scan.nextInt();
		
		System.out.print("Digite o tamanho do terceiro lado: ");
		int lado3 = scan.nextInt();
		
		if((lado1+lado2)>lado3 || (lado1+lado3)>lado2 || (lado2+lado3)>lado1) {
			
			if(lado1==lado2 && lado2==lado3) {
				
				System.out.println("Triângulo equilátero");
			}
			else
			if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
				
				System.out.println("Triângulo isósceles");
			}
			else
			if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
				
				System.out.println("Triângulo escaleno");
			}
			
		}
		else {
			
			System.out.println("Não é um triângulo");
		}
	}
}
