package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ContarAteondeoUsuarioQuer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor, salto, contador=0;
		
		System.out.println("Quer contar até quanto? ");
		valor = sc.nextInt();
		System.out.println("Quer pular quantos números? ");
		salto = sc.nextInt();
		while (contador <= valor) {
			System.out.println(contador);
		contador += salto;	
		
		}
			System.out.println("Terminei de contar!");
		
		sc.close();

	}

}
