package br.com.fiap.bo;

import br.com.fiap.beans.Cargo;
import br.com.fiap.dao.CargoDAO;
import br.com.fiap.excecoes.Excecao;

public class CargoBO {
	CargoDAO dao = new CargoDAO();
	public void incluir(String pCargo, String pNivel, double dblSalario) throws Excecao{
		if(pCargo.length()<2){
			throw new Excecao("Carecteres insuficientes no Cargo");
		}
		if (dblSalario<700){
			throw new Excecao("Sal�rio n�o pode ser menor que 700");
		}
		Cargo objeto = new Cargo (pCargo.toUpperCase(), pNivel.toUpperCase(), dblSalario);
		System.out.println(dao.gravar(objeto));
	}
	public void consultar() throws Excecao{
		System.out.println(dao.exibir());
	}
	public void consultarCargo(String pCargo) throws Excecao{
		dao.exibir(pCargo.toUpperCase());
	}
//	public void apagar(String pCargo) throws Excecao{
//		dao.deletar(pCargo);
//	}
	public boolean apagar(String pCargo) throws Excecao{
		return dao.deletar(pCargo);
	}
}
