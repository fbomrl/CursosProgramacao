import java.util.Scanner;

public class Atividade_8_MatrizAlunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nome = { "Givanildo", "Tarciano", "Petrolina" };
		double[] nota1 = { 8, 5, 7 };
		double[] nota2 = { 10, 2, 5 };

		for (int contador = 0; contador < nome.length; contador++) {
			double media = (nota1[contador] + nota2[contador]) / 2;
			System.out.println("NOME - " + nome[contador] + " NOTA 1 - " + nota1[contador] + " NOTA 2 - "
					+ nota2[contador] + " MÉDIA - " + media);

			if (media >= 5) {
				System.out.println("Aluno Aprovado");
			} else {
				System.out.println("Aluno Reprovado");
			}

		}
		System.out.println("----");

		System.out.println();
	}

}
