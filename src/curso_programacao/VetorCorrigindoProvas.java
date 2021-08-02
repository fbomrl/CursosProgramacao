package curso_programacao;

import java.util.Scanner;

public class VetorCorrigindoProvas {
	static double soma, media;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PASSO 1 -  CADASTRO DE GABARITO");
		System.out.println("===============================");
		String gabarito[] = new String[5];
		String nome[] = new String[3];
		String resposta[] = new String[5];
		double med = 0, s = 0;
		int g=0, r=0, i=0;

		for (g = 0; g < 5; g++) {
			System.out.println("Questão " + (g + 1) + ":");
			gabarito[g] = sc.nextLine();
		}
		for (i = 0; i < 3; i++) {
			System.out.println("===============================");
			System.out.println("ALUNO " + (i + 1) + ":");
			System.out.println("===============================");
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("RESPOSTAS DADAS");

			for (r = 0; r < 5; r++) {
				System.out.println("Questão " + (r + 1) + ":");
				resposta[r] = sc.next();

			}
		}
		
		med = media(g, r);
		s = soma(g, r);
		System.out.println("          NOTAS FINAIS         ");
		System.out.println("===============================");
		System.out.println(nome[i]+"   "+s);
		System.out.println("===============================");
		System.out.println("Media da turma: " + med);
		sc.close();
	}

	static double media(double r, double g) {
		if (r == g) {
			soma = soma + 2;
			media = soma / 5;
		}

		return media;
	}
	static double soma(double r, double g) {
		if (r == g) {
			soma = soma + 2;
	
		}

		return soma;
	}
}
