package br.com.sistemafaculdade.control;

import br.com.sistemafaculdade.model.*;

public class Gastos {
	 static double gastoIndividual;
	 
	 
	static double getGastosIndividual(Funcionarios funcionario) {
		gastoIndividual = funcionario.getSalario() + funcionario.getBonificacao();
		
		return gastoIndividual;
	}

}
