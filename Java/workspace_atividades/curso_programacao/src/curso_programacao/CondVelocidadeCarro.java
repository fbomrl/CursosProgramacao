package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CondVelocidadeCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int velocidade, multa=5,total=0, km=0;
		System.out.println("Qual a velocidade do carro? ");
		velocidade = sc.nextInt();		
		System.out.println("A velocidade do carro � de "+velocidade+" KM/H");
		
		
		
		
		
		if (velocidade > 80) {
			System.out.println("O motorista FOI MULTADO.");
			km= (velocidade)-80;
			total = (km*multa);
			
		}
		else if (velocidade <=80) {
			System.out.println("O motorista n�o foi multado");
		}
		System.out.println("A velocidade m�xima da via � de 80 KM/H ");
		System.out.println("O valor da multa � de R$ "+multa+" por KM/H acima da velocidade permitida.");
		System.out.println("O valor total da multa � de R$ "+total+".");
		
		
		
		sc.close();

	}

}
