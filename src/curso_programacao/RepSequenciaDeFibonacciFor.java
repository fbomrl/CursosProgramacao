package curso_programacao;

import java.util.Scanner;

public class RepSequenciaDeFibonacciFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 0, natual = 1, nanterior = 1, nint = 1;

		for (contador = 1; contador <= 15; contador++) {

			if (contador <= 1) {
				natual = 0;
			} else if (contador >= 2) {
				nanterior = nint;
				nint = natual;
				natual = natual + nanterior;

			}
			System.out.println(natual);
		}

		sc.close();

	}

}
