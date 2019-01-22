package com.daniel.cursojava.aula36;

public class Agenda {
	
	private Contato[] contatos;
	private String nome;
	private int posicao=0;
	
	public Agenda(String nome) {
		
		contatos = new Contato[10];
		this.nome = nome;
	}
	
	public void adicionarContato(Contato novo) {
		
		contatos[posicao++] = novo;
	}
	
	public void imprimirContatos() {
		
		for(int i=0; i<posicao; i++) {
			
			System.out.println(contatos[i]);
		}
	}
}
