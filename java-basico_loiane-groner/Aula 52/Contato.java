package com.daniel.cursojava.aula52;

public class Contato {
	
    private static int contador=0;
    
    private int id;
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email) {
    	
		this.id = contador;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		
		++contador;
	}

	public static void setContador(int contador) {
		
		Contato.contador = contador;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getTelefone() {
		
		return telefone;
	}

	public void setTelefone(String telefone) {
		
		this.telefone = telefone;
	}

	public String getEmail() {
		
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	@Override
    public String toString() {
    	
    	return "\nId: " + id +
    		   "\nNome: " + nome +
    		   "\nTelefone: " + telefone +
    		   "\nEmail: " + email;
    }
}
