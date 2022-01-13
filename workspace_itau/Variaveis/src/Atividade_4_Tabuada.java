import java.util.Scanner;

public class Atividade_4_Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Digite um número: ");
		num = sc.nextInt();

		System.out.println("Tabuada do número " + num);
		System.out.println("------------------");
		for (int contador = 0; contador < 10; contador++) {

			System.out.println(+num + " X " + (contador + 1) + " = " + num * (contador + 1));
		}

	}

}
