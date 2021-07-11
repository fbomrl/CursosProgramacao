package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class SuperContador {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int opcao, contador=1,contador2=10;
	
		System.out.println("===================");
		System.out.println("|       MENU      |");
		System.out.println("===================");
		System.out.println("| [1]  De 1 a 10  |");
		System.out.println("| [2]  De 10 a 1  |");
		System.out.println("| [3]  Sair       |");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		opcao =sc.nextInt();
		
		
		switch (opcao) {
		case 1:
			while(contador<=10) {
				System.out.println(+contador+"..");
				contador +=1;
			}
			break;
		case 2:
			while(contador2>=1) {
				System.out.println(+contador2+"..");
				contador2-=1;
			}
			break;
		case 3:
			System.out.println("SAINDO..");
			break;
		}
		
		sc.close();

	}

}
