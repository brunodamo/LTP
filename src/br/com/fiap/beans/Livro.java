package br.com.fiap.beans;

public class Livro extends Produto{
	private String autor;
	private String editora;
		
	public Livro() {
		super();
	}

	public Livro(String descricao, int codigo, double valor, Fornecedor fornecedor, String autor, String editora) {
		super(descricao, codigo, valor, fornecedor);
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}
