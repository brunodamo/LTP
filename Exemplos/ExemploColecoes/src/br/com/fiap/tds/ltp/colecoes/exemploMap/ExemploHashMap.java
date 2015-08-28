package br.com.fiap.tds.ltp.colecoes.exemploMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ExemploHashMap {

	public static void main(String args[]) {

		//
		// Instancia um objeto do tipo HashMap
		//
		HashMap map = new HashMap();
		
		
		
		//
		// adiciona objetos no map, sempre no formato [chave, valor] => [Object,
		// Object]
		//
		map.put("1", "um");
		map.put("2", "dois");
		map.put("3", "tres");
		map.put("2", "dois");
		map.put("4", "quatro");
		map.remove("4");
		
		
		
		//
		// pega os valores do Map - passa a chave e pega o valor associado a ela
		//
		System.out.println("#1 " + map.get("1"));
		System.out.println("#1 " + map.get("2"));
		System.out.println("#1 " + map.get("3"));
		System.out.println("#1 " + map.get("4"));

		
		
		//
		//Percorre o Map
		//
		for (Object chave : map.keySet()) {

			String valor = (String) map.get(chave);
			System.out.println("#3 " + valor);

		}

	}
}
