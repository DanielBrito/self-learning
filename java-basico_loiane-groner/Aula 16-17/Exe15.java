package com.daniel.cursojava.aula17;

public class Exe15 {

	public static void main(String[] args) {

		int termo1=1, termo2=1, termoAtual=0;
		
		System.out.println("1\n1");
		
		while(true) {
			
			termoAtual = termo1 + termo2;
			
			System.out.println(termoAtual);
			
			termo1 = termo2;
			termo2 = termoAtual;
			
			if(termoAtual>500) {
				
				break;
			}
		}	
	}
}
