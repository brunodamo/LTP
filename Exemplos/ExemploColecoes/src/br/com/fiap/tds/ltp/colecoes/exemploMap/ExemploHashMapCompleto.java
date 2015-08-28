package br.com.fiap.tds.ltp.colecoes.exemploMap;

import br.com.fiap.tds.ltp.colecoes.entidades.Pessoa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Este exemplo mostra como trabalhar com um objeto do tipo HashMap
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ExemploHashMapCompleto {

	public static void main(String args[]) {

		//
		//Instancia um objeto do tipo HashMap
		//
		HashMap map = new HashMap();
		
		
		
		//
		//adiciona mapeamentos no map
		//
		map.put("1", "Teste 1");
		map.put("2", "Teste 2");
		map.put("3", new String("Teste 3")); //mesmo efeito das linhas anteriores
		map.put("4", "Teste 4");

		//qualquer tipo de objeto pode ser adicionado...
		Pessoa pessoa = new Pessoa("Amanda", "374.743.851-20");
		map.put("374.743.851-20", pessoa);//cpf como chave  ;-)

		Pessoa pessoa2 = new Pessoa("Paula", "872.137.173-32");
		map.put("872.137.173-32", pessoa2);

		//
		//a map aceita colocar o mesmo objeto varias vezes, desde que a chave seja
		//diferente - se for a mesma chave, soh um serah adicionado ao map
		//
		String repetido = new String("Teste 5");
		map.put("5", repetido);

		//
		//verifica se a chave ja foi utilizada
		//
		if (map.containsKey("5")) {
			map.put("5.1", repetido);
		}



		//
		//verifica se o valor ja estah no map
		//
		if (map.containsValue("5")) {
			map.put("5", repetido + ".1");
		}



		//
		//remove o mapeamento ["2","Teste 2"]
		//
		map.remove("2");//chave como parametro



		//
		//Verifica se o Map estah vazio
		//
		if (map.isEmpty()) {
			System.out.println("O map estah vazio");
		} else {

			//
			//pega a quantidade de objetos no Map
			//
			int qtdeObjetos = map.size();
			System.out.println("O map nao estah vazio, estah com " + qtdeObjetos + " objetos:\t[chave][valor]");
			
			
			
			//
			//Percorre todas as chaves do Map
			//
			for (Object chave : map.keySet()){
				
				//pega o valor associado a chave
				Object valor = (Object) map.get(chave);//todo objeto sai do map como object!

				if (valor instanceof String) {

					String tmp = (String) valor;//cast para String
					System.out.println("\t[" + chave + "]" + "[" + valor + "]");

				} else if (valor instanceof Pessoa) {

					Pessoa tmp = (Pessoa) valor;//cast para Pessoa
					System.out.println("[" + chave + "]" + "[" + tmp.getNome() + " - " + tmp.getCpf() + "]");
				}

			}

		}




		System.out.print("************************* valores no map: ");
		//
		//Percorre todos os valores do Map
		//
		for (Object valor : map.values()) {

			if (valor instanceof String) {

				String tmp = (String) valor;//cast para String
				System.out.print(valor+", ");

			} else if (valor instanceof Pessoa) {

				Pessoa tmp = (Pessoa) valor;//cast para Pessoa
				System.out.print(tmp.getNome() + " - " + tmp.getCpf()+", ");
			}

		}
		
		
		
		//
		//obtem um vetor de objetos, com todas as chaves do Map
		//
		Object[] chavesArray = map.keySet().toArray();
		
		
		
		//
		//obtem um vetor de objetos, com todos os valores do Map
		//
		Object[] valoresArray = map.values().toArray();
		
		
		
		//
		//'limpa' a lista - remove todos os objetos da lista -
		//
		map.clear();

	}
}
