import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km;
		int l;
		int consumo;
		
		System.out.println("Digite a Quilometragem: ");
		km = sc.nextInt();
		System.out.println("Digite a quantidade de Litros: ");
		l = sc.nextInt();
		
		consumo = km/l;
		System.out.println("O consumo do carro foi de "+consumo+" km/l.");
		
		
		

	}

}
