package curso_programacao;

import java.util.Scanner;

public class NSucessoreAntecessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, numeroanterior, numerosucessor;

		System.out.println("Digite um n�mero: "); // o que � pedido
		numero = sc.nextInt(); // local onde eu pe�o para o usu�rio digitar qualquer n�mero inteiro.

		numeroanterior = numero - 1; //variavel numeroanterior criado para mostrar o numero antecessor do digitado
		numerosucessor = numero + 1; //variavel numerosucessor criado para mostrar o numero sucessor do digitado
	
		System.out.println("O n�mero digitado foi "+numero+" o seu antecessor � "+numeroanterior+" e o n�mero sucessoir � "+numerosucessor );
		
		sc.close();

	}

}
