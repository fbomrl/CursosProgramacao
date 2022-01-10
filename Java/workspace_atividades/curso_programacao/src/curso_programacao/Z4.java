package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Z4 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, hora;
		double valorhora, salario;
		
		numero = sc.nextInt();
		hora = sc.nextInt();
		valorhora = sc.nextDouble();
		salario = valorhora * hora;
		
		System.out.println("NUMBER = "+ numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		
		
		
		sc.close();

	}

}
