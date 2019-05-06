package com.daniel.cursojava.aula43;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;

	public ContaPoupanca(String nomeCliente, int numConta, int diaRendimento) {
		
		super(nomeCliente, numConta);
		this.diaRendimento = diaRendimento;
	}

	public float getDiaRendimento() {
		
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(float taxaRendimento) {
		
		if(taxaRendimento<0) {
			
			return false;
		}
		else {
			
			Calendar hoje = Calendar.getInstance();
			
	        if (diaRendimento==hoje.get(Calendar.DAY_OF_MONTH)){
	        	
	            this.setSaldo(this.getSaldo()+(this.getSaldo()*taxaRendimento));
	            
	            return true;
	        }
		}
		
        return true;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nRendimento/Dia: " + diaRendimento;
	}

}
