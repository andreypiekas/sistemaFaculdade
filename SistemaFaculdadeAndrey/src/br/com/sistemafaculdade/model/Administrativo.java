package br.com.sistemafaculdade.model;

public class Administrativo extends Funcionarios implements AplicavelVT {
	
	private double percBonificacao = 0.05;

	public Administrativo(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getBonificacao() {
		return getSalario() * percBonificacao;
		
	}

	public double getGastos() {
		return getSalario() + getBonificacao();
	}


	@Override
	public double getValeTransporte() {
		// TODO Auto-generated method stub
		return getSalario() * 0.06;
	}
	
//	//Anota??o de sobreescrita
//	@Override
//	public double GetValeTransporte() {
//		return getSalario() * 0.06;
//	}
	
	
}
