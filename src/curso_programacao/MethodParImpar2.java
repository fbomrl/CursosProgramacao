package curso_programacao;

import java.util.Scanner;

public class MethodParImpar2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		String R="";
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		parimpar(numero);
		R = parimpar(numero);
		System.out.println("O número "+numero+" é um valor "+R);
	
		sc.close();
	}
	
	
	static String parimpar(int valor) {
		String PAR = "", IMPAR = "";
		
		if (valor % 2 == 0) {
		return PAR;
		}
	
	 else {
		return IMPAR;
		}

	}



}
