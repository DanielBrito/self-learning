package com.daniel.cursojava.aula15;

import java.util.Scanner;

public class Exe20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char resp;
		int cont=0;
		
		System.out.print("Telefonou para a v�tima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Esteve no local do crime? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Mora perto da v�tima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("Devia para a v�tima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		System.out.print("J� trabalhou com a v�tima? ");
		resp = scan.next().charAt(0);
		
		if(resp=='s'||resp=='S') ++cont;
		
		if(cont==5) {
			
			System.out.println("\nAssassino");
		}
		else
		if(cont==3||cont==4) {
			
			System.out.println("\nC�mplice");
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
