package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe32 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[5];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("\nTABUADA DO %d\n", vetorA[i]);
			
			for(int j=0; j<=10; j++) {
				
				System.out.printf("%d * %d = %d\n", vetorA[i], j, vetorA[i]*j);
			}
		}
	}
}
