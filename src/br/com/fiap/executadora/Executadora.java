package br.com.fiap.executadora;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Fornecedor;
import br.com.fiap.beans.Livro;

public class Executadora {
	
	static String texto(String d){
		return JOptionPane.showInputDialog(d);
	}
	static double decimal (String d){
		return Double.parseDouble(JOptionPane.showInputDialog(d));
	}

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setValor(Double.parseDouble(texto("Insira o valor")));
		livro.setCodigoDescricao(Integer.parseInt(texto("Insira o c�digo")), texto("Insira a descri��o"));
		System.out.println(livro.getTudo());
		
		Fornecedor f = new Fornecedor();
		livro.setFornecedor(f);
		f.setCnpj(texto("Insira o CNPJ"));
		f.setRazaoSocial(texto ("Insira a Raz�o Social"));
		System.out.println(livro.getTudo());
		Livro livro2 = new Livro();
		livro2.setFornecedor(f);
		livro2.setFornecedor(f);
		livro2.setCodigo(2);
	}

}	


/*
	Convers�es:
	
	Implicitas: 
		int x;
		double y=x;	

	Explicitar:
	*Parse
		Quando os tipos de dados s�o diferentes;
	
	*Casting:
		double x
		int y=(int)x;
*/