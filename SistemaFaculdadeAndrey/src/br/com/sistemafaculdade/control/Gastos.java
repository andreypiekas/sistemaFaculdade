package br.com.sistemafaculdade.control;

import br.com.sistemafaculdade.model.*;

public class Gastos {
	 static private double gastoIndividual;
	 static private double gastoTotal;
	 
	static public double getGastosIndividual(Funcionarios obj) {
		gastoIndividual = obj.getSalario() + obj.getBonificacao();
		return gastoIndividual;
	}
	
	
	static double somarGastos(Funcionarios obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao();
		return gastoTotal;
	}
	
	static double somarGastos(Administrativo obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.GetValeTransporte();
		return gastoTotal;
	}
	
	static double somarGastos(ServicosGerais obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.GetValeTransporte();
		return gastoTotal;
	}
	
	static public void resetGastos() {
		gastoTotal = 0.0;
	}
	
	static public double GetValeTransporte(Funcionarios obj) {
		return 0;
	}

}
