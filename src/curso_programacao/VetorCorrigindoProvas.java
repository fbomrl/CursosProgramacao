package curso_programacao;

import java.util.Scanner;

public class VetorCorrigindoProvas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("PASSO 1 -  CADASTRO DE GABARITO");
		//System.out.println("===============================");
		String gabarito[] = new String [5];
		String nome[] = new String [3];
			
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Questão "+(i+1)+":");
			gabarito[i] = sc.next();
		}
		for (int i = 0; i<=3;i++) {
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("RESPOSTAS DADAS");
			
		}
		
		
		sc.close();
	}

}
