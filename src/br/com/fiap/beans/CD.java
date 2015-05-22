package br.com.fiap.beans;

public class CD extends Produto {
	private String artista;
	private String gravadora;
		
	public CD() {
		super();
	}
	public CD(String descricao, int codigo, double valor, Fornecedor fornecedor, String autor, String editora) {
		super(descricao, codigo, valor, fornecedor);
		this.artista = artista;
		this.gravadora = gravadora;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
}
