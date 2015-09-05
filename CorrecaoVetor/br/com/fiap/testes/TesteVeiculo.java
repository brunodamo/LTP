package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acessorio;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.excecao.Excecao;

public class TesteVeiculo {
	public static double totalVei(Veiculo[] v, int ind) {
		double total = 0;
		for (int i = 0; i < ind; i++) {
			total += v[i].getValor();
		}
		return total;
	}

	public static double mediaVei(Veiculo[] v, int ind) {
		double media = 0;
		for (int i = 0; i < ind; i++) {
			media += v[i].getValor();
		}
		return media / ind;
	}

	public static double maisCaro(Veiculo[] v, int ind) {
		double caro = v[0].getValor();
		for (int i = 0; i < ind; i++) {
			if (caro < v[i].getValor()) {
				caro = v[i].getValor();
			}
		}
		return caro;
	}

	public static String totalAcessorios(Veiculo[] v, int ind){
		String strMensagem="";
		for(int i=0; i<ind;i++){
			double dblTotal=0;
			for(int j=0;j<3;j++){
				dblTotal+=v[i].getAcessorios()[j].getValor();
			}
			strMensagem+="\n"+v[i].getModelo()+ " - " +
					"Acessórios: " + dblTotal; 
		}
		return strMensagem;
	}

	public static void main(String[] args) throws Excecao{
		Veiculo[] carros = new Veiculo[5];
		int indice = 0;
		try{
		do {
			carros[indice] = new Veiculo();
			carros[indice].setAnoFabricacao(Integer.parseInt(JOptionPane
					.showInputDialog("Digite o ano de Fabricação")));
			carros[indice].setModelo(JOptionPane
					.showInputDialog("Digite o Modelo"));
			carros[indice].setMontadora(JOptionPane
					.showInputDialog("Digite a Montadora"));
			carros[indice].setValor(Double.parseDouble(JOptionPane
					.showInputDialog("Digite o valor do Veiculo")));
			Acessorio[] vetAcessorio = new Acessorio[3];
			for (int i = 0; i < 3; i++) {
				vetAcessorio[i] = new Acessorio();
				vetAcessorio[i].setDescricao(JOptionPane
						.showInputDialog("Digite a descrição do acessório"));
				vetAcessorio[i].setValor(Double.parseDouble(JOptionPane
						.showInputDialog("Digite o valor do acessório")));
			}
			carros[indice].setAcessorios(vetAcessorio);
			indice++;
		} while (JOptionPane.showConfirmDialog(null, "?", "Exercicio",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		for (int i = 0; i < indice; i++) {
			System.out.println("Veiculo " + (i + 1));
			System.out.println("Modelo: " + carros[i].getModelo());
			System.out.println("Montadora: " + carros[i].getMontadora());
			System.out.println("Valor: " + carros[i].getValor());
			for (int j = 0; j < 3; j++) {
				System.out.println("Acessorio : " + (j + 1));
				System.out.println("Descricao: "
						+ carros[i].getAcessorios()[j].getDescricao());
				System.out.println("Valor: "
						+ carros[i].getAcessorios()[j].getValor());
				System.out.println();
			}
		}
		System.out.println("Total dos veiculos: " + totalVei(carros, indice));
		System.out.println("Media dos veiculos: " + mediaVei(carros, indice));
		System.out.println("Veiculo mais caro: " + maisCaro(carros, indice));
		System.out.println("Total de Acessórios: " + totalAcessorios(carros, indice));
		}catch(Exception e){
			throw new Excecao(e);
		}
	}

}
