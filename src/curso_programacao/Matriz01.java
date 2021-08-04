package curso_programacao;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		// Escreva um exercicio que lê uma matriz M (5.5) e calcula as somas:
		// - da Linha 4 do M
		// - da Coluna 2 do M
		// - da diagonal Principal:
		// - da diagonal secundária:
		// - de todos os elementos da matriz:
		// - Escreva essas somas e a matriz:

		Scanner in = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		int c = 0, l = 0, l4 = 0, c2 = 0, dp = 0, ds = 0, total = 0;

		for (l = 0; l < 5; l++) {
			for (c = 0; c < 5; c++) {
				System.out.println("Insira um valor para a posição (" + (l + 1) + "," + (c + 1) + ")");
				matriz[l][c] = Integer.parseInt(in.nextLine());

				if (l == 3) {
					l4 += matriz[l][c];
				}
				if (c == 1) {
					c2 += matriz[l][c];
				}
				if (l == c) {
					dp += matriz[l][c];
				}
				if ((l + c) == 4) {
					ds += matriz[l][c];
				}
				total += matriz[l][c];
			}
		}
		for (l = 0; l < 5; l++) {
			for (c = 0; c < 5; c++) {
				System.out.print(matriz[l][c] + "  ");

			}
			System.out.println();
		}

		System.out.println("A linha 4 da Matriz é: " + l4);
		System.out.println("A coluna 2 da Matriz é: " + c2);
		System.out.println("A soma da Diagonal Principal é: " + dp);
		System.out.println("A soma da Diagonal Secundária é: " + ds);
		System.out.println("A soma total é: " + total);

		in.close();
	}

}
