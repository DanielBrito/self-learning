package com.daniel.cursojava.aula20;

public class Exe01 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		int max = Integer.MIN_VALUE, linha=0, coluna=0;
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				matriz[i][j] = (int) (Math.random()*10+0);
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				System.out.print("[" + matriz[i][j] + "] ");
				
				if(matriz[i][j]>max) {
					
					max = matriz[i][j];
					linha=i;
					coluna=j;
				}
			}
			
			System.out.println();
		}
		
		System.out.printf("\n\nMaior valor: matriz[%d][%d] = %d", linha, coluna, max);
	}
}
