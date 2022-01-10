package curso_programacao;

import java.util.Scanner;

public class VetorCorrigindoProvas3 {
	static Scanner sc = new Scanner(System.in);
	static String gab[] = new String[5];
	static String prova[] = new String[5];
	static String nome[] = new String[3];
	static double nota[] = new double[3];

	

	public static void main(String[] args) {
		
		int a;
		double s = 0, m, nf=0;

		cadastrogabarito();
		
		for (a = 0; a < 3; a++) {
			System.out.println("===============================");
			System.out.println("ALUNO " + (a + 1) + ":");
			System.out.println("===============================");
			System.out.println("Nome: ");
			nome[a] = sc.next();
			
			nota[a] = cadastroprova(nf);
			s = s + nota[a];
		}
		
		System.out.println("NOTAS FINAIS ");
		System.out.println("-----------------------------------");
		for (a = 0; a < 3; a++) {
			System.out.println(nome [a]+" "+nota[a]);
		}
		m = s/3;
		System.out.println("-----------------------------------");
		System.out.println("Média da Turma: "+ m);
		
		
		sc.close();
	}

	static void cadastrogabarito() {
		

		System.out.println("PASSO 1 -  CADASTRO DE GABARITO");
		System.out.println("===============================");
		for (int g = 0; g < 5; g++) {
			System.out.println("Questão " + (g + 1) + " : ");
			gab[g] = sc.nextLine();

		}
		

	}

	static double cadastroprova(double nf) {
		double notaFinal = 0;
		
		
		for (int c = 0; c < 5; c++) {
			System.out.println("Questão " + (c + 1) + " : ");
			prova[c] = sc.next();
			if (prova[c].equals(gab[c])) {
				notaFinal = notaFinal + 2;
			}

		}

		
		return notaFinal;
	}
	
}
