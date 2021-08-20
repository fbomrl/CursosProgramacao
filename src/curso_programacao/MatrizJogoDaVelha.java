package curso_programacao;

public class MatrizJogoDaVelha {
	static int jv [][] = new int [3][3];
	static int linha, coluna;
	
	public static void main(String[] args) {
	
		jogodavelha();
		
	}
	
	
	
	
	
	public static void jogodavelha() {
		int jv [][] = new int [3][3];
		
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				jv[linha][coluna]=0;
			}
			
		}
	}
}
