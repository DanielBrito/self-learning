package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe37 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[15];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] : ", i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			if(vetorA[i]==0) {
				
				vetorB[i] = 1;
			}
			else {
				
				int resultado = 1;
				
				for(int j=vetorA[i]; j>=1; j--) {
					
					resultado *= j;
				}
				
				vetorB[i] = resultado;
			}
		}
		
		System.out.println();
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] " );
		}
		
		System.out.println("\n");
		
		for(int i=0; i<vetorB.length; i++) {
			
			System.out.println("[" + vetorA[i] + "!] = " + vetorB[i]);
		}
	}
}