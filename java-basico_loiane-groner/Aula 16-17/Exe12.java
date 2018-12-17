package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe12 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int tabuada;
		
		System.out.print("Digite a tabuada desejada: ");
		tabuada = scan.nextInt();
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
		}
	}
}
