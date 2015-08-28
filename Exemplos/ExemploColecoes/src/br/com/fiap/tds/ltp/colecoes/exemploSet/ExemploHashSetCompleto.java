package br.com.fiap.tds.ltp.colecoes.exemploSet;

import br.com.fiap.tds.ltp.colecoes.entidades.Pessoa;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Este exemplo mostra como trabalhar com um objeto do tipo HashSet
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ExemploHashSetCompleto {

	public static void main(String args[]) {

		//
		//Instancia um objeto do tipo HashSet
		//
		HashSet set = new HashSet();



		//
		//adiciona objetos no Set
		//
		set.add("Teste 1");
		set.add("Teste 2");
		set.add(new String("Teste 3")); //mesmo efeito das linhas anteriores
		set.add("Teste 4");

		//qualquer tipo de objeto pode ser adicionado...
		Pessoa pessoa = new Pessoa("Amanda", "374.743.851-20");
		set.add(pessoa);

		Pessoa pessoa2 = new Pessoa("Paula", "872.137.173-32");
		set.add(pessoa2);

		//
		//o Set ***NAO*** aceita colocar o mesmo objeto varias vezes
		//as linhas abaixa NAO irao causar erro, porem o objeto entrarah no Set somente 1 vez
		//
		String repetido = new String("Teste 5");
		set.add(repetido);
		set.add(repetido);
		set.add(repetido);



		//
		//verifica se um objeto estah no Set
		//
		if (set.contains(pessoa)) {
			
			//
			//remove um objeto do Set
			//
			set.remove(pessoa);
			
		}

		

		//
		//Verifica se o Set estah vazio
		//
		if (set.isEmpty()) {
			System.out.println("O Set estah vazio");
		} else {

			//
			//pega a quantidade de objetos no Set
			//
			int qtdeObjetos = set.size();
			System.out.println("O Set nao estah vazia, estah com " + qtdeObjetos + " objetos:");
			
			
			
			//
			//percorrer o Set de Object
			//
			for(Object obj : set){
			
				if (obj instanceof String) {

					String tmp = (String) obj;//cast para String
					System.out.println("\t#2 " + tmp);

				} else if (obj instanceof Pessoa) {

					Pessoa tmp = (Pessoa) obj;//cast para Pessoa
					System.out.println("\t#2 " + tmp.getNome() + " - " + tmp.getCpf());
				}
			
			}

			
		}
		
		
		
		//
		//obtem um vetor de objetos a partir do Set
		//
		Object[] arrayObject = set.toArray();
			
		
		
		//
		//'limpa' o Set - remove todos os objetos do Set -
		//
		set.clear();

	}


}
