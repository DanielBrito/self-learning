package com.daniel.cursojava.aula27;

import java.util.Scanner;

public class JogoDaVelha {
	
	public static Scanner scan = new Scanner(System.in);
	
	private String[][] tabuleiro = new String[5][5];
	private boolean gameOver = false;
	private boolean jogadaValida = true;
	private int linha=0, coluna=0, linhaJogada=0, colunaJogada=0;
	private int ganhador=0, jogador=0;
	private int contLinha=0, contColuna=0, contDiagonalPrincipal=0, contDiagonalSecundaria=0, total=0;
	
	public JogoDaVelha() {
		
		this.inicializarTabuleiro();
	}
	
	private void inicializarTabuleiro() {
		
		tabuleiro[0][1] = tabuleiro[0][3] = "|";
		tabuleiro[1][0] = tabuleiro[1][2] = "_"; tabuleiro[1][4] = "_";
		tabuleiro[2][1] = tabuleiro[2][3] = "|";
		tabuleiro[3][0] = tabuleiro[3][2] = "_"; tabuleiro[3][4] = "_";
		tabuleiro[4][1] = tabuleiro[4][3] = "|";
		tabuleiro[1][1] = tabuleiro[1][3] = tabuleiro[3][1] = tabuleiro[3][3] = "_";
		
		tabuleiro[0][0] = tabuleiro[0][2] = tabuleiro[0][4] = " ";
		tabuleiro[2][0] = tabuleiro[2][2] = tabuleiro[2][4] = " ";
		tabuleiro[4][0] = tabuleiro[4][2] = tabuleiro[4][4] = " ";
	}
	
	public void iniciarPartida() {
		
		System.out.println("TIC-TAC-TOE");
		
		imprimirTabuleiro();
		
		while(gameOver==false){
			
			if(gameOver==false) {
				
				jogador = 1;
				
				do {
					
					System.out.println("\nJOGADOR 1 (X)");
					System.out.print("Digite a posição (linha/coluna): ");
					linhaJogada = scan.nextInt(); 
					colunaJogada = scan.nextInt();
					
					converterEntradas(linhaJogada, colunaJogada);	
					
					jogadaValida = verificarJogadaValida(linhaJogada, colunaJogada, jogador);
					
					imprimirTabuleiro();
					
				}while(jogadaValida!=true);
				
				verificarSeJogadorGanhou(jogador);	
				
				verificarEmpate();				
			}
			
			if(gameOver==false) {
				
				jogador = 2;
				
				do {
					
					System.out.println("\nJOGADOR 2 (O)");
					System.out.print("Digite a posição (linha/coluna): ");
					linhaJogada = scan.nextInt(); 
					colunaJogada = scan.nextInt();
					
					converterEntradas(linhaJogada, colunaJogada);	
					
					jogadaValida = verificarJogadaValida(linhaJogada, colunaJogada, jogador);
					
					imprimirTabuleiro();
					
				}while(jogadaValida!=true);
				
				verificarSeJogadorGanhou(jogador);	
				
				verificarEmpate();					
			}		
		}
		
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
	
	public void imprimirTabuleiro() {
		
		System.out.println();
		
		for(int i=0; i<tabuleiro.length; i++) {
			
			for(int j=0; j<tabuleiro[i].length; j++) {
				
					System.out.print(tabuleiro[i][j]);
			}				
			
			System.out.println();
		}	
	}
	
	public void converterEntradas(int linhaJogada, int colunaJogada) {
		
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
	}
	
	public boolean verificarJogadaValida(int linhaJogada, int colunaJogada, int jogador) {
		
		if(tabuleiro[linha][coluna]!=" " || linhaJogada<1 || linhaJogada>3 || colunaJogada<1 || colunaJogada>3) {
			
			System.out.println("Jogada inválida!");
			
			return false;
		}
		
		if(jogador==1){
			
			tabuleiro[linha][coluna] = "X";
		}
		
		if(jogador==2){
			
			tabuleiro[linha][coluna] = "O";
		}
		
		return true;
	}
	
	public void verificarSeJogadorGanhou(int jogador) {
		
		contDiagonalPrincipal=0;
		contDiagonalSecundaria=0;
		
		for(int i=0; i<tabuleiro.length; i++) {
			
			contLinha = 0;
			contColuna = 0;
			
			for(int j=0; j<tabuleiro[i].length; j++) {
				
				if(tabuleiro[i][j]!=" ") {
					
					++contLinha;
				}
				
				if(tabuleiro[j][i]!=" ") {
					
					++contColuna;
				}
				
				if((i==j)) {
					
					if(tabuleiro[i][j]!=" ") {
						
						++contDiagonalPrincipal;
					}
				}
				
				if((i+j==4)) {
					
					if(tabuleiro[i][j]!=" ") {
						
						++contDiagonalSecundaria;
					}
				}
			}
			
			if((contLinha==3 || contColuna==3 || contDiagonalPrincipal==3 || contDiagonalSecundaria==3) && jogador==1) {
				
				ganhador = 1;
				gameOver = true;
			}
			
			if((contLinha==3 || contColuna==3 || contDiagonalPrincipal==3 || contDiagonalSecundaria==3) && jogador==2) {
				
				ganhador = 2;
				gameOver = true;
			}
		}
	}
	
	public void verificarEmpate() {
		
		total = 0;
		
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