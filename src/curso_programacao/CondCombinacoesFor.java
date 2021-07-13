package curso_programacao;

import java.util.Scanner;

public class CondCombinacoesFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador1, contador2, contador3;
		
		for (contador1 = 1; contador1 <= 3; contador1 ++) {
			for (contador2 = 1; contador2 <= 3; contador2 ++)
				for (contador3 = 1; contador3 <= 3; contador3 ++)
			System.out.println(contador1+"  "+contador2+"  "+contador3);
		}
				
		sc.close();

	}

}
