package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class RepFatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contador, numero, fatorial=1;
	
		
		System.out.println("Escreva um número: ");
		numero = sc.nextInt();
		contador = numero;
		
		while (contador >= 1) {
			System.out.println(contador+" X ");
			fatorial = fatorial*contador;
			contador = contador - 1;
		}
		System.out.println("O Valor do fatorial de "+numero+" e igual a "+fatorial);

		
		sc.close();

	}

}
