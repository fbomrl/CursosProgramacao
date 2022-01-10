package curso_programacao;

import java.util.Scanner;

public class VetorCorrigindoProvas2 {

	static double soma, media;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("PASSO 1 -  CADASTRO DE GABARITO");
		System.out.println("===============================");
		String gabarito[] = { "a", "a", "a", "a", "a" };

		String nomes[] = new String[3];
		String respostas[] = new String[15];
		double med = 0, s = 0;

		// for (int g = 0; g < 5; g++) {
		// System.out.println("Questão " + (g + 1) + ":");
		// gabarito[g] = sc.nextLine();
		// }

		int repAluno = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("===============================");
			System.out.println("ALUNO " + (i + 1) + ":");
			System.out.println("===============================");
			System.out.println("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.println("RESPOSTAS DADAS");

			if (repAluno == 0) {
				for (int r = repAluno; r < 5; r++) {
					System.out.println("Questão " + (r + 1) + ":");
					respostas[r] = sc.nextLine();
					repAluno = r + 1;
				}

				continue;
			}

			if (repAluno == 5) {
				for (int r = repAluno; r <= 9; r++) {
					System.out.println("Questão " + (r + 1) + ":");
					respostas[r] = sc.nextLine();
					repAluno = r + 1;
				}
				continue;
			}

			if (repAluno == 10) {
				for (int r = repAluno; r <= 14; r++) {
					System.out.println("Questão " + (r + 1) + ":");
					respostas[r] = sc.nextLine();
					repAluno = r + 1;
				}
				continue;
			}

		}

		for (int i = 0; i < 3; i++) {
			int pontos = 0;

			if (i == 0) {
				for (int r = 0; r <= 4; r++) {
					if (gabarito[r].equals(respostas[r])) {
						pontos += 2;
					}
				}
				System.out.println("ALUNO " +nomes[i]+  " pontos " + pontos);
				
			}

			if (i == 1) {
				for (int r = 5; r <= 9; r++) {
					if (gabarito[r].equals(respostas[r])) {
						pontos += 2;
					}
				}
				System.out.println("ALUNO " +nomes[i]+  " pontos " + pontos);
			}

			if (i == 2) {
				for (int r = 10; r <= 14; r++) {
					if (gabarito[r].equals(respostas[r])) {
						pontos += 2;
					}
				}
				System.out.println("ALUNO " +nomes[i]+  " pontos " + pontos);
			}
		}

	}
}