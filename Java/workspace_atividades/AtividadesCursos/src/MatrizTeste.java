package curso_programacao;

import java.util.Scanner;

public class MatrizTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int linha = 0, coluna = 0, opcao = 0, dp = 0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor da posição [" + (linha + 1) + "," + (coluna + 1) + "]: ");
				matriz[linha][coluna] = sc.nextInt();
			}
			
			if (linha > coluna) {
				System.out.print(matriz[linha][coluna] + "   ");
				System.out.println();
			}
		}
		sc.close();
	}

}
