package com.daniel.cursojava.aula43;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;

	public PessoaJuridica(String nome, float renda, String cnpj) {
		
		super(nome, renda);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		
		this.cnpj = cnpj;
	}

	@Override
	public float calcularImposto() {

		return this.getRenda()*0.1f;
	}
	
	@Override
	public String toString() {
		
		return "\nNome: " + this.getNome() +
			   "\nCNPJ: " + this.getCnpj() +
			   "\nRenda: " + this.getRenda() +
			   "\nImposto: " + this.calcularImposto();
	}
}
