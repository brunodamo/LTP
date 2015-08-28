package br.com.fiap.testes;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Estado;

public class Teste2 {

	public static void main(String[] args) {
		Set<Estado> myState = new HashSet<Estado>();


		int respDdd = 0 ;
		int respEstado = 0;
		while (respEstado ==0){
			String strNome = JOptionPane.showInputDialog("Qual o nome do estado ?");
			String strSigla = JOptionPane.showInputDialog("Qual a sigla do estado ?");
			Set<Integer> myDdd = new HashSet<Integer>();	
			while (respDdd ==0){
				int ddd = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero do DDD ?"));
				myDdd.add(ddd);
				respDdd = (JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais DDD's ?", "SetList de DDD's"
						, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
			}
			respDdd=0;
			Estado e = new Estado();
			e.setNome(strNome);
			e.setSigla(strSigla);
			e.setDdd(myDdd);
			myState.add(e);
			respEstado = (JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais Estados ?", "SetList de Estados"
					, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
		}
		for (Estado st : myState){
			System.out.println(st.getEstado()+ "\n" + st.getDdd());
		}
	}

}