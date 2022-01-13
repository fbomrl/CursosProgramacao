
public class Atividade_2_calculo_idade {

	public static void main(String[] args) {

		// Desenvolver o projeto calculo da idade
		String nome = "José da Silva";
		String cargo = "Analista de Sistemas";
		int ano_nasc = 1989;
		int ano_atual = 2022;
		int idade = ano_atual - ano_nasc;
		;

		System.out.println("O funcionário " + nome + " que está no cargo de " + cargo + " tem " + idade + " anos.");
		
		System.out.printf("O funcionário %s que está no cargo de %s tem %d anos", nome, cargo, idade);
		System.out.println(" ");
		
		if (idade < 18) {
			System.out.println("Funcionário MENOR de idade.");
		}
		else {
			System.out.println("Funcionário MAIOR de idade");
		}
	}
	

}
