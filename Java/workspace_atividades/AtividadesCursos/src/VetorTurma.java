package curso_programacao;

import java.util.Scanner;

public class VetorTurma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome[] = new String[4];
		double n1[] = new double[4];
		double n2[] = new double[4];
		double media[] = new double[4];
		double somaMedia = 0, mediaTotal;
		int total = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("ALUNO " + (i + 1));
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("Primeira nota: ");
			n1[i] = sc.nextDouble();
			System.out.println("Segunda nota: ");
			n2[i] = sc.nextDouble();
			media[i] = (n1[i] + n2[i]) / 2;
			somaMedia = somaMedia + media[i];
		}

		mediaTotal = somaMedia / 4;

		System.out.println("   LISTAGEM DE ALUNOS   ");
		System.out.println("========================");

		for (int i = 0; i < 4; i++) {
			System.out.println(nome[i] + " " + media[i]);
			if (media[i] > mediaTotal) {
				total = total + 1;
			}

		}
		System.out.println("Ao todo temos " + total + " alunos acima da média da turma que é " + mediaTotal);
		sc.close();
	}

}
