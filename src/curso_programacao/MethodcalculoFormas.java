package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MethodcalculoFormas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double A, B, C, tri, circ, trap, quad, retan;

		System.out.println("Digite o primeiro valor: ");
		A = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		B = sc.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		C = sc.nextDouble();

		tri = triangulo(A, C);
		MethodCalculoTriangulo.verificarSeTriangulo(A, B, C);
		System.out.println("�REA DO TRI�NGULO: " + tri);
		MethodCalculoTriangulo.verificarLadosTriangulo(A, B, C);
		circ = circulo(C);
		System.out.println("�REA DO CIRCULO: " + circ);
		trap = trapezio(A, B, C);
		System.out.println("�REA DO TRAP�ZIO: " + trap);
		quad = quadrado(B);
		System.out.println("�REA DO QUADRADO: " + quad);
		retan = retangulo(A, B);
		System.out.println("�REA DO RETANGULO: " + retan);

		sc.close();
	}

	public static Double triangulo(Double A, Double C) {

		return A * C / 2.0;
	}

	public static Double circulo(Double C) {

		return 3.14159 * C * C;
	}

	public static Double trapezio(Double A, Double B, Double C) {

		return (A + B) / 2.0 * C;
	}

	public static Double quadrado(Double B) {

		return B * B;
	}

	public static Double retangulo(Double A, Double B) {

		return A * B;
	}
}
