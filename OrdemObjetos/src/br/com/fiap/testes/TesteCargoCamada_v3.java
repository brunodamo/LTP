package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoCamada_v3 {
	public static void main(String[] args) throws Excecao{
		
		String strCargo = null, strNivel = null;
		double dblSalario=0;
		int resp=0;
		try{
			while(resp==0){
				strCargo=JOptionPane.showInputDialog("Digite o cargo");
				strNivel=JOptionPane.showInputDialog("Digite o nivel");
				dblSalario=Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio"));
				System.out.println(new CargoDAO().gravar(strCargo, strNivel, dblSalario));
				resp = JOptionPane.showConfirmDialog(null, "Continuar Cadastrando?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			}
			
			
		}catch (Exception e){
			throw new Excecao(e);
		}
	}
}
