package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class AproveitamentodeUmAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Double n1, n2, media;
		
		System.out.println("Primeira Nota: ");
		n1 = sc.nextDouble();
		System.out.println("Segunda Nota: ");
		n2 = sc.nextDouble();
		
		media = (n1+n2)/2;
		
		System.out.println("MEDIA: " + media);
		
		if (media < 5) {
			System.out.println("Aproveitamento: F");
		}
			else if (media >=5 && media <=6) {
				System.out.println("Aproveitamento E");
			}	
				else if (media >=6 && media <=7) {
					System.out.println("Aproveitamento D");
				}
					else if (media >=7 && media <=8) {
						System.out.println("Aproveitamento C");
					}
						else if (media >=8 && media <=9) {
							System.out.println("Aproveitamento B");
						}
							else if (media >=9 && media <=10) {
								System.out.println("Aproveitamento A");
							}
										
			
			
		
		sc.close();
	}

}
