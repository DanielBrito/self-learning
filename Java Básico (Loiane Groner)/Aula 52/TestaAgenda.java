package com.daniel.cursojava.aula52;

import java.util.Scanner;

public class TestaAgenda {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
        Agenda agenda = new Agenda();
        int opcao = 0;
        
        while(opcao!=3) {
        	
        	do {
        		
        		System.out.println("\nAGENDA\n");
                System.out.println("1 - Consultar contato");
                System.out.println("2 - Adicionar contato");
                System.out.println("3 - Sair");
                
                System.out.print("\n- > ");
                
                try {
                	
                    String entrada = scan.nextLine();
                    opcao = Integer.parseInt(entrada);
                    
                    if(opcao!=1 && opcao!=2 && opcao!=3){
                    	
                    	throw new Exception("\nEntrada inválida!");
                    }
                } 
                catch (Exception e){
                	
                    System.out.println("\nEntrada inválida, digite novamente.");
                }
                
            }while(opcao!=1 && opcao!=2 && opcao!=3);
        	
        	switch(opcao) {
            
	        	case 1: consultarContato(agenda); break;
	        	case 2: adicionarContato(agenda); break;
	        }
        } 
	}
	
	public static void adicionarContato(Agenda agenda){
		
        try {
        	
        	System.out.print("\nDigite o nome: ");
        	String nome = scan.nextLine();
        	
        	System.out.print("Digite o telefone: ");
        	String telefone = scan.nextLine();
        	
        	System.out.print("Digite o email: ");
        	String email = scan.nextLine();
            
            Contato contato = new Contato(nome, telefone, email);
            
            agenda.adicionarContato(contato);
        } 
        catch (AgendaCheiaException e) {
        	
            System.out.println(e.getMessage());
        }
    }
    
    public static void consultarContato(Agenda agenda){
    	
    	System.out.print("\nDigite o nome: ");
    	String nomeContato = scan.nextLine();
            
        try {
        	
        	Contato contatoProcurado = agenda.consultaContatoPorNome(nomeContato);
        	
        	if (contatoProcurado!=null){
        		
        		System.out.println(contatoProcurado);
            }
        }
        catch (ContatoNaoExisteException e) {
        	
        	System.out.println(e.getMessage());
        }
    }
}
