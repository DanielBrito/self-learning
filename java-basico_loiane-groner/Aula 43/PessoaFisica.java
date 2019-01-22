package com.daniel.cursojava.aula43;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica(String nome, float renda, String cpf) {
		
		super(nome, renda);
		this.cpf = cpf;
	}

	public String getCpf() {
		
		return cpf;
	}

	public void setCpf(String cpf) {
		
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		
		return "\nNome: " + this.getNome() +
			   "\nCPF: " + this.getCpf() +
			   "\nRenda: " + this.getRenda() +
			   "\nImposto: " + this.calcularImposto();
	}

	@Override
	public float calcularImposto() {

		float renda = this.getRenda();
		
		if(renda<=1400) {
			
			return 0;
		}
		else
		if(renda>1400 && renda<=2100) {
			
			return (renda*0.1f)-100;
		}
		else
		if(renda>2100 && renda<=2800) {
			
			return (renda*0.15f)-270;
		}
		else
		if(renda>2800 && renda<=3600) {
			
			return (renda*0.25f)-500;
		}
		
		return (renda*0.3f)-700;
	}
}