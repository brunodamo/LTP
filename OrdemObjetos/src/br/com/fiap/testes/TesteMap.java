package br.com.fiap.testes;

import java.util.HashMap;
import java.util.Map;

import br.com.fiap.beans.Cargo;

public class TesteMap {
	public static void main(String[] args) {
		Cargo cargo1 = new Cargo ("Estagiário", "Pleno", 2500);
		Cargo cargo2 = new Cargo ("Estagiário", "Junior", 2000);
		Map<String, Cargo> mapaCargos = new HashMap<String, Cargo>();
		//Adicionando
		mapaCargos.put("1", cargo1);
		mapaCargos.put("2", cargo2);
		

		//Retornando um objeto através da chave
		Cargo objCargo = mapaCargos.get("1");
		System.out.println(objCargo.getTudo());
		
		//Exibindo as chaves
		System.out.println("=============");
		System.out.println(mapaCargos.keySet());
		
		//Exibindo os valores dos Objetos
		System.out.println("=============");
		for (Cargo c : mapaCargos.values()){
			System.out.println(c.getTudo());
		}
	}
}
