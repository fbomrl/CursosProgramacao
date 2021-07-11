package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EscolhendoPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		char sexo, resposta = 'S';
		int idade, cabelo, masculino = 0, feminino = 0;

		System.out.println("==========================");
		System.out.println("    SELETOR DE PESSOAS    ");
		System.out.println("==========================");
		Scanner sc = new Scanner(System.in);

		while (resposta == 'S') {
			System.out.println("Qual o Sexo? [M/F} ");
			sexo = sc.next().charAt(0);
			System.out.println("Qual idade? ");
			idade = sc.nextInt();
			System.out.println("Qual a cor do cabelo? ");
			System.out.println("---------------------");
			System.out.println("[1] Preto");
			System.out.println("[2] Castanho");
			System.out.println("[3] Loiro");
			System.out.println("[4] Ruivo");
			cabelo = sc.nextInt();

			switch (cabelo) {

			case 2: {

				if (sexo == 'M' && idade > 18) {
					masculino++;
				}
				break;
			}
			case 3: {

				if (sexo == 'F' && idade > 25 && idade < 30) {
					feminino++;
				}
				break;
			}

			}

			System.out.println("Quer continuar? [S/N]");
			resposta = sc.next().charAt(0);

		}

		System.out.println("Total de homens com mais de 18 e cabelos castanhos: " + masculino);
		System.out.println("Total de mulheres entre 25 e 30 anos e cabelos loiros: " + feminino);
		sc.close();
	}

}
