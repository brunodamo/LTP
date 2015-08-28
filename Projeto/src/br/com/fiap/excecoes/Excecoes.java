package br.com.fiap.excecoes;

public class Excecoes extends Exception{
	public Excecoes(String mensagem, Exception e){
		super (mensagem, e);
		this.print();
		e.printStackTrace();
		//Envia e-mail para o respons�vel
	}
	public Excecoes (String mensagem){
		super(mensagem);
		// Envia e-mail para o respons�vel
	}
	public Excecoes (Exception e){
		if (e.getClass().toString().equals("class java.lang.ArithmeticException")){
			System.out.println("Zero no divisor");
		}else if (e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("N�mero Inv�lido");
		}else{
			System.out.println("Erro fatal");
			e.printStackTrace();
		}
	}
	public void print(){
		System.out.println("========== Tratando Erro============");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace: ");
	}
}