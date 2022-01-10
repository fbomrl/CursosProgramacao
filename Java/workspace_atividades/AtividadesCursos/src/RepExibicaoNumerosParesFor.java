package curso_programacao;

import java.util.Scanner;

public class RepExibicaoNumerosParesFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador, numero;
		
		System.out.println("Digite um valor: ");
		numero = sc.nextInt();
				
		for (contador = numero; contador >= 0; contador--) {
			if ((contador % -2)==0)
			System.out.println(contador);	
			
			}
		
		sc.close();

	}

}
