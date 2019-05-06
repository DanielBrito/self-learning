package com.daniel.cursojava.aula56;

public class OperacaoInvalidaException extends Exception{
	
	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage() {
		
       return "\nOperacão inválida!";
    }
}
