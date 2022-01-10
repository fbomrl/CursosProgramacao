package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondCalculoIMC {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double M, A, IMC;
		
		System.out.println("Massa (KG): ");
		M = sc.nextDouble();
		System.out.println("Altura (M): ");
		A = sc.nextDouble();
		IMC = M/(A*A);
		System.out.printf("IMC: %.2f%n ", IMC);
		if (IMC <17){
			System.out.println("Muito abaixo do Peso");
		}
			else if (IMC >=17 && IMC <= 18.5){ 
			System.out.println("Abaixo do Peso");
		}		
				else if (IMC >=18.5 && IMC <= 25){ 
					System.out.println("Peso Ideal");
		}	
					else if (IMC >=25 && IMC <= 30){ 
						System.out.println("Sobrepeso");
		}	
						else if (IMC >=30 && IMC <= 35){ 
							System.out.println("Obesidade");
		}	
							else if (IMC >=35 && IMC <= 40){ 
								System.out.println("Obesidade Severa");
		}	
								else {
									System.out.println ("Obsidade Mórbida");
						}
		
		sc.close ();
		}		
		

	
	
}
