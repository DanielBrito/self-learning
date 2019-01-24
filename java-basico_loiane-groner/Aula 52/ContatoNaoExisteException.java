package com.daniel.cursojava.aula52;

public class ContatoNaoExisteException extends Exception {
	
	private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
    	
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
    	
        return "\nContato " + nomeContato + " não existe!";
    }

}
