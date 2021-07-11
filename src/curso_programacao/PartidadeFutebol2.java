package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class PartidadeFutebol2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int bangu, madureira, dif;
		
		
		System.out.println("Quantos gols do BANGU?");
		bangu = sc.nextInt();
		System.out.println("Quantos gols do MADUREIRA? ");
		madureira = sc.nextInt();
		
		if (madureira > bangu) {
			dif = madureira - bangu;
		}
			else  {
				dif = bangu - madureira;	
		}	
					
		System.out.println("DIFERENÇA: "+dif);
					
		
		switch (dif) {
		case 0:
			System.out.println("PARTIDA EMPATADA");
			break;
		case 1:	case 2: case 3:
			System.out.println("PARTIDA NORMAL");
			break;
		default:
			System.out.println("GOLEADA");
		}
		
			
		
		sc.close();
	}

}
