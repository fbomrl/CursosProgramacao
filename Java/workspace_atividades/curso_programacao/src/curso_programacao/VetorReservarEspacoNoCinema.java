package curso_programacao;

import java.util.Scanner;

public class VetorReservarEspacoNoCinema {
	static String B[] = new String[19];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cad;
		String r="";
		mostrafileira();
		System.out.println("Reservar a cadeira: B");
		cad = sc.nextInt();
		if (B[cad] == "") {
			B[cad] = "X";
			System.out.println("Cadeira B"+cad+" RESERVADA!");
		}
			else {
				System.out.println("ERRO: Lugar Ocupado!");
		}
		
		
		System.out.println("Quer reservar outro? [S/N] ");
		r = sc.next();

		
		
		
		sc.close();
	}

	static void mostrafileira() {
		for (int i = 0; i < 10; i++) {
			if (B[i] == "") {
				System.out.println("[ B" + i + " ]");
			} 
			else {
				System.out.println("[ --- ]");
			}

		}
		System.out.println("------------------------------------------------------------------------");
	}

}
