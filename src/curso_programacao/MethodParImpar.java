package curso_programacao;

import java.util.Scanner;

public class MethodParImpar {

	static void parimpar(int valor) {
		if (valor % 2 == 0) {
			System.out.println("O n�mero " + valor + " � PAR");
		} else {
			System.out.println("O n�mero " + valor + " � IMPAR");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();
		parimpar(numero);
		sc.close();
	}

}
