package curso_programacao;

import java.util.Scanner;

public class MethodFatorialDeUmNumero {

	static int numero, f, resultado=1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		f = fatorial(numero);
		System.out.println("O valor de " + numero + "! é igual a " + f);

		sc.close();
	}

	static int fatorial(int valor) {
		int contador;
		for (contador = 1; contador <= valor; contador++)
			;
		resultado = resultado * contador;
		numero = valor;
		return resultado;

	}
}
