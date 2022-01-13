
public class Atividade_7_Matriz {

	public static void main(String[] args) {

		String[] nome = { "Pedro", "Paulo", "José", "Roberta", "Nicole", "Wilson", "Vera", "Vanessa" };
		String[] cargo = { "Vendedor", "Vendedor", "Analista de Sistemas", "Operador de Telemarketing",
				"VBA em Banco de dados", "Gerente de CPD", "Contadora", "Engenheira de Produtos" };

		System.out.println("-----------");
		System.out.println("PESSOAS ------ CARGO");
		System.out.println("-----------");
		for (int contador = 0; contador < nome.length; contador++) {
			System.out.println(nome[contador]+" - "+cargo[contador] );
		}
		
		System.out.println("-----------");
	}

}
