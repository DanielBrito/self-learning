package com.daniel.cursojava.aula20;

import java.util.Scanner;

public class Exe04 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean continuar=true;
		int dia=0, hora=0, op;
		String[][] compromissos = new String[32][24]; // Dias: 1...31 + Horas: 0..23
		
		do {
			
			System.out.println("\nAGENDA MENSAL");
			System.out.println("1 - Novo compromisso");
			System.out.println("2 - Verificar compromisso");
			System.out.println("0 - Sair");
			
			System.out.print("\n- > ");
			op = scan.nextInt();
			
			switch(op) {
			
				case 1: System.out.println("\n1 - NOVO COMPROMISSO");
				
						System.out.print("Digite o dia: ");
						dia = scan.nextInt();
						
						while(dia<1 || dia>31) {
							
							System.out.println("Dia inválido!\n");
							
							System.out.print("Digite o dia: ");
							dia = scan.nextInt();
						}
						
						System.out.print("Digite a hora: ");
						hora = scan.nextInt();
						
						while(hora<0 || hora>23) {
							
							System.out.println("Hora inválida!\n");
							
							System.out.print("Digite a hora: ");
							hora = scan.nextInt();
						}
						
						scan.nextLine();
						
						System.out.print("Compromisso: ");
						compromissos[dia][hora] = scan.nextLine();
						
						break;
				
				case 2: System.out.println("\n2 - VERIFICAR COMPROMISSO");
				
						System.out.print("Digite o dia: ");
						dia = scan.nextInt();
						
						while(dia<1 || dia>31) {
							
							System.out.println("Dia inválido!\n");
							
							System.out.print("Digite o dia: ");
							dia = scan.nextInt();
						}
						
						System.out.print("Digite a hora: ");
						hora = scan.nextInt();
						
						while(hora<0 || hora>23) {
							
							System.out.println("Hora inválida!\n");
							
							System.out.print("Digite a hora: ");
							hora = scan.nextInt();
						}
						
						if(compromissos[dia][hora]==null) {
							
							System.out.println("Não existe compromisso nesta data e hora");
						}
						else {
							
							System.out.println("Compromisso: " + compromissos[dia][hora]);
						}
						
						break;
				
				case 0: continuar= false; 
				
						break;
				
				default: System.out.println("\nOpção inválida!");
			}
			
		}while(continuar==true);		
	}
}
