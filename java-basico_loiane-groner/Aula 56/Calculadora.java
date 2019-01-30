package com.daniel.cursojava.aula56;

import java.util.Scanner;

public class Calculadora {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int selecao;
		
		while(true) {
			
			selecao = exibirMenu();
			
			if(selecao==1) {

				boolean operacaoInvalida=true;
				String novaOperacao;
				String[] termos=null;
				float x=0, y=0;
				String op="";

				while(operacaoInvalida) {

					System.out.print("\nOperação: ");

					try {

						novaOperacao = scan.nextLine();

						termos = novaOperacao.split(" ");

						if(validarNumero(termos[0]) && validarOperacao(termos[1]) && validarNumero(termos[2])){

							x = Float.parseFloat(termos[0]);
							op = termos[1];
							y = Float.parseFloat(termos[2]);

							operacaoInvalida = validarDivisao(op, y);

							if(operacaoInvalida) {

								throw new DivisaoPorZeroException();
							}
						}
						else {

							throw new OperacaoInvalidaException();
						}
					}
					catch(Exception e){

						System.out.println(e.getMessage());
					}
				}

				for (Operacao operacao : Operacao.values()){

					if(operacao.getSimbolo().equalsIgnoreCase(op)) {

						System.out.print(x + " ");
						System.out.print(operacao.toString() + " ");
						System.out.print(y + " = ");
						System.out.println(operacao.executarOperacao(x, y));
					}
				}
			}
			else {
				
				System.exit(0);
			}
		}		
	}
	
	public static int exibirMenu() {
		
		int opcao=-1;
		boolean opcaoValida=false;

		while(!opcaoValida) {

			System.out.println("\nCALCULADORA BÁSICA\n");
			System.out.println("1 - Nova operação");
			System.out.println("0 - Sair");
			System.out.print("\n- > ");

			try {

				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao==1 || opcao==0){

					opcaoValida = true;
				} 
				else {

					throw new OpcaoInvalidaException();
				}
			} 
			catch (OpcaoInvalidaException e){

				System.out.println(e.getMessage());
			}
		}
		
		return opcao;
	}

	public static boolean validarNumero(String num) {

		for(int i=0; i<num.length(); i++) {

			if(!Character.isDigit(num.charAt(i))) {

				return false;
			}
		}

		return true;
	}

	public static boolean validarOperacao(String op) {

		if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {

			return true;
		}

		return false;
	}

	public static boolean validarDivisao(String op, float divisor) {

		if(op.equalsIgnoreCase("/") && divisor==0) {

			return true;
		}

		return false;
	}
}
