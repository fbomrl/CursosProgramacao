import java.util.Scanner;

public class Atividade_3_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int n1;
		int n2;
		int n3;
		int n4;

		System.out.println("Nome do aluno: ");
		nome = sc.next();
		System.out.println("Nota 1: ");
		n1 = sc.nextInt();
		System.out.println("Nota 2: ");
		n2 = sc.nextInt();
		System.out.println("Nota 3: ");
		n3 = sc.nextInt();
		System.out.println("Nota 4: ");
		n4 = sc.nextInt();

		int media = (n1 + n2 + n3 + n4) / 4;

		System.out.println("O aluno " + nome + " recebeu as notas " + n1 + ", " + n2 + ", " + n3 + ", " + n4
				+ ", com uma média de " + media);
		if (media < 5) {
			System.out.println("O Aluno está reprovado");
		} else if (media == 5) {
			System.out.println("O aluno está de recuperação");
		} else {
			System.out.println("O Aluno está aprovado");
		}

		switch (media) {
		case 9,10:
			System.out.println("Conceito A");
			break;
		case 7, 8:
			System.out.println("Conceito B");
			break;
		case 5, 6:
			System.out.println("Conceito C");
			break;
		case 3, 4:
			System.out.println("Conceito D");
			break;
		case 0, 1, 2:
			System.out.println("Conceito E");
			break;
		}
	}

}
