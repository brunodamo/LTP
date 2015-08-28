package br.com.fiap.testes;

import javax.swing.JOptionPane;

public class TesteExcecao {
	public static void main (String[] args){
		int nota = 0;
		int div = 0;
		int resultado = 0;
		try{
			nota = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota"));
			div = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor"));
			resultado = nota /div;
			System.out.println("Resultado: "+resultado);
		}catch (ArithmeticException e){
			System.out.println("Valor zero no divisor - " + e);
		}catch(NumberFormatException e) {
			System.out.println("Não é um número - " + e);
		}finally {
			System.out.println("Nota : " + nota);
			System.out.close();
		}
	}
}
