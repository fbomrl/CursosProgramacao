package curso_programacao;

import java.util.Scanner;

public class VetorTorneioDeFutebol {

	public static void main(String[] args) {
		topo();
		Scanner sc = new Scanner(System.in);
		String time[] = new String[3];
		String A= "", B = "", C="";

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do " + (i + 1) + "º time: ");
			time[i] = sc.next();
			A = time[i];
			B = time[i];
			C = time[i];
		
		}
		for (int i = 0; i < 3; i++) {
			
			
			
			System.out.println(time[i] + "[ ] x [ ]" + time[i]);
	}
			
		sc.close();

	}

	static void topo() {
		System.out.println("========================");
		System.out.println("   TORNEIO DE FUTEBOL   ");
		System.out.println("========================");

	}
}
