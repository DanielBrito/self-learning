package com.daniel.cursojava.aula19;

import java.util.Scanner;

public class Exe36 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetorA[] = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			
			if(i==0) {
				
				vetorA[i] = 1;
			}
			
			vetorA[i] = (int) Math.pow(2, i);
		}
		
		for(int i=0; i<vetorA.length; i++) {
			
			System.out.print("[" + vetorA[i] + "] ");
		}
	}
}