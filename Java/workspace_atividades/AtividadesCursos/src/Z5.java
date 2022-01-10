package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Z5 {

	public static void main(String[] args) {
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
			
				int cod1, cod2, qnt1, qnt2;
				double valor1, valor2, total;
				
				cod1 = sc.nextInt();
				qnt1 = sc.nextInt();
				valor1 = sc.nextDouble();
				
				cod2 = sc.nextInt();
				qnt2 = sc.nextInt();
				valor2 = sc.nextDouble();
				
				total = valor1 * qnt1 + valor2 * qnt2;
					
				System.out.printf("VALOR TOTAL R$ %.2f%n", total);
				
				
				
				
				
				sc.close();
				
				

	}

}
