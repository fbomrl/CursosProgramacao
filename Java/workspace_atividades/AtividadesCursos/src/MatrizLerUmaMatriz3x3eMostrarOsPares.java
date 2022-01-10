package curso_programacao;

import java.util.Scanner;

public class MatrizLerUmaMatriz3x3eMostrarOsPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valores[][] = new int[3][3];
		int linha, coluna, totpar=0;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor para a posição ["+(linha+1) + "," + (coluna+1)+"]: ");
				valores [linha][coluna] = sc.nextInt();
			}
		}
		System.out.println("---MATRIZ---");
		System.out.println("------------");
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if(valores [linha][coluna]%2 == 0) {
				System.out.print("{"+valores [linha][coluna]+"} ");	
				totpar = totpar+1;
				}
				else {
			System.out.print(valores [linha][coluna] + "   ");
				}
			}
			System.out.println();
			}
		System.out.println("Ao todo foram digitador "+totpar+" valores pares.");
		
		sc.close();
	}

}
