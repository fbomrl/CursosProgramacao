
public class Atividade_2_calculo_idade {

	public static void main(String[] args) {

		// Desenvolver o projeto calculo da idade
		String nome = "Jos� da Silva";
		String cargo = "Analista de Sistemas";
		int ano_nasc = 1989;
		int ano_atual = 2022;
		int idade = ano_atual - ano_nasc;
		;

		System.out.println("O funcion�rio " + nome + " que est� no cargo de " + cargo + " tem " + idade + " anos.");
		
		System.out.printf("O funcion�rio %s que est� no cargo de %s tem %d anos", nome, cargo, idade);
		System.out.println(" ");
		
		if (idade < 18) {
			System.out.println("Funcion�rio MENOR de idade.");
		}
		else {
			System.out.println("Funcion�rio MAIOR de idade");
		}
	}
	

}
