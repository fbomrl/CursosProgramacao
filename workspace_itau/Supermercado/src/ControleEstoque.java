import java.util.Scanner;

public class ControleEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String produto;
		String marca;
		int quantidade;

		System.out.printf("Produto: ");
		produto = sc.next();
		System.out.printf("Quantidade: ");
		quantidade = sc.nextInt();
		System.out.printf("Marca: ");
		marca = sc.next();

		System.out.printf("O (s) produto (s) %s tem a quantidade %d de estoque e é da marca %s", produto, quantidade, marca);
		System.out.println();
		if (quantidade < 5) {
			System.out.println("Estoque Baixo");
		} else if (quantidade == 5) {
			System.out.println("Estoque Normal");
		} else{
			System.out.println("Estoque Alto");
		}

	}

}
