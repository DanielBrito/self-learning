package com.daniel.cursojava.aula17;

public class Exe04 {

	public static void main(String[] args) {

		int populacaoA=80000, populacaoB=200000;
		int anos=0;
		
		while(populacaoA<=populacaoB) {
			
			populacaoA += populacaoA*0.03;
			populacaoB += populacaoB*0.015;
			++anos;
		}
		
		System.out.println("Anos: " + anos);
	}
}
