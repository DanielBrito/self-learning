package com.daniel.cursojava.aula20;

import java.util.Scanner;

public class Exe05 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean continuar=true;
		int mes=0, dia=0, hora=0, op;
		String[][][] compromissos = new String[13][32][24]; // Meses: 1..12 + Dias: 1...31 + Horas: 0..23
		
		do {
			
			System.out.println("\nAGENDA MENSAL");
			System.out.println("1 - Novo compromisso");
			System.out.println("2 - Verificar compromisso");
			System.out.println("0 - Sair");
			
			System.out.print("\n- > ");
			op = scan.nextInt();
			
			switch(op) {
			
				case 1: System.out.println("\n1 - NOVO COMPROMISSO");
				
						System.out.print("Digite o m�s: ");
						mes = scan.nextInt();
						
						while(mes<1 || mes>12) {
							
							System.out.println("M�s inv�lido!\n");
							
							System.out.print("Digite o m�s: ");
							mes = scan.nextInt();
						}				
				
						System.out.print("Digite o dia: ");
						dia = scan.nextInt();
						
						while(dia<1 || dia>31) {
							
							System.out.println("Dia inv�lido!\n");
							
							System.out.print("Digite o dia: ");
							dia = scan.nextInt();
						}
						
						System.out.print("Digite a hora: ");
						hora = scan.nextInt();
						
						while(hora<0 || hora>23) {
							
							System.out.println("Hora inv�lida!\n");
							
							System.out.print("Digite a hora: ");
							hora = scan.nextInt();
						}
						
						scan.nextLine();
						
						System.out.print("Compromisso: ");
						compromissos[mes][dia][hora] = scan.nextLine();
						
						break;
				
				case 2: System.out.println("\n2 - VERIFICAR COMPROMISSO");
				
						System.out.print("Digite o m�s: ");
						mes = scan.nextInt();
						
						while(mes<1 || mes>12) {
							
							System.out.println("M�s inv�lido!\n");
							
							System.out.print("Digite o m�s: ");
							mes = scan.nextInt();
						}
				
						System.out.print("Digite o dia: ");
						dia = scan.nextInt();
						
						while(dia<1 || dia>31) {
							
							System.out.println("Dia inv�lido!\n");
							
							System.out.print("Digite o dia: ");
							dia = scan.nextInt();
						}
						
						System.out.print("Digite a hora: ");
						hora = scan.nextInt();
						
						while(hora<0 || hora>23) {
							
							System.out.println("Hora inv�lida!\n");
							
							System.out.print("Digite a hora: ");
							hora = scan.nextInt();
						}
						
						if(compromissos[mes][dia][hora]==null) {
							
							System.out.println("N�o existe compromisso nesta data e hora");
						}
						else {
							
							System.out.println("Compromisso: " + compromissos[mes][dia][hora]);
						}
						
						break;
				
				case 0: continuar= false; 
				
						break;
				
				default: System.out.println("\nOp��o inv�lida!");
			}
			
		}while(continuar==true);		
	}
}
