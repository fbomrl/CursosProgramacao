package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstaAptoaDirigir2 {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int atual, nasc, idade;
		
		System.out.printf("Ano atual (yyyy): ");
		atual = sc.nextInt();
		System.out.printf("Ano de Nascimento (yyyy): ");
		nasc = sc.nextInt();
		idade = atual - nasc;
		System.out.printf("Idade: ");
		System.out.println(idade);
		
		if  (idade >18) {
			System.out.println("Est� apto a tirar a carteira");
		}
			
		else {
			System.out.println( "N�o est� apto a tirar a carteira");
		}
		
		
		
		
		sc.close();
		
		
		

	}

}
