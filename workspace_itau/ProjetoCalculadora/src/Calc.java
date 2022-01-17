import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1, n2;
		double resultado = 0;
		int opcao;
		do {
			System.out.println("==========================");
			System.out.println("DIGITE A OPÇÃO DESEJADA: ");
			System.out.println("1 - ADIÇÃO ");
			System.out.println("2 - SUBTRAÇÃO");
			System.out.println("3 - DIVISÃO");
			System.out.println("4 - MULTIPLICAÇÃO");
			System.out.println("5 - SAIR");
			System.out.println("==========================");
			opcao = sc.nextInt();
			if(opcao == 5) {
				Finalizacao fim = new Finalizacao();
				fim.fimdofim();
				break;
			}
			
			System.out.println("Digite o primeiro valor: ");
			n1 = sc.nextDouble();
			System.out.println("Digite o segundo valor: ");
			n2 = sc.nextDouble();

			switch (opcao) {
			case 1:
				Resultadoadicao adicao = new Resultadoadicao();
				adicao.procadicao(n1, n2, resultado);

				break;
			case 2:
				ResultadoSubtracao subtracao = new ResultadoSubtracao();
				subtracao.procsubtracao(n1, n2, resultado);

				break;
			case 3:
				ResultadoDivisao divisao = new ResultadoDivisao();
				divisao.procdivisao(n1, n2, resultado);
				break;
			case 4:
				ResultadoMultiplicacao multiplicacao = new ResultadoMultiplicacao();
				multiplicacao.procmultiplicacao(n1, n2, resultado);
				break;
			case 5:
				Finalizacao fim = new Finalizacao();
				fim.fimdofim();
				
			}

		} while (opcao == 1 | opcao == 2 | opcao == 3 | opcao == 4);

	

	}

}
