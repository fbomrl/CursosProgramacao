import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double resultado;
		int opcao;

		do {
			System.out.println("==========================");
			System.out.println("DIGITE A OP��O DESEJADA: ");
			System.out.println("1 - ADI��O ");
			System.out.println("2 - SUBTRA��O");
			System.out.println("3 - DIVIS�O");
			System.out.println("4 - MULTIPLICA��O");
			System.out.println("5 - SAIR");
			System.out.println("==========================");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1: 
				System.out.println("Digite o primeiro valor: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				num2 = sc.nextDouble();
			 resultado = num1 + num2;
			 	System.out.println("A soma do valor "+num1+" e do valor "+num2+" �: "+resultado);
			 	System.out.println("==========================");
			 break;	
			case 2:
				System.out.println("Digite o primeiro valor: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				num2 = sc.nextDouble();
				resultado = num1 - num2;
			 	System.out.println("A subtra��o do valor "+num1+" e do valor "+num2+" �: "+resultado);
			 	System.out.println("==========================");
				break;
			case 3:
				System.out.println("Digite o primeiro valor: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				num2 = sc.nextDouble();
				resultado = num1 / num2;
				System.out.println("A divis�o do valor "+num1+" e do valor "+num2+" �: "+resultado);
			 	System.out.println("==========================");
				break;
			case 4:
				System.out.println("Digite o primeiro valor: ");
				num1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				num2 = sc.nextDouble();				
				resultado = num1 * num2;	
				System.out.println("A multiplica��o do valor "+num1+" e do valor "+num2+" �: "+resultado);
			 	System.out.println("==========================");
				break;
			}
			
		} while (opcao == 1 | opcao == 2 | opcao == 3 | opcao == 4);

		System.out.println("==========================");
		System.out.println("Muito obrigado por utilizar a nossa aplica��o");
		System.out.println("==========================");
		}
	
	}


