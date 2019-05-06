package com.daniel.cursojava.aula17;

import java.util.Scanner;

public class Exe29 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int divisores=0, naoPrimo=0;

		System.out.print("Digite um número: ");
		int num = scan.nextInt();
		
		for(int i=2; i<=num; i++) {
			
			divisores = 0;
			naoPrimo=0;
			
			for(int j=i; j<=num; j++) {
				
				for(int k=1; k<=j; k++) {
					
					if(j%k==0) {
						
						++divisores;
					}
					
					if(divisores>2 || num==1) {
						
						++naoPrimo;
					}
					
					if(naoPrimo>0) {
						
						continue;
					}
				}
				
				if(naoPrimo==0) {
					
					System.out.println(j);
				}
			}			
		}
	}
}
