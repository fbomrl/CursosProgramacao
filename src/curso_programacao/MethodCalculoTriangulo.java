package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class MethodCalculoTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		Double retaA, retaB, retaC;

		System.out.println("Tamanho da reta A :");
		retaA = sc.nextDouble();
		System.out.println("Tamanho da reta B :");
		retaB = sc.nextDouble();
		System.out.println("Tamanho da reta C :");
		retaC = sc.nextDouble();

		verificarSeTriangulo(retaA, retaB, retaC);
		verificarLadosTriangulo(retaA, retaB, retaC);


		sc.close();

	}

	public static void verificarSeTriangulo(Double retaA, Double retaB, Double retaC) {
		if (retaA < retaB + retaC || retaB < retaC + retaA || retaC < retaA + retaB) {
			System.out.println("-------------------------");
			System.out.println("Trata-se de um TRIÂNGULO.");
			System.out.println("-------------------------");
		}
		
	}

	public static void verificarLadosTriangulo(Double retaA, Double retaB, Double retaC) {
		if (retaA == retaB && retaA == retaC && retaB == retaC) {
			System.out.println("O triângulo tem 3 lados iguais, portanto ele é um triangulo EQUILÁTERO.");
		} else if (retaA == retaB || retaA == retaC || retaB == retaC) {
			System.out.println("O triângulo tem 2 lados iguais, portanto ele é um triangulo ISÓSCELES.");
		} else if (retaA != retaB && retaA != retaC && retaB != retaC) {
			System.out.println("O triângulo tem 3 lados diferentes, portanto ele é um triangulo ESCALENO.");
		} else {
			System.out.println("Não é um TRIÂNGULO");
		}
	}

}