package br.com.sistemafaculdade.model;

public class Administrativo {
	//Atributos
	private String nomeCompleto;
	private long cpf;
	private double salario;
	private String vinculo;
	
	
	//Construtor
	
	public Administrativo(String nomeCompleto, long cpf, double salario, String vinculo) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.salario = salario;
		this.vinculo = vinculo;
	}


	//Metodos
	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public long getCpf() {
		return cpf;
	}


	public double getSalario() {
		return salario;
	}


	public String getVinculo() {
		return vinculo;
	}
	
	
	public double getBonificacao() {
		return salario * 0.05;
		
	}

	
	


	


}
