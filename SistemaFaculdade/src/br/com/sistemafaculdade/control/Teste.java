package br.com.sistemafaculdade.control;


import br.com.sistemafaculdade.model.Administrativo;
import br.com.sistemafaculdade.model.Professor;
import br.com.sistemafaculdade.model.ServicosGerais;

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
		
		System.out.println("O salário novo é de R$" + (f1.getBonificacao() + f1.getSalario()));
		System.out.println("O salário novo é de R$" + (f2.getBonificacao() + f2.getSalario()));
		System.out.println("O salário novo é de R$" + (f3.getBonificacao() + f3.getSalario()));
	
		
		//Imprimindo os gastos
		System.out.println(Gastos.getGastosIndividual(f3));
		
		//Testando as horas do professor
		
		System.out.println(f3.getHoras());
		f3.setHoras(10);
		System.out.println();
//		
//		System.out.println(f3.getSalario());
//		System.out.println(f3.getHoras());

		
		
	}

}
