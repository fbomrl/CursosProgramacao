import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double produto;
		double valorfinal;
		double juros;
		
		System.out.println("Valor do produto adquirido: ");
		produto = sc.nextDouble();
		
		
		if(produto<=20) {
			juros = produto*0.45;	
			valorfinal = produto + juros;
			System.out.println("O valor de venda do produto será de R$ "+valorfinal);
		}
		else if(produto>20) {
			juros = produto*0.30;
			valorfinal = produto+juros;
			System.out.println("O valor de venda do produto será de R$ "+valorfinal);
		}
		
		
	}

}
