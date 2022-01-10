package curso_programacao;

import java.util.Scanner;

public class MatrizDissecandoMatrizes {

	public static void main(String[] args) {

		/*
		 * for (linha = 0; linha < 4; linha++) { for (coluna = 0; coluna < 4; coluna++)
		 * { System.out.println("Digite o valor da posição [" + (linha + 1) + "," +
		 * (coluna + 1) + "]: "); matriz[linha][coluna] = sc.nextInt(); } }
		 */

		mostrarMatriz();

	}


	private static void mostrarMatriz() {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		int matriz[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
		int linha = 0, coluna = 0;

		opcao = menu(sc);

		switch (opcao) {
		case 1:
			// MATRIZ COMPLETA
			for (linha = 0; linha < 4; linha++) {
				for (coluna = 0; coluna < 4; coluna++) {
					System.out.print(matriz[linha][coluna] + "   ");
				}
				System.out.println();
			}
			mostrarMatriz();
			break;

		case 2:
			// DIAGONAL PRINCIPAL
			for (linha = 0; linha < 4; linha++) {
				for (coluna = 0; coluna < 4; coluna++) {
					if (coluna == linha) {
						System.out.print(matriz[linha][coluna] + "  ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			mostrarMatriz();
			break;
		case 3:
			// TRIANGULO SUPERIOR
			for (linha = 0; linha < 4; linha++) {
				for (coluna = 0; coluna < 4; coluna++) {
					if (coluna > linha) {
						System.out.print(matriz[linha][coluna] + "  ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			mostrarMatriz();
			break;
		// TRIANGULO INFERIOR
		case 4:
			// TRIANGULO SUPERIOR
			for (linha = 0; linha < 4; linha++) {
				for (coluna = 0; coluna < 4; coluna++) {
					if (coluna < linha) {
						System.out.print(matriz[linha][coluna] + "  ");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			mostrarMatriz();
			break;

		case 5:
			// SAIR;
			System.out.println("Encerrando..........");
			break;

		default:
			System.out.println("Encerrando..........");
		}
		sc.close();
	}
	
	public static int menu(Scanner sc) {

		System.out.println("     MENU DE OPÇÕES     ");
		System.out.println("========================");
		System.out.println("[1] Mostrar a Matriz");
		System.out.println("[2] Diagonal Principal");
		System.out.println("[3] Triangulo Superior");
		System.out.println("[4] Triangulo Inferior");
		System.out.println("[5] Sair");
		System.out.println("=================  OPÇÃO");

		return sc.nextInt();

	}

}
