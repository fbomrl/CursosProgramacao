package curso_programacao;


import java.util.Locale;
import java.util.Scanner;

public class CondAnalisadorDeValoresFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
					

		int contador, valor = 0, divisao = 0, nulo = 0, somaPares = 0;
		double media= 0, soma = 0;
		
		
		for (contador = 1; contador <= 5; contador++) {
			System.out.println("Digite o " + contador + "� valor: ");
			valor = sc.nextInt();
			
			soma = soma+valor;                      //resolvido.
			media = soma/contador;                  //resolvido.
			if (valor%5==0) {                        //resolvido
				divisao = divisao +1;
			}
			if (valor <=0) {
			nulo = valor +1;                       //resolvido
			}
			
			if (valor% 2 == 0) {                  //resolvido
				somaPares = somaPares + valor;
			}
			
			
		}			
		System.out.println("A soma entre os valores � " + soma);
		System.out.println("A m�dia entre os valores � " +media);
		System.out.println("Valores divisiveis por cinco � " + divisao);
		System.out.println("Valores Nulos � " + nulo);
		System.out.println("A soma dos valores pares � " + somaPares);

		sc.close();

	}

}
