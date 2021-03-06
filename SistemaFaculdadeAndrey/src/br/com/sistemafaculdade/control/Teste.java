package br.com.sistemafaculdade.control;


import java.util.*;
import br.com.sistemafaculdade.model.Administrativo;
import br.com.sistemafaculdade.model.Diretor;
import br.com.sistemafaculdade.model.Funcionarios;
import br.com.sistemafaculdade.model.Professor;
import br.com.sistemafaculdade.model.ServicosGerais;
import br.com.sistemafaculdade.model.Vigia;


public class Teste {
	public static void main(String[] args) {
		
		Administrativo f1 = new Administrativo ("Andrey Piekas", 123456787L, 1000, "adm");
		ServicosGerais f2 = new ServicosGerais("Lucas Antonio", 123456786L, 1000, "sg");
		Professor f3 = new Professor("Joao Almeida", 123456785L, 0, "prof");	

		//Testando se todas as classes tem o mesmo metodo
		System.out.println(f1.getNomeCompleto());
		System.out.println(f2.getNomeCompleto());
		System.out.println(f3.getNomeCompleto());
		System.out.println();
		
		System.out.println();
		f3.setHoras(10);
		
		System.out.println(f1.getBonificacao());
		System.out.println(f2.getBonificacao());
		System.out.println(f3.getBonificacao());
		System.out.println();
		
		System.out.println("O sal?rio novo ? de R$" + (f1.getBonificacao() + f1.getSalario()));
		System.out.println("O sal?rio novo ? de R$" + (f2.getBonificacao() + f2.getSalario()));
		System.out.println("O sal?rio novo ? de R$" + (f3.getBonificacao() + f3.getSalario()));
	
		
		//Imprimindo os gastos
		//System.out.println(Gastos.getGastosIndividual(f3));
		
		//Testando as horas do professor
		
		System.out.println(f3.getHoras());
		f3.setHoras(10);
		System.out.println();
//		
//		System.out.println(f3.getSalario());
//		System.out.println(f3.getHoras());

		
		
		//Testando um diretor
		Diretor f4 = new  Diretor("Daniela Soares", 329201939230L, 10000, "dir");
		System.out.println("A bonificacao do diretor ? de R$" + (f4.getBonificacao()));
		System.out.println();
		
		//Testar a classe gastos
		//System.out.println(Gastos.getGastosIndividual(f4));
		System.out.println();
		
//		//Testar Gastos
//		//Posso passar varios funcionarios, inclusive diferentes 
//		System.out.println(Gastos.somarGastos(f4));
//		System.out.println(Gastos.somarGastos(f3));
//		System.out.println(Gastos.somarGastos(f2));
//		System.out.println(Gastos.somarGastos(f1));
//		System.out.println();
//		Gastos.resetGastos();

		
//		//Chamando funcoes sem impressao e imprimindo somente a ultima
//		Gastos.somarGastos(f4);
//		Gastos.somarGastos(f3);
//		Gastos.somarGastos(f2);
//		System.out.printf("Os gastos totais s?o de R$ %.2f \n", Gastos.somarGastos(f1));
//		Gastos.resetGastos();

		

//		//E se quisse os gastos com diretor e administador
//		Gastos.somarGastos(f4);
//		System.out.printf("Os gastos somente do diretor e do adm s?o de R$ %.2f \n", Gastos.somarGastos(f1));
//		Gastos.resetGastos();
//		
		
		System.out.println();
		
		
		//Testando o que se encontra com getClass
		System.out.println(f4.getClass().getSimpleName());
		System.out.println(f1.getClass().getSimpleName().equals("Administrativo"));
		
		
//		//Testando se o programa entra na parte de adm ou servicogerais
//		Gastos.somarGastos(f1);
		
		System.out.println();
		
		///testando o novo metodo com interface
		Gastos.resetGastos();
		System.out.println(f2.getClass().getSimpleName());
		Gastos.somarGastosComVT(f2);
		Gastos.getGastosComSalario(f2);
		Gastos.getGastosComBonificacao(f2);
		System.out.println(Gastos.somarGastos());
		
		
		//testando vigia
		//Repare como vigia so esta definido que ? uma classe aplicavel o VT
		Gastos.resetGastos();
		Vigia f5 = new Vigia();
		System.out.println(f5.getClass().getSimpleName());
		Gastos.somarGastosComVT(f5);
//		Gastos.getGastosComSalario(f5);
//		Gastos.getGastosComBonificacao(f5);
		System.out.println(Gastos.somarGastos());

		
		
//		System.out.printf("O valor do vale transporte do adm ? de R$ %.2f \n");
//		System.out.printf("O valor do vale transporte dos servi?os gerais ? de R$ %.2f \n");
		
		
		
	}

}
