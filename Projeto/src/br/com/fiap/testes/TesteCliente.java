package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecoes;

public class TesteCliente {
	public static void main(String[] args) throws Excecoes {
		try{
			Cliente objCliente = new Cliente ();
			objCliente.setCodigo(Long.parseLong(JOptionPane.showInputDialog("Digite o c�digo")));
		}catch (Exception e){
			//System.out.println(e);
			throw new Excecoes (e);
		}
	}
}