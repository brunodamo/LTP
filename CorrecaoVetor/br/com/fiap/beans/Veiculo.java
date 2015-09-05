package br.com.fiap.beans;

public class Veiculo {
	private int anoFabricacao;
	private String modelo;
	private double valor;
	private String montadora;
	private Acessorio[] acessorios;

	public Veiculo(int anoFabricacao, String modelo, double valor,
			String montadora, Acessorio[] acessorios) {
		super();
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.valor = valor;
		this.montadora = montadora;
		this.acessorios = acessorios;
	}

	public Veiculo() {
		super();
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public Acessorio[] getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(Acessorio[] acessorios) {
		this.acessorios = acessorios;
	}

}
