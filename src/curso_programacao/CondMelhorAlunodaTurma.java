package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondMelhorAlunodaTurma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("ESCOLA SANTA PACIÊNCIA");
		System.out.println("----------------------");
		
		int qntd_aluno,contador=1;
		double nota,maior=0;
		String maiorNome="", nome="";
		
		
		System.out.println("Quantos alunos a turma tem? ");
		qntd_aluno = sc.nextInt();
				
		while (contador<=qntd_aluno){
			System.out.println("ALUNO "+contador);
			System.out.println("Nome do Aluno: ");
			nome = sc.next();
			System.out.println("Nota de "+nome+":");
			nota = sc.nextDouble();
			System.out.println("----------------------");
			contador +=1;
			
			if (nota > maior) {
				maior = nota;	
				maiorNome = nome;
			}
			
			
			
			
		}
		System.out.printf("O melhor aproveitamento foi de "+maiorNome+" com a nota de "+maior);
			
		
		sc.close();

	}

}
