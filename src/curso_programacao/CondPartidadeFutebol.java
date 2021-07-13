package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondPartidadeFutebol {

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
		
		
			if (dif == 0) {
			System.out.println("PARTIDA EMPATADA");
		}
				else if (dif >=1 && dif <=3) {
				System.out.println("PARTIDA NORMAL");
		}		
					else if (dif > 5) {
					System.out.println("GOLEADA");
		}			
					
						
				
		sc.close();
	}

}
