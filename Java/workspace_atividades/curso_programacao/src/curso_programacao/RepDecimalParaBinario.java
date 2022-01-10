package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class RepDecimalParaBinario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, valor;
		
		String r="";
		
		System.out.println("Digite um valor decimal: ");
		n = sc.nextInt();
		valor = n;
		while (n > 0 ) {
			switch (n % 2) {
			case 0:
				r = ("0" + r);
			break;	
			case 1:
				r = ("1" +  r);	
			break;
			}
			n = (n/2);				
		}
		
		
		System.out.println("O valor "+valor+" em DECIMAL é de "+r+" em número BINÁRIO!");
		
		
		
		
		sc.close();
		
		
		

	}

}
