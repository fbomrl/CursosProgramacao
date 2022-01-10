package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Z2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, R, pi = 3.14159;
		
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		
		System.out.printf("A =%.4f%n", A);
		
		
		
		
		
		
		
		sc.close();
		
		
	
		
	}

}
