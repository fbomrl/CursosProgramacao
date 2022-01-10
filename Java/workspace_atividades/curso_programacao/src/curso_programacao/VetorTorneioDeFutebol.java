package curso_programacao;

import java.util.Scanner;

public class VetorTorneioDeFutebol {

	public static void main(String[] args) {
		topo();
		Scanner sc = new Scanner(System.in);
		String time[] = new String[3];
		int i=0, c;

		for (c = 0; c < 3; c++) {
		System.out.println("Nome do "+(c+1)+" time: ");
		time[c] = sc.nextLine();
		}
		
		System.out.println("========================");
		System.out.println("   TABELA DE PARTIDAS   ");
		System.out.println("========================");
		for (i = 0; i < 3; i++) {
			for (c = 0; c < 3; c++) {
				if (i != c) {
					System.out.println(time[i]+"   [ ] x [ ]   "+time[c]);
					
				}
				
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
