package curso_programacao;

import java.util.Scanner;

public class MatrizJogodaVelha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		char A = 'X';
		
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Vai jogar " + A + " em qual posição?");
		opcao = sc.nextInt();
	
		if(A == 'X' || A =='x') {
			jogador1(opcao);
		}
		else {
			jogador2(opcao);
		}


	}

	public static int jogador1(int opcao) {
		switch (opcao) {
		case 1:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 0) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
			tabuleiro();
		case 2:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 1) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
			tabuleiro();
		case 3:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 2) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
			tabuleiro();
		case 4:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 0) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
			tabuleiro();
		case 5:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 1) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
		case 6:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 2) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
		case 7:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 0) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
		case 8:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 1) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
		case 9:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 2) {
						System.out.print("X" + "   ");
					} else {
						System.out.print(jv[linha][coluna] + "   ");
					}
				}
				System.out.println();
			}
		}
	}

	public static int jogador2(int opcao) {
	
	}
	
	
	public static int tabuleiro(Scanner sc) {
		int jv[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int linha = 0, coluna = 0;
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print(jv[linha][coluna] + "   ");
			}
			System.out.println();
		}

		return sc.nextInt();
	}
	
}
