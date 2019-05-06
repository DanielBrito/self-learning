package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char resp;
		int cont=0;
		
		System.out.print("Telefonou para a vítima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Esteve no local do crime? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Mora perto da vítima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Devia para a vítima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Já trabalhou com a vítima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		if(cont==5) {
			
			System.out.println("\nAssassino");
		}
		else
		if(cont==3||cont==4) {
			
			System.out.println("\nCúmplice");
		}
		else
		if(cont==2) {
			
			System.out.println("\nSuspeita");
		}
		else {
			
			System.out.println("\nInocente");
		}
	}
}
