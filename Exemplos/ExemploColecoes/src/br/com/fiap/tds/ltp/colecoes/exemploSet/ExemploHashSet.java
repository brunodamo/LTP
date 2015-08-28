package br.com.fiap.tds.ltp.colecoes.exemploSet;

import java.util.HashSet;
import java.util.Iterator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ExemploHashSet {

	
	public static void main(String args[]) {

		//
		//Instancia um objeto do tipo HashSet
		//
		HashSet set = new HashSet();



		//
		//adiciona objetos no Set (nao ha duplicacao de elementos no Set)
		//
		set.add("um");
		set.add("dois");
		set.add("tres");
		set.add("dois");
		set.add("quatro");
		set.remove("tres");

		
		
		//
		//percorre o Set
		//
		for(Object o: set)
			System.out.println("Objeto: " + o);
	

	}
}
