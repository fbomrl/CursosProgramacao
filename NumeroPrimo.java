package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contador=1, numero, contDiv=0;
		
		System.out.println("Escreva um número: ");
		numero =sc.nextInt();
		
		while (contador <= numero) {
			System.out.println(contador);
		contador = contador + 1;		
		}
		if (contDiv > 2) {
			System.out.println("O valor "+numero+" não é primo!");
			
		}
		else {
			System.out.println("O valor "+numero+" é primo!");
		}
		sc.close();

	}

}
