import java.util.Scanner;

public class EntradaTeclado {
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do funcion�rio: ");
		nome = sc.next();
		System.out.println("Entre com a sua idade: ");
		idade = sc.nextInt();
		System.out.println();
		System.out.println("O nome do funcion�rio � "+nome+" e sua idade � de "+idade+" anos.");
		
		
		
		
		
	}

}
