package com.daniel.cursojava.aula52;

public class AgendaCheiaException extends Exception {
	
	@Override
    public String getMessage() {
		
       return "\nAgenda cheia!";
    }
}
