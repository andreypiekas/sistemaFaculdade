package br.com.sistemafaculdade.model;

public class Vigia extends Funcionarios implements AplicavelVT{
	
	private double percBonificacao = 0.10;

	public Vigia(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
	}


	public double getValeTransporte() {
		return 300;
	}


	public double getBonificacao() {
		return getSalario() * percBonificacao;
	}

}
