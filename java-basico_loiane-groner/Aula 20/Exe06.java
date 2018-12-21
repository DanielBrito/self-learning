package com.daniel.cursojava.aula20;

import java.util.Scanner;

public class Exe06 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[][] tabuleiro = new String[5][5];
		boolean gameOver = false;
		boolean jogadaValida = true;
		int linha=0, coluna=0, linhaJogada=0, colunaJogada=0;
		int ganhador=0, contLinha=0, contColuna=0, contDiagonalPrincipal=0, contDiagonalSecundaria=0, total=0;
		
		// Inicializa tabuleiro:
		
		tabuleiro[0][1] = tabuleiro[0][3] = "|";
		tabuleiro[1][0] = tabuleiro[1][2] = "_"; tabuleiro[1][4] = "_";
		tabuleiro[2][1] = tabuleiro[2][3] = "|";
		tabuleiro[3][0] = tabuleiro[3][2] = "_"; tabuleiro[3][4] = "_";
		tabuleiro[4][1] = tabuleiro[4][3] = "|";
		tabuleiro[1][1] = tabuleiro[1][3] = tabuleiro[3][1] = tabuleiro[3][3] = "";
		
		tabuleiro[0][0] = tabuleiro[0][2] = tabuleiro[0][4] = " ";
		tabuleiro[2][0] = tabuleiro[2][2] = tabuleiro[2][4] = " ";
		tabuleiro[4][0] = tabuleiro[4][2] = tabuleiro[4][4] = " ";
		
		// Imprime tabuleiro:
		
		System.out.println("TIC-TAC-TOE");
		
		System.out.println();
		
		for(int i=0; i<tabuleiro.length; i++) {
			
			for(int j=0; j<tabuleiro[i].length; j++) {
				
					System.out.print(tabuleiro[i][j]);
			}				
			
			System.out.println();
		}	
		
		// Inicia o jogo:
		
		while(gameOver==false){		
			
			total = 0;
			
			// Jogador 1:
			
			if(gameOver==false) {
				
				do {
					
					System.out.println("\nJOGADOR 1 (X)");
					System.out.print("Digite a posição (linha/coluna): ");
					linhaJogada = scan.nextInt(); 
					colunaJogada = scan.nextInt();
					
					// Convertendo as entradas:
					
					if(linhaJogada==1 && colunaJogada==1) {
						
						linha=0; coluna=0;
					}
					else
					if(linhaJogada==1 && colunaJogada==2) {
						
						linha=0; coluna=2;
					}
					else
					if(linhaJogada==1 && colunaJogada==3) {
						
						linha=0; coluna=4;
					}
					else
					if(linhaJogada==2 && colunaJogada==1) {
						
						linha=2; coluna=0;
					}
					else
					if(linhaJogada==2 && colunaJogada==2) {
						
						linha=2; coluna=2;
					}
					else					
					if(linhaJogada==2 && colunaJogada==3) {
						
						linha=2; coluna=4;
					}
					else
					if(linhaJogada==3 && colunaJogada==1) {
						
						linha=4; coluna=0;
					}
					else
					if(linhaJogada==3 && colunaJogada==2) {
						
						linha=4; coluna=2;
					}
					else
					if(linhaJogada==3 && colunaJogada==3) {
						
						linha=4; coluna=4;
					}
					
					// Verifica se a jogada é válida:	
					
					if(tabuleiro[linha][coluna]!=" " || linhaJogada<1 || linhaJogada>3 || colunaJogada<1 || colunaJogada>3) {
						
						System.out.println("Jogada inválida!");
						
						jogadaValida=false;
					}
					else {
						
						tabuleiro[linha][coluna] = "X";
						
						jogadaValida=true;
					}
					
					// Imprime tabuleiro:
					
					System.out.println();
					
					for(int i=0; i<tabuleiro.length; i++) {
						
						for(int j=0; j<tabuleiro[i].length; j++) {

							System.out.print(tabuleiro[i][j]);			
						}
						
						System.out.println();
					}
					
				}while(jogadaValida!=true);
				
				// Verifica se o jogador 1 ganhou:
				
				contDiagonalPrincipal=0;
				contDiagonalSecundaria=0;
				
				for(int i=0; i<tabuleiro.length; i++) {
					
					contLinha = 0;
					contColuna = 0;
					
					for(int j=0; j<tabuleiro[i].length; j++) {
						
						if(tabuleiro[i][j]=="X") {
							
							++contLinha;
						}
						
						if(tabuleiro[j][i]=="X") {
							
							++contColuna;
						}
						
						if((i==j)) {
							
							if(tabuleiro[i][j]=="X") {
								
								++contDiagonalPrincipal;
							}
						}
						
						if((i+j==4)) {
							
							if(tabuleiro[i][j]=="X") {
								
								++contDiagonalSecundaria;
							}
						}
					}
					
					if(contLinha==3 || contColuna==3 || contDiagonalPrincipal==3 || contDiagonalSecundaria==3) {
						
						ganhador = 1;
						gameOver = true;
					}
				}
				
				// Verifica se empatou:
				
				for(int i=0; i<tabuleiro.length; i++) {
					
					for(int j=0; j<tabuleiro[i].length; j++) {
						
						if(tabuleiro[i][j]!=" ") {
							
							++total;
						}
					}
				}	
				
				if(total==25) {
					
					ganhador=0;
					gameOver=true;
				}				
			}
			
			total = 0;
			
			// Jogador 2:
			
			if(gameOver==false) {
				
				do {
					
					System.out.println("\nJOGADOR 2 (O)");
					System.out.print("Digite a posição (linha/coluna): ");
					linhaJogada = scan.nextInt(); 
					colunaJogada = scan.nextInt();
					
					// Convertendo as entradas:
					
					if(linhaJogada==1 && colunaJogada==1) {
						
						linha=0; coluna=0;
					}
					
					if(linhaJogada==1 && colunaJogada==2) {
						
						linha=0; coluna=2;
					}
					
					if(linhaJogada==1 && colunaJogada==3) {
						
						linha=0; coluna=4;
					}
					
					if(linhaJogada==2 && colunaJogada==1) {
						
						linha=2; coluna=0;
					}
					
					if(linhaJogada==2 && colunaJogada==2) {
						
						linha=2; coluna=2;
					}
					
					if(linhaJogada==2 && colunaJogada==3) {
						
						linha=2; coluna=4;
					}
					
					if(linhaJogada==3 && colunaJogada==1) {
						
						linha=4; coluna=0;
					}
					
					if(linhaJogada==3 && colunaJogada==2) {
						
						linha=4; coluna=2;
					}
					
					if(linhaJogada==3 && colunaJogada==3) {
						
						linha=4; coluna=4;
					}
					
					// Verifica se a jogada é válida:
					
					if(tabuleiro[linha][coluna]!=" " || linhaJogada<1 || linhaJogada>3 || colunaJogada<1 || colunaJogada>3) {
						
						System.out.println("Jogada inválida!");
						
						jogadaValida=false;
					}
					else {
						
						tabuleiro[linha][coluna] = "O";
						
						jogadaValida=true;
					}
					
					// Imprime tabuleiro:
					
					System.out.println();
					
					for(int i=0; i<tabuleiro.length; i++) {
						
						for(int j=0; j<tabuleiro[i].length; j++) {

							System.out.print(tabuleiro[i][j]);			
						}
						
						System.out.println();
					}
					
				}while(jogadaValida!=true);
				
				// Verifica se o jogador 2 ganhou:
				
				contDiagonalPrincipal=0;
				contDiagonalSecundaria=0;
				
				for(int i=0; i<tabuleiro.length; i++) {
					
					contLinha = 0;
					contColuna = 0;
					
					for(int j=0; j<tabuleiro[i].length; j++) {
						
						if(tabuleiro[i][j]=="O") {
							
							++contLinha;
						}
						
						if(tabuleiro[j][i]=="O") {
							
							++contColuna;
						}
						
						if((i==j)) {
							
							if(tabuleiro[i][j]=="O") {
								
								++contDiagonalPrincipal;
							}
						}
						
						if((i+j==4)) {
							
							if(tabuleiro[i][j]=="O") {
								
								++contDiagonalSecundaria;
							}
						}
					}
					
					if(contLinha==3 || contColuna==3 || contDiagonalPrincipal==3 || contDiagonalSecundaria==3) {
						
						ganhador = 2;
						gameOver = true;
					}
				}
				
				// Verifica se empatou:
				
				for(int i=0; i<tabuleiro.length; i++) {
					
					for(int j=0; j<tabuleiro[i].length; j++) {
						
						if(tabuleiro[i][j]!=" ") {
							
							++total;
						}
					}
				}	
				
				if(total==25) {
					
					ganhador=0;
					gameOver=true;
				}				
			}		
		}
		
		// Imprime resultado:
		
		if(ganhador==1) {
			
			System.out.println("\nO ganhador é o Jogador 1!");
		}
		else 
		if(ganhador==2){
			
			System.out.println("\nO ganhador é o Jogador 2!");
		}
		else {
			
			System.out.println("\nA partida terminou empatada!");
		}
	}
}