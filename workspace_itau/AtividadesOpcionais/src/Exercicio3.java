import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sexo;
		double altura;
		double resultado;
		
		System.out.println("=========================");
		System.out.println("Digite o sexo da pessoa: ");
		System.out.println("1 - HOMEM ");
		System.out.println("2 - MULHER");
		sexo = sc.nextInt();
		switch (sexo) {
		case 1:
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();

			resultado = (72.7 * altura) - 58;
			System.out.println("O peso ideal é: " + resultado);

			break;
		case 2:
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();

			resultado = (62.1 * altura) - 44.7;
			System.out.println("O peso ideal é: " + resultado);

			break;
		default:
			System.out.println("Valor digitado inválido");
			break;
			
		}

	}

}
