package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe34 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("\nPares: ");
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] : ");
			
			for(int j=0; j<=vetorA[i]; j+=2) {
				
				if(j%2==0) {
					
					System.out.print(j + " ");
				}
			}
			
			System.out.println();
		}
	}
}
