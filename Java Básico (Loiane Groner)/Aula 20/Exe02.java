package com.daniel.cursojava.aula20;

public class Exe02 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		int maxC5 = Integer.MIN_VALUE, maxC7 = Integer.MIN_VALUE;
		int minC5 = Integer.MAX_VALUE, minC7 = Integer.MAX_VALUE;
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				matriz[i][j] = (int) (Math.random()*10+0);
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			
			for(int j=0; j<matriz[i].length; j++) {
				
				System.out.print("[" + matriz[i][j] + "] ");
				
				if(j==5) {
					
					if(matriz[i][j]>maxC5) {
						
						maxC5 = matriz[i][j];
					}
					
					if(matriz[i][j]<minC5) {
						
						minC5 = matriz[i][j];
					}
				}
				
				if(j==7) {
					
					if(matriz[i][j]>maxC7) {
						
						maxC7 = matriz[i][j];
					}
					
					if(matriz[i][j]<minC7) {
						
						minC7 = matriz[i][j];
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.printf("\n\nMaior valor da coluna 5: %d\nMenor valor da coluna 5: %d\n\n", maxC5, minC5);
		System.out.printf("Maior valor da coluna 7: %d\nMenor valor da coluna 7: %d\n\n", maxC7, minC7);
	}
}
