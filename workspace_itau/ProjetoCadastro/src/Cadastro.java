import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id = 5;
		String produto[] = new String[id] ;
		String marca[] = new String[id] ;;
		int quantidade[] = new int[id];

		for (int contador = 0; contador < 2; contador++) {
			System.out.println("==========================");
			System.out.println("  -CADASTRO DE PRODUTOS-  ");
			System.out.println("==========================");
			System.out.println("Digite o "+(contador+1)+"º produto: ");
			produto[contador] = sc.next();
			System.out.println("Digite a "+(contador+1)+"º marca: ");
			marca[contador] = sc.next();
			System.out.println("Digite a quantidade: ");
			quantidade[contador] = sc.nextInt();
			
			
		}
		System.out.println("   LISTAGEM DE PRODUTOS   ");
		System.out.println("==========================");
		
		for (int contador = 0; contador < 2; contador++) {
			System.out.println("-- Produtos: "+produto[contador]+" - Marca: "+marca[contador]+ " - Quantidade: "+quantidade[contador]);
		}
	
	}

}
