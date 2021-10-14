package br.com.sistemafaculdade.model;

public class ServicosGerais extends Funcionarios implements AplicavelVT {
	
	private double percBonificacao = 0.10;
	
	//Construtor
	public ServicosGerais(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
	}


	//Anotação de sobreescrita
	@Override
	public double getBonificacao() {
		return super.getSalario() * percBonificacao;
		
	}


	@Override
	public double getValeTransporte() {
		// TODO Auto-generated method stub
		return 200;
	}
	
	//Anotação de sobreescrita
//	@Override
//	public double GetValeTransporte() {
//		return 200;
//	}
	
}
