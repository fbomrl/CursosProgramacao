package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class RepContadorInteligente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int inicio, fim;

		System.out.println("INICIO: ");
		inicio = sc.nextInt();
		System.out.println("FIM: ");
		fim = sc.nextInt();
		
		if (inicio < fim) {
			
			while (inicio <= fim) {
				System.out.printf(inicio + "..");

				inicio += 1;
			}
		}
		else {
			

			while (inicio >= fim) {
				System.out.printf(inicio + "..");
				


				inicio -= 1;
			}
		}
			sc.close();
		
		
		}
	}

