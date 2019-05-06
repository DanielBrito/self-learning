package com.daniel.cursojava.aula19;

public class Exe22 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		
		for(int i=0; i<10; i++) {
			
			vetor[i] = (int) Math.round(Math.random()*1);
		}
		
		int qtd0=0, qtd1=0;
		
		for(int i=0; i<10; i++) {
			
			if(vetor[i]==0) {
				
				++qtd0;
			}
			else {
				
				++qtd1;
			}
		}
		
		for(int i=0; i<10; i++) {
			
			System.out.print("[" + vetor[i] + "] ");
		}
		
		System.out.printf("\n\nPercentual de 0's no vetor: %.0f%%\n", 100*((float)qtd0/10));
		System.out.printf("Percentual de 1's no vetor: %.0f%%", 100*((float)qtd1/10));
	}
}
