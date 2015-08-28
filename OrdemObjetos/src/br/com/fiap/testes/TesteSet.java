package br.com.fiap.testes;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> cargos = new HashSet<String>();
			cargos.add("Analista");
			cargos.add("Suporte");
			cargos.add("Estagiário");
			cargos.add("Desenvolvedor");
			cargos.add("DBA");
			cargos.add("DBA");		
			System.out.println(cargos);
	}

}
