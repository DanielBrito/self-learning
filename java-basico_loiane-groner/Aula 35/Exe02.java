package com.daniel.cursojava.aula35;

public class Exe02 {

	public static void main(String[] args) {

		System.out.println(somatorio(100));
	}
	
	public static int somatorio(int n) {
		
		if(n==1) {
			
			return 1;
		}
		
		return n + somatorio(n-1);
	}
}
