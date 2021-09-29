package br.com.sistemafaculdade.model;

public class Professor extends Administrativo {
	
	//Atributos
	private double horas;
	private double salarioPrf;
	private double valorHoras = 21;
	private double percBonificacao = 0.20;
		
	//Construtor
	public Professor(String nomeCompleto, long cpf, double salario, String vinculo) {
		super(nomeCompleto, cpf, salario, vinculo);
		// TODO Auto-generated constructor stub
		this.salarioPrf = salario;
	}
	
	//Anotação de sobreescrita
	@Override
	public double getBonificacao() {
		return this.getSalario() * percBonificacao;
		
	}
	
	public double getHoras() {
		return horas;
	}
	
	public void setHoras(double horas) {
		this.horas = horas;
		//quando seto as horas do professor, ja atualizo o salario
		salarioPrf = horas * valorHoras;
	}
	
	//Anotação de sobreescrita
	@Override
	public double getSalario() {
		return salarioPrf;
	}


	/*
	public void setHoras(double horas, Administrativo funcionario, String senha) {
		if (senha.equals(funcionario.senha)) {
			this.horas = horas;

		}else {
			System.out.println("Usuário sem acesso!");
		}
		
	}
	*/
	
}
