package com.daniel.cursojava.aula43;

public class Animal {
	
	private String nome;
    private float comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal() {
    	
        this.patas = 4;
    }
    
    public String getNome() {
    	
		return nome;
	}
    
	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public float getComprimento() {
		
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		
		this.comprimento = comprimento;
	}

	public int getPatas() {
		
		return patas;
	}

	public void setPatas(int patas) {
		
		this.patas = patas;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		
		this.cor = cor;
	}

	public String getAmbiente() {
		
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		
		this.ambiente = ambiente;
	}

	public float getVelocidade() {
		
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		
		this.velocidade = velocidade;
	}

	@Override
    public String toString() {
    	
    	return "\nNome: " + nome +
    		   "\nComprimento: " + comprimento +
    		   "\nPatas: " + patas +
    		   "\nCor: " + cor +
    		   "\nAmbiente: " + ambiente +
    		   "\nVelocidade: " + velocidade;
    }
}
