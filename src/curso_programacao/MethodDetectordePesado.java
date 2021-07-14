package curso_programacao;

import java.util.Scanner;

public class MethodDetectordePesado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String nome = "", pesado = "";
		double peso, maior = 0;

		topo(maior);

		for (i = 1; i <= 5; i++) {
			System.out.println("Digite o nome: ");
			nome = sc.next();
			System.out.println("Digite o peso de " + nome + ": ");
			peso = sc.nextDouble();
			if (peso >= maior) {
				maior = peso;
				pesado = nome;
			}
			topo(maior);	
		}
		topo(maior);
		System.out.println("A pessoa mais pesada foi " + pesado + ", com " + maior + " Kg.");
		sc.close();

	}

	private static void topo(double maior) {

		System.out.println("----------------------------------");
		System.out.println("       DETECTOR DE PESADO         ");
		System.out.println("Maior peso até agora: " + maior + " Kg");
		System.out.println("----------------------------------");


	}

}
