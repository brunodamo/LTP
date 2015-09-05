public class Excecao1 extends Exception {
	public Excecao1(Exception e){
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Número inválido");
		}else{
			System.out.println("Erro desconhecido");
			e.printStackTrace();
		}
	}

}
