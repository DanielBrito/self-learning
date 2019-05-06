package com.daniel.cursojava.aula43;

public class TestaPessoa {

	public static void main(String[] args) {

		PessoaFisica pf1 = new PessoaFisica("Daniel", 1000, "111.111.111-1");
		PessoaJuridica pj1 = new PessoaJuridica("Polymatus", 2000, "11.111.111/0001-11");
		PessoaFisica pf2 = new PessoaFisica("Brito", 3000, "222.222.222-2");
		PessoaJuridica pj2 = new PessoaJuridica("GitHub", 4000, "22.222.222/0001-22");
		PessoaFisica pf3 = new PessoaFisica("Henrique", 5000, "333.333.333-33");
		PessoaJuridica pj3 = new PessoaJuridica("IBM", 6000, "33.333.333/0001-33");
		
		System.out.println(pf1);
		System.out.println(pf2);
		System.out.println(pf3);
		
		System.out.println(pj1);
		System.out.println(pj2);
		System.out.println(pj3);
	}
}
