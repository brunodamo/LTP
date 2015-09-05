package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoCamada_v4 {
	public static void main(String[] args) throws Excecao{
		
		String strCargo = null, strNivel = null;
		double dblSalario=0;
		int resp=0;
		CargoDAO dao = new CargoDAO();
		
		try{
			while(resp==0){
				strCargo=JOptionPane.showInputDialog("Digite o cargo");
				strNivel=JOptionPane.showInputDialog("Digite o nivel");
				dblSalario=Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio"));
				Cargo c = new Cargo(strCargo, strNivel, dblSalario);
				System.out.println(dao.gravar(c));
				resp = JOptionPane.showConfirmDialog(null, "Continuar Cadastrando?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			}
			
//			System.out.println(dao.exibir());
			String strFind = JOptionPane.showInputDialog("Qual cargo deseja pesquisar?");
			dao.exibir(strFind);
		}catch (Exception e){
			throw new Excecao(e);
		}
	}
}