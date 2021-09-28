package br.com.sistemafaculdade.control;

import br.com.sistemafaculdade.model.*;

public class Teste {
	public static void main(String[] args) {
		
		Administrativo f1 = new Administrativo ("Andrey Piekas", 123456787L, 3000, "Administrativo");
		ServicosGerais f2 = new ServicosGerais("Lucas Antonio", 123456786L, 1500, "Serviços Gerais");
		Professor f3 = new Professor("Joao Almeida", 123456785L, 750, "Professor");
		
	

		//Testando se todas as classes tem o mesmo metodo
		System.out.println(f1.getNomeCompleto());
		System.out.println(f2.getNomeCompleto());
		System.out.println(f3.getNomeCompleto());
	}

}
