package curso_programacao;

import java.util.Scanner;

public class CondQuantosEntre0e10For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador, numero, total = 0, impar = 0;

		for (contador = 1; contador <= 6; contador++) {
			System.out.println("Digite um valor: ");
			numero = sc.nextInt();
			if (numero >= 0 && numero <= 10) {
				total = total + 1;
			
			if ((numero % 2) == 1) {
				impar = impar + numero;
			}
			}
		}
		System.out.println("Ao todo foram " + total + " valores entre 0 e 10.");
		System.out.println("Nesse intervalo, a soma de impares foi "+impar);

		sc.close();

	}

}
