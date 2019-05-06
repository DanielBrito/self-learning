package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe33 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		int divisores=0;
		boolean primo=true;
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.printf("VetorA[%d] = ", i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			divisores=0;
			primo=true;
			
			for(int j=1; j<=vetorA[i]; j++) {
				
				if(vetorA[i]%j==0) {
					
					++divisores;
				}
				
				if(divisores>2 || vetorA[i]==1) {
					
					System.out.println("\n" + vetorA[i] + " não é primo.");
					primo = false;
					break;
				}
			}
			
			if(primo==true) {
				
				System.out.println("\n" + vetorA[i] + " é primo.");
			}			
		}
	}
}
