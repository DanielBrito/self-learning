package com.daniel.cursojava.aula13;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho em metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros*100;
		
		System.out.println(metros + " metro(s) equivalem a " + centimetros + " centímetro(s).");
	}

}
