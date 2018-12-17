package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe16 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int posicao;
		int termo1=1, termo2=1, termoAtual=0;
		
		System.out.print("Digite a posi��o do termo da sequ�ncia de Fibonacci: ");
		posicao = scan.nextInt();
		
		if(posicao==1 || posicao==2) {
			
			System.out.printf("\nO %do termo da sequ�ncia �: 1", posicao);
		}
		else {
			
			for(int i=3; i<=posicao; i++) {
				
				termoAtual = termo1 + termo2;
				termo1 = termo2;
				termo2 = termoAtual;
			}
		}
		
		System.out.printf("\nO %do termo da sequ�ncia �: %d", posicao, termoAtual);
	}
}
