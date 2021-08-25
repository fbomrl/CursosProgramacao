package curso_programacao;

import java.util.Scanner;

public class MatrizJogoDaVelha {
	static int linha = 0, coluna = 0, opcao;
	static Scanner sc = new Scanner(System.in);
	static String jv[][] = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

	public static void main(String[] args) {

		tab(jv);

	}

	public static String[][] jogador1(String jv[][]) {
		String X = "X";

		System.out.println();

		System.out.println("Vai jogar " + X + " em qual posição?");
		opcao = sc.nextInt();

		switch (opcao) {

		case 1:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 0) {
						jv[0][0] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 2:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 1) {
						jv[0][1] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;

		case 3:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 2) {
						jv[0][2] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 4:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 0) {
						jv[1][0] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 5:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 1) {
						jv[1][1] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 6:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 2) {
						jv[1][2] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 7:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 0) {
						jv[2][0] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 8:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 1) {
						jv[2][1] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);

			break;
		case 9:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 2) {
						jv[2][2] = "X";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();

			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			jogador2(jv);
			break;

		}

		return jv;

	}

	public static String[][] jogador2(String jv[][]) {
		String O = "O";
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Vai jogar " + O + " em qual posição?");

		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 0) {
						jv[0][0] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}

			tab(jv);

			break;
		case 2:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 1) {
						jv[0][1] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;

		case 3:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 0 && coluna == 2) {
						jv[0][2] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;
		case 4:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 0) {
						jv[1][0] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;
		case 5:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 1) {
						jv[1][1] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;
		case 6:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 1 && coluna == 2) {
						jv[1][2] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;
		case 7:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 0) {
						jv[2][0] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;
		case 8:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 1) {
						jv[2][1] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();
			}
			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);

			break;
		case 9:
			for (linha = 0; linha < 3; linha++) {
				for (coluna = 0; coluna < 3; coluna++) {
					if (linha == 2 && coluna == 2) {
						jv[2][2] = "O";
					}
					System.out.print(jv[linha][coluna] + "   ");
				}
				System.out.println();

			}

			if (isGameEnded(jv)== true ) {
				break;
			}
			tab(jv);
			break;

		}
		return jv;
	}

	public static String[][] tab(String jv[][]) {
		System.out.println("------------------------------------");
		System.out.println("--------TABELA JOGO DA VELHA--------");
		System.out.println("------------------------------------");

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print(jv[linha][coluna] + "   ");

			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");

		jogador1(jv);

		return jv;
	}

	private static Boolean isGameEnded(String jv[][]) {
		String diagonalPrincipal[][] = {};

		//VERIFICAÇÃO DA DIAGONAL PRINCIPAL
		if (jv[0][0] == "X" && jv[1][1] == "X" && jv[2][2] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][0] == "O" && jv[1][1] == "O" && jv[2][2] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		
		//VERIFICAÇÃO DE LINHAS
		if (jv[0][0] == "X" && jv[0][1] == "X" && jv[0][2] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[1][0] == "X" && jv[1][1] == "X" && jv[1][2] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[2][0] == "X" && jv[2][1] == "X" && jv[2][2] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][0] == "O" && jv[0][1] == "O" && jv[0][2] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[1][0] == "O" && jv[1][1] == "O" && jv[1][2] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[2][0] == "O" && jv[2][1] == "O" && jv[2][2] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		//VERIFICAÇÃO DE COLUNAS
		if (jv[0][0] == "X" && jv[1][0] == "X" && jv[2][0] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][1] == "X" && jv[1][1] == "X" && jv[2][1] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][2] == "X" && jv[1][2] == "X" && jv[2][2] == "X") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][0] == "O" && jv[1][0] == "O" && jv[2][0] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][1] == "O" && jv[1][1] == "O" && jv[2][1] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		if (jv[0][2] == "O" && jv[1][2] == "O" && jv[2][2] == "O") {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;	
		}
		//JOGO SEM RESULTADO!
/*		if () {
			System.out.println("------------------------------------");
			System.out.println("Jogo Encerrado!!!!!!!!!");
			return true;
		}*/
		return false;
	}
}
