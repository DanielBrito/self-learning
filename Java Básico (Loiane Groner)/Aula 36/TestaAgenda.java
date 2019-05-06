package com.daniel.cursojava.aula36;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Agenda agenda2019 = new Agenda("Contatos 2019");
		
		Contato p1 = new Contato("Daniel", "(11)5933-6197", "danielhbrito@outlook.com");
		Contato p2 = new Contato("Caroline", "(55)9876-2463", "caroline-ferreira@gmail.com");
		Contato p3 = new Contato("Francisca", "(88)9875-2454", "francisca-adelaide@hotmail.com");
		
		agenda2019.adicionarContato(p1);
		agenda2019.adicionarContato(p2);
		agenda2019.adicionarContato(p3);
		
		agenda2019.imprimirContatos();
	}
}
