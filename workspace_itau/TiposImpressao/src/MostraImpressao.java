
public class MostraImpressao {

	public static void main(String[] args) {
		// Tipo de impressão Print = faz a impressão sem pular linha;
		System.out.print("Bom dia!");
		System.out.print("Como vai");

		// Tipo de impressão Println = faz a impressão dos resultados pulando linha;
		System.out.println("");
		System.out.println("Bom dia!");
		System.out.println("Como vai?");

		// Tipo de impressão Printf = ;
		String nome = "Roberval Pereira";
		String endereco = "Rua Deus me chama";
		int idade = 35;
		String email = "roberval@terra.com.br";

		System.out.printf("O funcionário %s\n, mora no endereço %s\n e tem %d anos", nome, endereco,idade);
		System.out.println("");
		System.out.println("O funcionário " + nome + ", mora no endereço " + endereco);

	}

}
