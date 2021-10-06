package br.com.sistemafaculdade.model;

public class ServicosGerais extends Funcionarios {
	
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
	
	//Anotação de sobreescrita
	@Override
	public double GetValeTransporte() {
		return 200;
	}
	
}
