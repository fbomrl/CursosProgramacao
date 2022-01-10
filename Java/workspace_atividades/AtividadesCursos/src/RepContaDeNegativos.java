package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class RepContaDeNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, c=1, totaln=0;
		
		while (c<=5) {
			System.out.println("Digite um número: ");
			n = sc.nextInt();
		if (n<0) {
			totaln = totaln +1;
		}
		c = c + 1;
		}
		System.out.println("Foram digitados "+totaln+" valores negativos.");
		sc.close();

	}

}
