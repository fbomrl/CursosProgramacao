package curso_programacao;

import java.util.Scanner;

public class VetorCorrigindoProvas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PASSO 1 -  CADASTRO DE GABARITO");
		System.out.println("===============================");
		String gabarito[] = new String[5];
		String nome[] = new String[3];
		String resposta[] = new String[5];
		double media, mediatotal;

		for (int i = 0; i < 5; i++) {
			System.out.println("Questão " + (i + 1) + ":");
			gabarito[i] = sc.nextLine();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("===============================");
			System.out.println("ALUNO " + (i + 1) + ":");
			System.out.println("===============================");
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("RESPOSTAS DADAS");
			
			for (i = 0; i < 5; i++) {
				
				System.out.println("Questão " + (i + 1) + ":");
				resposta[i] = sc.nextLine();
			}
		}

		System.out.println("===============================");
		System.out.println("Media da turma: ");
		sc.close();
	}
	
}
