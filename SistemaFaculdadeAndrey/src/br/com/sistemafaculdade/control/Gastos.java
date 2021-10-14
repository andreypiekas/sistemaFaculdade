package br.com.sistemafaculdade.control;

import br.com.sistemafaculdade.model.*;

public class Gastos {
	static private double gastosSalario;
	static private double gastosBonificacao;
	static private double gastosVT;
	static private double gastoTotal;
	
	static public double getGastosComSalario(Funcionarios obj) {
		gastosSalario += obj.getSalario();
		return gastosSalario;
	}
	
	static public double getGastosComBonificacao(Funcionarios obj) {
		gastosBonificacao += obj.getBonificacao();
		return gastosBonificacao;
	}
	
	static public double somarGastosComVT(AplicavelVT obj) {
		gastosVT += obj.getValeTransporte();
		return gastosVT;
	}
	
	static double somarGastos() {	
		gastoTotal = gastosSalario + gastosBonificacao + gastosVT;
		return gastoTotal;
	}
	
//	static double somarGastos(Funcionarios obj) {
//		 if(obj.getClass().getSimpleName().equals("Administrativo") || obj.getClass().getSimpleName().equals("ServicoGerais")) {
//			 System.out.println("PROGRAMA CHEGOU NESSA PARTE");
//				gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.getValeTransporte();
//				return gastoTotal;
//		 }else {
//			 
//		 }
//		
//		
//		gastoTotal += obj.getSalario() + obj.getBonificacao();
//		return gastoTotal;
//	}
//	
	
	
//	static double somarGastos(Administrativo obj) {
//		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.GetValeTransporte();
//		return gastoTotal;
//	}
//	
//	static double somarGastos(ServicosGerais obj) {
//		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.GetValeTransporte();
//		return gastoTotal;
//	}
	
	
	//Será que dois novos métodos é a melhor saída?
	static public double somarGastosAdm(Administrativo obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.getValeTransporte();
		return gastoTotal;
	}
	
	static public double somarGastosServicos(ServicosGerais obj) {
		gastoTotal += obj.getSalario() + obj.getBonificacao() + obj.getValeTransporte();
		return gastoTotal;
	}
	
	
	static public void resetGastos() {
		gastoTotal = 0.0;
		gastosSalario = 0.0;
		gastosBonificacao = 0.0;
		gastosVT = 0.0;
	}
	
	static public double GetValeTransporte(Funcionarios obj) {
		return 0;
	}

}
