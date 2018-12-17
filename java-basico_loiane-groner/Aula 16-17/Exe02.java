package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe02 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		String nome, senha;
		
		boolean autenticador;
		
		do {
			
			autenticador = true;
			
			System.out.print("Digite o nome de usuário: ");
			nome = scan.next();
			
			System.out.print("Digite a senha: ");
			senha = scan.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				
				autenticador = false;
				
				System.out.println("O nome de usuário não pode ser igual à senha!");
			}
			
		}while(autenticador==false);
		
		System.out.println("Cadastro efetuado com sucesso!");
	}
}
