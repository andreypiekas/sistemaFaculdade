package br.com.sistemafaculdade.model;

public abstract class Funcionarios {
	//Atributos
		private String nomeCompleto;
		private long cpf;
		private double salario;
		private String vinculo;

		//private String senha;
		
		//Construtor
		public Funcionarios(String nomeCompleto, long cpf, double salario, String vinculo) {
			super();
			this.nomeCompleto = nomeCompleto;
			this.cpf = cpf;
			this.salario = salario;
			this.vinculo = vinculo;
			//this.senha = senha;
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
		
		//O jeito antigo de fazer polimorfismo
		//O jeito correto de fazer polimorfismo é criar um metodo abstrato
		public abstract double getBonificacao();


//		public double GetValeTransporte() {
//			// TODO Auto-generated method stub
//			return 0;
//		}

}
