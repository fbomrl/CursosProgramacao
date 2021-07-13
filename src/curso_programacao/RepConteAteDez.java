package curso_programacao;

import java.util.Locale;
import java.util.Scanner;


public class RepConteAteDez {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
				
		int contador=0;
		
		while (contador <= 10) {
			System.out.println(contador);
			contador += 1;
			
		}
		
			System.out.println("Terminei a conta");
			
		
		
		sc.close();
		

	}

}
