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
				
				System.out.println("Tri�ngulo equil�tero");
			}
			else
			if(lado1==lado2 || lado2==lado3 || lado1==lado3) {
				
				System.out.println("Tri�ngulo is�sceles");
			}
			else
			if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
				
				System.out.println("Tri�ngulo escaleno");
			}
			
		}
		else {
			
			System.out.println("N�o � um tri�ngulo");
		}
	}
}
