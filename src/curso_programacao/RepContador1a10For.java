package curso_programacao;

import java.util.Scanner;

public class RepContador1a10For {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		int contador;
		
		for (contador = 1; contador <= 10; contador ++) {
			if ((contador % 2) == 0) //testando como contar fazendo múltiplos
			System.out.println(contador); 
		}
		
		
		
		
		sc.close();
	}

}
