package com.daniel.cursojava.aula52;

import java.util.Scanner;

public class TestaAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        int opcao = 1;
        
        while (opcao != 3){
        	
            opcao = obterOpcaoMenu(scan);
            
            if(opcao == 1){
            	
                consultarContato(scan, agenda);
            } 
            else 
            if(opcao == 2){
            	
                adicionarContato(scan, agenda);
            }
        }
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda){
		
        try {
        	
            String nome = lerDados(scan, "\nDigite o nome: ");
            String telefone = lerDados(scan, "Digite o telefone: ");
            String email = lerDados(scan, "Digite o email: ");
            
            Contato contato = new Contato(nome, telefone, email);
            
            agenda.adicionarContato(contato);
        } 
        catch (AgendaCheiaException e) {
        	
            System.out.println(e.getMessage());
        }
    }
    
    public static void consultarContato(Scanner scan, Agenda agenda){
    	
        String nomeContato = lerDados(scan, "\nDigite o nome: ");
            
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
    
    public static String lerDados(Scanner scan, String msg){
    	
        System.out.print(msg);
        String entrada = scan.nextLine();
        
        return entrada;
    }
    
    public static int obterOpcaoMenu(Scanner scan){
        
        boolean entradaValida = false;
        int opcao = 3;
        
        while (!entradaValida){
        	
            System.out.println("\nAGENDA\n");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Sair");
            
            System.out.print("\n- > ");
        
            try {
            	
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                
                if (opcao == 1 || opcao == 2 || opcao == 3){
                	
                    entradaValida = true;
                } 
                else {
                	
                    throw new Exception("\nEntrada inválida!");
                }
            } 
            catch (Exception e){
            	
                System.out.println("\nEntrada inválida, digite novamente.");
            }
        }
        
        return opcao;
    }
}
