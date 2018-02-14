package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double delta, x1, x2;
		
		System.out.print("Digite o valor de 'a': ");
		double a = scan.nextDouble();
		
		if(a==0) {
			
			System.out.println("N�o � uma equa��o do segundo grau.");
		}
		else {
			
			System.out.print("Digite o valor de 'b': ");
			double b = scan.nextDouble();
			
			System.out.print("Digite o valor de 'c': ");
			double c = scan.nextDouble();
			
			delta = (b*b)-(4*a*c);
			
			if(delta<0) {
				
				System.out.println("N�o existem ra�zes reais para a equa��o.");
			}
			else
			if(delta==0) {
				
				x1 = ((b*(-1)) + Math.sqrt(delta))/(2*a);
				
				System.out.println("Existe uma ra�z real para a equa��o: " + x1);
			}
			else {
				
				x1 = ((b*(-1)) + Math.sqrt(delta))/(2*a);
				x2 = ((b*(-1)) - Math.sqrt(delta))/(2*a);
				
				System.out.println("Existem duas ra�zes reais para a equa��o: " + x1 + " e " + x2);
			}
		}
	}
}
