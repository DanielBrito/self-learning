package com.daniel.cursojava.aula56;

public class OpcaoInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage() {
		
       return "\nOpção inválida!";
    }
}
