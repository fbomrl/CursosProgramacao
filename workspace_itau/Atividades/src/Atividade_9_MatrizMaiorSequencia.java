
public class Atividade_9_MatrizMaiorSequencia {

	public static void main(String[] args) {

		int[] valores = { 10, 5, 6, 8, 9, 22, 15, 40, 14 };
		int maiorvalor = valores[0];
		int menorvalor = valores[0];
		
		for (int contador = 0; contador < valores.length; contador++) {

			if (maiorvalor < valores[contador]) {
				maiorvalor = valores[contador];
			} 
			else if (menorvalor > valores[contador]) {
				menorvalor = valores[contador];
			}

		}
		System.out.println(maiorvalor);
		System.out.println(menorvalor);
	}

}
