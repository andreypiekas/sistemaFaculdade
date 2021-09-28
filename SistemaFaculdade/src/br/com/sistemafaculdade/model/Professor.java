package br.com.sistemafaculdade.model;

public class Professor extends Administrativo {

	public Professor(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
	}
	

	public double getBonificacao() {
		return super.getSalario() * 0.20;
		
	}
	
	
	

}
