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
		//método sort() ordena os objetos
		Collections.sort(cargos);
		System.out.println(cargos);
		//metodo get() retorna o objeto com base na posição
		for (int i=0; i<2; i++){
			System.out.println(cargos.get(i).toUpperCase());
		}
		String cargo = JOptionPane.showInputDialog("O que deseja pesquisar ?");
		//método IndexOf procura o objeto e retorna sua posição
		if (cargos.indexOf(cargo)>=0){
			System.out.println("Existe e está na posição: " +cargos.indexOf(cargo));
		}else{
			System.out.println("Não Existe");
		}
	}
}
