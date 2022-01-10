package curso_programacao;

import java.util.Scanner;

public class VetorTorneioDeFutebol2 {

	public static void main(String[] args) {
		topo();
		Scanner sc = new Scanner(System.in);
		String time[] = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome do " + (i + 1) + "º time: ");
			time[i] = sc.nextLine();

		}
		for (int i = 0; i < 3; i++) {

			if (i == 0) {
				System.out.println(time[i] + "    [ ] x [ ] " + time[i + 1]);
				System.out.println(time[i] + "    [ ] x [ ] " + time[i + 2]);

			}

			if (i == 1) {
				System.out.println(time[i] + " [ ] x [ ] " + time[i - 1]);
				System.out.println(time[i] + " [ ] x [ ] " + time[i + 1]);
			}
			if (i == 2) {
				System.out.println(time[i] + " [ ] x [ ] " + time[i - 2]);
				System.out.println(time[i] + " [ ] x [ ] " + time[i - 1]);
			}

			
		}

		sc.close();

	}

	static void topo() {
		System.out.println("========================");
		System.out.println("   TORNEIO DE FUTEBOL   ");
		System.out.println("========================");

	}
}
