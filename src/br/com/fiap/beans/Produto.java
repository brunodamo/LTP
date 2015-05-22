package br.com.fiap.beans;

public class Produto {
	protected String descricao;
	protected int codigo;
	protected double valor;
	protected Fornecedor fornecedor;
	
	public Produto() {
		super();
	}

	public Produto(String descricao, int codigo, double valor,
			Fornecedor fornecedor) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public void setCodigoDescricao(int c, String d){
		codigo = c;
		descricao = d;
	}
	
	public String getTudo(){
		return "O código: "+codigo+"\nA descrição: "+descricao+"\nO valor: "+valor;
	}
}
