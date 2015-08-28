package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ListaTeste {
	public static void main(String[] args) {
		List<String> cargos = new ArrayList<String>();
		cargos.add("DBA");
		cargos.add("Analista");
		cargos.add("Desenvolvedor");
		System.out.println(cargos);
		//m�todo sort() ordena os objetos
		Collections.sort(cargos);
		System.out.println(cargos);
		//metodo get() retorna o objeto com base na posi��o
		for (int i=0; i<2; i++){
			System.out.println(cargos.get(i).toUpperCase());
		}
		String cargo = JOptionPane.showInputDialog("O que deseja pesquisar ?");
		//m�todo IndexOf procura o objeto e retorna sua posi��o
		if (cargos.indexOf(cargo)>=0){
			System.out.println("Existe e est� na posi��o: " +cargos.indexOf(cargo));
		}else{
			System.out.println("N�o Existe");
		}
	}
}
