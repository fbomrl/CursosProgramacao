package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondCalculoTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int retaA, retaB, retaC;
				
		System.out.println("Tamanho da reta A :");
		retaA = sc.nextInt();
		System.out.println("Tamanho da reta B :");
		retaB = sc.nextInt();
		System.out.println("Tamanho da reta C :");
		retaC = sc.nextInt();
					
		if (retaA < retaB + retaC || retaB < retaC+retaA || retaC < retaA+retaB) {
			System.out.println("-------------------------");
			System.out.println("Trata-se de um TRIÂNGULO.");
			System.out.println("-------------------------");
		}
		
		if (retaA == retaB && retaA == retaC && retaB == retaC) {
			System.out.println("O triângulo tem 3 lados iguais, portanto ele é um triangulo EQUILÁTERO.");
		}
			else if (retaA == retaB || retaA == retaC  || retaB == retaC) {
				System.out.println("O triângulo tem 2 lados iguais, portanto ele é um triangulo ISÓSCELES.");
		}
			else if (retaA != retaB && retaA != retaC && retaB != retaC) {
			System.out.println("O triângulo tem 3 lados diferentes, portanto ele é um triangulo ESCALENO.");
		}
			else {
			System.out.println("Não é um TRIÂNGULO");	
			}
		
			
		sc.close();

	}

}
