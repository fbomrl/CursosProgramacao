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
			System.out.println("Trata-se de um TRI�NGULO.");
			System.out.println("-------------------------");
		}
		
		if (retaA == retaB && retaA == retaC && retaB == retaC) {
			System.out.println("O tri�ngulo tem 3 lados iguais, portanto ele � um triangulo EQUIL�TERO.");
		}
			else if (retaA == retaB || retaA == retaC  || retaB == retaC) {
				System.out.println("O tri�ngulo tem 2 lados iguais, portanto ele � um triangulo IS�SCELES.");
		}
			else if (retaA != retaB && retaA != retaC && retaB != retaC) {
			System.out.println("O tri�ngulo tem 3 lados diferentes, portanto ele � um triangulo ESCALENO.");
		}
			else {
			System.out.println("N�o � um TRI�NGULO");	
			}
		
			
		sc.close();

	}

}
