package curso_programacao;

import java.util.Scanner;

public class NSucessoreAntecessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, numeroanterior, numerosucessor;

		System.out.println("Digite um número: "); // o que é pedido
		numero = sc.nextInt(); // local onde eu peço para o usuário digitar qualquer número inteiro.

		numeroanterior = numero - 1; //variavel numeroanterior criado para mostrar o numero antecessor do digitado
		numerosucessor = numero + 1; //variavel numerosucessor criado para mostrar o numero sucessor do digitado
	
		System.out.println("O número digitado foi "+numero+" o seu antecessor é "+numeroanterior+" e o número sucessoir é "+numerosucessor );
		
		sc.close();

	}

}
