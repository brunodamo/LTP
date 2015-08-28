package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.excecoes.Excecoes;


public class TesteClienteFone {
	public static void main(String[] args) throws Excecoes {
		List<Cliente> meusClientes = new ArrayList <Cliente>();
		int resp = 0;
		int respCliente =0;
		while (respCliente == 0){
			String strNome = JOptionPane.showInputDialog("Digite o nome do cliente");
			List<Telefone> meusFones = new ArrayList<Telefone>();
			while (resp == 0){
				short shoDdd = Short.parseShort(JOptionPane.showInputDialog("Digite o DDD do telefone"));
				int intNum = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone"));
				Telefone telefone = new Telefone (shoDdd, intNum);
				meusFones.add(telefone);
				resp = JOptionPane.showConfirmDialog(null, "Cadastrar mais telefones ?", "ArrayList de Objetos",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			}
			resp=0;
			Cliente pessoa = new Cliente();
			pessoa.setNome(strNome);
			pessoa.setTels(meusFones);
			meusClientes.add(pessoa);
			respCliente = JOptionPane.showConfirmDialog(null, "Cadastrar mais Clientes ?", "ArrayList de Objetos",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
		}
		for (Cliente c : meusClientes){
			System.out.println(c.getNome());
			for (Telefone t : c.getTels()){
				System.out.println(t.getTelefone());
			}
		}

	}


}
