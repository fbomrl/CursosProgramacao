package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondAlunoAprovadoouReprovado2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("-----------------------");
		System.out.println( "ESCOLA JAVALI CANSADO");
		System.out.println("-----------------------");
		System.out.println("Primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("Segunda nota: ");
		n2 = sc.nextDouble();
		media = (n1+n2)/2;
		System.out.println("Media: ");	
		System.out.println(media);
		if (media >= 7) {
			System.out.println("Aluno Aprovado");
		}
		else if (media >=5 && media <=7){
			System.out.println("Aluno em Recuperação");
		}	
		else {
			System.out.println( "Aluno Reprovado");
		}		
			
		sc.close();
	}
}