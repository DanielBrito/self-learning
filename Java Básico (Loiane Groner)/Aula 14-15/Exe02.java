package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = scan.nextInt();
		
		if(num<0) {
			
			System.out.println("O n�mero digitado � negativo.");
		}
		else 
		if(num>0){
			
			System.out.println("O n�mero digitado � positivo.");
		}
		else{
			
			System.out.println("O n�mero digitado � nulo.");
		}

	}

}
