
public class MostraImpressao {

	public static void main(String[] args) {
		// Tipo de impress�o Print = faz a impress�o sem pular linha;
		System.out.print("Bom dia!");
		System.out.print("Como vai");

		// Tipo de impress�o Println = faz a impress�o dos resultados pulando linha;
		System.out.println("");
		System.out.println("Bom dia!");
		System.out.println("Como vai?");

		// Tipo de impress�o Printf = ;
		String nome = "Roberval Pereira";
		String endereco = "Rua Deus me chama";
		int idade = 35;
		String email = "roberval@terra.com.br";

		System.out.printf("O funcion�rio %s\n, mora no endere�o %s\n e tem %d anos", nome, endereco,idade);
		System.out.println("");
		System.out.println("O funcion�rio " + nome + ", mora no endere�o " + endereco);

	}

}
