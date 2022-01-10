package curso_programacao;

import java.util.Scanner;

public class VetorOrdenar {

	//public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[10];
		int j, aux;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
		vet[i] = sc.nextInt();	
		}
		for (int i = 0; i < 9; i++) {
			for (j = 0; (i+1) > 10; j++) {
				if (vet[i] > vet[j]) {
					aux =  vet[i];
					vet[i] = vet[j];
					vet [j] = aux ;
				}
				
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("{ "+vet[i]+" }");
		}
		sc.close();
	}

}
