package curso_programacao;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EstaAptoaDirigir {

	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String atualRecebido, nascRecebido ;
		int idade;
		LocalDateTime atual, nasc;
		
		System.out.printf("Digite a data de hoje (dd/MM/yyyy): ");
		atualRecebido = sc.nextLine(); 
		
		String[] test = atualRecebido.split("/");
		
		atual =  LocalDateTime.parse(atualRecebido);

		System.out.printf("Digite sua data de Nascimento (dd/MM/yyyy): ");
		nascRecebido = sc.nextLine();
		nasc =  LocalDateTime.parse(nascRecebido);
		idade = atualRecebido. - nascRecebido;
		System.out.printf("Idade: ");
		System.out.println(idade);
		
		if  (idade >=18) {
			System.out.println("Está apto a tirar a carteira");
		}
			
		else {
			System.out.println( "Não está apto a tirar a carteira");
		}
		
		
		
		
		sc.close();
		
		
		

	}

}
