package br.com.fiap.tds.ltp.colecoes.exemploList;

import br.com.fiap.tds.ltp.colecoes.entidades.Pessoa;

import java.util.ArrayList;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ExemploArrayList {

	public static void main(String args[]) {

		//
		//Instancia um objeto do tipo ArrayList
		//
		ArrayList lista = new ArrayList();
		
		
		
		//
		//adiciona objetos na lista
		//
		lista.add("um");
		lista.add("dois");
		lista.add("tres");
		lista.add("dois");
		lista.add("quatro");

		/*
		Pessoa pessoa = new Pessoa("Regina","152.957.115-55");
		lista.add(pessoa);
		*/
		
		
		
		//
		//percorre a lista
		//
		for (int i = 0; i < lista.size(); i++) {

			System.out.println("Objeto["+i+"]: " + lista.get(i));
		}
		
		
		
		// OU
		//for(Object o: lista)
		//	System.out.println("Objeto: " + o);

	}

}