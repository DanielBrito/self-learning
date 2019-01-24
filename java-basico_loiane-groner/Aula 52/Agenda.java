package com.daniel.cursojava.aula52;

public class Agenda {
	
	private Contato[] contatos;
	private int posicao=0;
    
    public Agenda(){
    	
        contatos = new Contato[3];
    }
    
    public void adicionarContato(Contato contato) throws AgendaCheiaException{
    	
    	if (posicao==contatos.length){
        	
            throw new AgendaCheiaException();
        }
    	else {
    		
    		contatos[posicao++] = contato;
    	}
    }
    
    public Contato consultaContatoPorNome(String nome) throws ContatoNaoExisteException{
        
        for (int i=0; i<contatos.length; i++){
        	
            if (contatos[i]!=null){
            	
                if (contatos[i].getNome().equalsIgnoreCase(nome)){
                	
                    return contatos[i];
                }
            }
        }
        
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
    	
        String str = "";
        
        for (Contato c : contatos){
        	
            if (c != null){
            	
                str += c.toString() + "\n";
            }
        }
        
        return str;
    }
}
