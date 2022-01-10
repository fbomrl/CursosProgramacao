package curso_programacao;

public class MatrizCriarUmaMatrizIdentidadeDeTerceiraOrdem {

	public static void main(String[] args) {

		int mid[][] = new int[3][3];
		int linha, coluna;

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				if (linha==coluna) {
					mid[linha][coluna] = 1;
				}
				else {
					mid[linha][coluna] = 0;
				}

			}
		}
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.print(mid[linha][coluna]+"  ");
			}
			System.out.println();
			}
		
	}

}
