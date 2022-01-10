package curso_programacao;

import java.util.Scanner;

public class VetorValoresPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int val []= new int[7];
		int totpar = val[0];
		
		for (int i = 0; i < 7; i++) {
		System.out.println("Digite o valor "+(i+1)+"º valor: ");
		val[i] =sc.nextInt();
		}
		for (int i = 0; i < 7; i++) {
		if (val[i]%2==0) {
			totpar = totpar + 1;
			System.out.println("O valor PAR na posição "+(i+1));
		}
			
		}
		System.out.println("O Total de pares foi "+ totpar);
		sc.close();

	}

}
