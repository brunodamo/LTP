package br.com.fiap.beans;

import java.util.Set;

public class Estado {
	private String nome;
	private String sigla;
	private Set<Integer> ddd;
	
	public String getEstado(){
		return "Estado: " + nome + "\nSigla: " + sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Set<Integer> getDdd() {
		return ddd;
	}
	public void setDdd(Set<Integer> ddd) {
		this.ddd = ddd;
	}
	public Estado(String nome, String sigla, Set<Integer> ddd) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.ddd = ddd;
	}
	public Estado() {
		super();
	}
	
}
