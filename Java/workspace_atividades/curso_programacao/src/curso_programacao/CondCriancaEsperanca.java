package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondCriancaEsperanca {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);

						
			
			int opcao, valor;
			
			
			
			System.out.println("-----------------------");
			System.out.println("   Criança Esperança   ");
			System.out.println("-----------------------");
			System.out.println(" [1] Para doar R$ 10 ");
			System.out.println(" [2] Para doar R$ 25 ");
			System.out.println(" [3] Para doar R$ 50 ");
			System.out.println(" [4] Para doar outros valores ");
			System.out.println(" [5] Cancelar ");
			
			Scanner sc = new Scanner(System.in);
			opcao = sc.nextInt();

			System.out.println(opcao);
					
						
			switch (opcao) {
				case 1:
					valor = 10;
				 break;	
				case 2:	
					valor = 25;
				 break;
				case 3:	
					valor = 50;
				 break;
				case 4:	
					System.out.println("Qual o valor da doação? R$ ");
					valor = sc.nextInt();
				 break;
				case 5:	
					valor = 0;
				 break;
				default:
					valor = 0;
				 break;	
			}	
			
			System.out.println("-----------------------");
			System.out.println( "SUA DOAÇÃO FOI DE R$" + valor);
			System.out.println("-----------------------");
			
			sc.close();
	
		}
	}	
		
			
			
			
			
			
	
	
	
	

