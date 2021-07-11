package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class DependenesFuncionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		String nome; 
		int  dep;
		double sal, nsal;
		
		
		System.out.println("Qual o nome do funcionário? ");
		nome = sc.next();
		System.out.println("Qual o salário do funcionário? R$ ");
		sal = sc.nextDouble();
		System.out.println("Qual a quantidade de dependentes? ");
		dep = sc.nextInt();
		
		switch (dep) {
		case 0:
			nsal = sal + (sal*5/100);
			break;
		case 1: case 2: case 3:
			nsal = sal + (sal*10/100);
			break;
		case 4: case 5: case 6:
			nsal = sal + (sal*15/100);
			break;
		default:
			nsal = sal + (sal*18/100);
			break;
		
		}	
		System.out.printf("O novo salário de "+ nome +" será de R$ " + nsal); 
	
		
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
