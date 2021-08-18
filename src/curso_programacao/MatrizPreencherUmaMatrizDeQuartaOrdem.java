package curso_programacao;

import java.util.Scanner;

public class MatrizPreencherUmaMatrizDeQuartaOrdem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int linha=0, coluna=0, dp = 0,p2l=1,mai3c=0;

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
				System.out.println("Digite o valor para a posição [" + (linha + 1) + "," + (coluna + 1) + "]: ");
				matriz[linha][coluna] = sc.nextInt();
				if (linha == coluna) {
					dp = dp + matriz[linha][coluna];
				}

			}
		}
		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 4; coluna++) {
			System.out.print(matriz[linha][coluna]+"  ");	
			}
			System.out.println();
		}
		for (coluna = 0; coluna < 4; coluna++) {
			p2l = p2l * matriz[1][coluna];
		}
		for (linha = 0; linha < 4; linha++) {
			if(matriz[linha][2] > mai3c) {
			mai3c =  matriz[linha][2];	
			}
			}
		System.out.println("A soma dos valores da Diagonal Principal é:  " + dp);
		System.out.println("O Produto dos valores da Segunda Linha é: "+p2l);
		System.out.println("O maior valor da terceira coluna é: "+mai3c);
		sc.close();
	}

}
