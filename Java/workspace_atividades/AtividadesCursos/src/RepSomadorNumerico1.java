package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class RepSomadorNumerico1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int contador =1, soma=0, n, maior=0;
		
		while (contador <=10) {
		System.out.println("Digite o "+contador+"º do valor: ");
		n = sc.nextInt();
		if (n > maior) {
			maior = n;
		}
			soma = soma + n;
		contador +=1;
		}
		System.out.println("O valor total dos valores digitados é de: "+soma);
		System.out.println("O maior valor digitado foi o "+maior);
		
		sc.close();

	}

}
