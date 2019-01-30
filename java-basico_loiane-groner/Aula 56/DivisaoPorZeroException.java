package com.daniel.cursojava.aula56;

public class DivisaoPorZeroException extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
    public String getMessage() {
		
       return "\nErro, divisor igual a 0!";
    }

}
