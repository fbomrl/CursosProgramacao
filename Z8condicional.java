package curso_programacao;

import java.util.Scanner;

public class Z8condicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("PAR");
		}
		
		else  {
			System.out.println("IMPAR");
		}
		
		
		
		
		
		
		sc.close();

	}

}
