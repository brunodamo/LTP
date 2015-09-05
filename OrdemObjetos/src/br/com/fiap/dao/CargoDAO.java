package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cargo;
import br.com.fiap.excecoes.Excecao;

public class CargoDAO {
	private List<Cargo> lstCargos = new ArrayList<Cargo>();


	public String gravar (String pCargo, String pNivel, double pSalario) throws Excecao{
		lstCargos.add(new Cargo(pCargo, pNivel, pSalario));
		return"Gravado com sucesso";
	}

	public String gravar (Cargo c) throws Excecao{
		lstCargos.add(c);
		return "Gravado com sucesso";
	}

	public String exibir(){
		String strSaida="";
		for (Cargo c : lstCargos){
			strSaida += c.getCargo() + "-Sal�rio: " + c.getSalario() + "\n";
		}
		return strSaida;
	}
	public void exibir (String pCargo){
		for (Cargo c : lstCargos){
			if (c.getCargo().equals(pCargo)){
				System.out.println("\n"+c.getSalario()+ "\n" + c.getNivel());
			}
		}
	}
	public boolean deletar(String pCargo){
		for (Cargo c : lstCargos){
			if (c.getCargo().equals(pCargo)){
				lstCargos.remove(c);
				System.out.println("Removido com sucesso");
				return true;
			}
		}
		System.out.println("N�o encontrado");
		return false;
	}
}

