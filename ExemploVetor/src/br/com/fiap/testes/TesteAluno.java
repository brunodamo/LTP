package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class TesteAluno {
	public static void main(String[] args) {
		int resp=0, intFaltas=0, intIdade=0, indice=0;
		
		double dblMedia =0;
		String strNome = null;
		Aluno[] objeto = new Aluno[10];
		
		while (resp==0){
			strNome = JOptionPane.showInputDialog("Digite o nome do aluno");
			dblMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a m�dia"));
			intFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas"));
			intIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			objeto[indice] = new Aluno();
			objeto[indice].setNome(strNome);
			objeto[indice].setMedia(dblMedia);
			objeto[indice].setFaltas(intFaltas);
			objeto[indice].setIdade(intIdade);
			indice++;	
			resp = JOptionPane.showConfirmDialog(null, "Deseja Continuar ?", "Camadas", JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
		}
	}
}
