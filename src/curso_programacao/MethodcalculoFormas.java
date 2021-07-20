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
		
		tri = triangulo(A,B,C);
		System.out.println("TRIANGULO: "+tri);
		circ = circulo(A,B,C);
		System.out.println("CIRCULO: "+circ);
		trap = trapezio(A,B,C);
		System.out.println("TRAPÉZIO: "+trap);
		quad = quadrado(A,B,C);
		System.out.println("QUADRADO: "+quad);
		retan = retangulo(A,B,C);
		System.out.println("RETANGULO: "+retan);
		

		sc.close();
	}
	public static Double triangulo(Double A, Double B, Double C) {
	
	return A*C/2.0;	
	}
	public static Double circulo(Double A, Double B, Double C) {
		
	return 3.14159 * C * C;
	}
	public static Double trapezio(Double A, Double B, Double C) {
		
	return (A + B) / 2.0 * C;
	}
	public static Double quadrado(Double A, Double B, Double C) {
		
	return B*B;
	}
	public static Double retangulo(Double A, Double B, Double C) {
		
	return A*B;
	}
}
