package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe16 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int posicao;
		int termo1=1, termo2=1, termoAtual=0;
		
		System.out.print("Digite a posição do termo da sequência de Fibonacci: ");
		posicao = scan.nextInt();
		
		if(posicao==1 || posicao==2) {
			
			System.out.printf("\nO %do termo da sequência é: 1", posicao);
		}
		else {
			
			for(int i=3; i<=posicao; i++) {
				
				termoAtual = termo1 + termo2;
				termo1 = termo2;
				termo2 = termoAtual;
			}
		}
		
		System.out.printf("\nO %do termo da sequência é: %d", posicao, termoAtual);
	}
}
