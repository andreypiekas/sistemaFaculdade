package br.com.sistemafaculdade.model;

public class Diretor extends Funcionarios{

	public Diretor(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
	}
	
	public double getBonificacao() {
		return super.getSalario() + 1000;
		
	}

}
