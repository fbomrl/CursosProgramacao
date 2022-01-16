import java.util.Scanner;

public class Atividade_11_MatrizComSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int id = 2;
		int opcao;
		String produto[] = new String[id];
		int quantidade[] = new int[id];
		double valor[] = new double[id];

		opcao = tela(sc);

		switch (opcao) {
		case 1:
			
			System.out.println("==========================");
			System.out.println("  -CADASTRO DE PRODUTOS-  ");
			System.out.println("==========================");
			for (int i = 0; i < 2; i++) {
				System.out.println("Digite o nome do produto: ");
				produto[i] = sc.next();
				System.out.println("Digite a quantidade: ");
				quantidade[i] = sc.nextInt();
				System.out.println("Digite o valor: ");
				valor[i] = sc.nextDouble();		
			}
			System.out.println("==========================");
			tela(sc);
						
		case 2:
			System.out.println("==========================");
			System.out.println("   -PRODUTOS CADASTRADOS- ");
			System.out.println("==========================");
			for (int i = 0; i < 2; i++) {
				System.out.println("-- PRODUTO: "+produto[1]+" -- QUANTIDADE: "+quantidade[i]+" -- VALOR R$"+valor[i]);
			}
			System.out.println("==========================");
			tela(sc);
		}
		
	}
	public static int tela(Scanner sc){
		

		System.out.println("DIGITE A OPÇÃO DESEJADA: ");
		System.out.println("1 - CADASTRO DE PRODUTOS. ");
		System.out.println("2 - VERIFICAÇÃO DE PRODUTOS.");
		System.out.println("==========================");
		return sc.nextInt();
		
		
		
	}
	
}

