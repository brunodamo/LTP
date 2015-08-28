package br.com.fiap.tds.ltp.colecoes.exemploList;

import br.com.fiap.tds.ltp.colecoes.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Este exemplo mostra como trabalhar com um objeto do tipo ArrayList
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ExemploArrayListCompleto {

	public static void main(String args[]) {

		//
		//Instancia um objeto do tipo ArrayList
		//
		ArrayList lista = new ArrayList();



		//
		//adiciona objetos na lista
		//
		lista.add("Teste 1");
		lista.add("Teste 2");
		lista.add(new String("Teste 3")); //mesmo efeito das linhas anteriores
		lista.add("Teste 4");

		//qualquer tipo de objeto pode ser adicionado...
		Pessoa pessoa = new Pessoa("Amanda", "374.743.851-20");
		lista.add(pessoa);

		Pessoa pessoa2 = new Pessoa("Paula", "872.137.173-32");
		lista.add(pessoa2);

		//
		//a lista aceita colocar o mesmo objeto varias vezes
		//
		String repetido = new String("Teste 5");
		lista.add(repetido);
		lista.add(repetido);
		lista.add(repetido);



		//
		//adiciona um objeto na primeira posicao da lista(o resto eh 'empurrado' para o fim)
		//
		lista.add(0, "Teste 0");



		//
		//remove o segundo(comeca com zero) objeto da lista
		//
		lista.remove(1);

		

		//
		//verifica se um objeto estah na lista
		//
		if (lista.contains(pessoa)) {

			//
			//verifica a posicao de o objeto encontrado na lista
			//
			int posicao = lista.indexOf(pessoa);



			//
			//remove um objeto da lista
			//
			lista.remove(pessoa);
			// OU
			//lista.remove(posicao);

		}



		//
		//coloca um objeto na ultima posicao da lista (substitui o anterior)
		//
		lista.set(lista.size() - 1, "Teste 6");



		//
		//Verifica se a lista estah vazia
		//
		if (lista.isEmpty()) {
			System.out.println("A lista estah vazia");
		} else {

			//
			//pega a quantidade de objetos na lista
			//
			int qtdeObjetos = lista.size();
			System.out.println("A lista nao estah vazia, estah com " + qtdeObjetos + " objetos:");
			
			
			
			//
			//percorre a lista
			//
			for (int i = 0; i < lista.size(); i++) {
				//
				//pega um objeto localizado numa determinada posicao
				//
				Object obj = lista.get(i);//todo objeto sai da lista como object!

				if (obj instanceof String) {

					String tmp = (String) obj;//cast para String
					System.out.println("\t" + tmp);

				} else if (obj instanceof Pessoa) {

					Pessoa tmp = (Pessoa) obj;//cast para Pessoa
					System.out.println("\t" + tmp.getNome() + " - " + tmp.getCpf());
				}
			}

		}

		

		//
		//ultima ocorrencia de um objeto na lista
		//
		int ultimaOcorrencia = lista.lastIndexOf(repetido);
		System.out.println("\tO objeto '" + repetido + "' aparece por ultimo na posicao " + ultimaOcorrencia);


		
		//
		//sublist - retorna uma lista parcial
		//
		int posicaoFinal = lista.size()/2;
		List subLista = lista.subList(0, posicaoFinal);
		System.out.println("\tA sublista ficou com " + subLista.size() + " posicoes");

		

		//
		//obtem um vetor de objetos a partir da lista
		//
		Object[] arrayObject = lista.toArray();



		//
		//'limpa' a lista - remove todos os objetos da lista -
		//
		lista.clear();

	}

}
