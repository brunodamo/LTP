package br.com.fiap.testes;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Estado;

public class Teste1 {

	public static void main(String[] args) {
		String strNome = JOptionPane.showInputDialog("Qual o nome do estado ?");
		String strSigla = JOptionPane.showInputDialog("Qual a sigla do estado ?");
		Set<Integer> myDdd = new HashSet<Integer>();
		int resp = 0 ;
		while (resp ==0){
			int ddd = Integer.parseInt(JOptionPane.showInputDialog("Qual o n�mero do DDD ?"));
			myDdd.add(ddd);
			resp = (JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais DDD's ?", "SetList de Estados"
					, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE));
		}
		Estado e = new Estado();
		e.setNome(strNome);
		e.setSigla(strSigla);
		e.setDdd(myDdd);
		System.out.println(e.getEstado() + "\n" + e.getDdd());
	}
}

