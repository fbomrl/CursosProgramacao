import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=3;
		String  funcionario [] = new String [n];
		String funcao [] = new String [n];
		int idade [] = new int [3];
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("==============================");
			System.out.println("Digite o nome do funcion�rio: ");
			funcionario[i] = sc.nextLine();
			System.out.println("Digite a idade do funcion�rio: ");
			idade[i] = sc.nextInt();
			System.out.println("Digite a fun��o do funcion�rio: ");
			funcao[i] = sc.next();		
			

			
		}
		
		CadastroMatriz matriz = new CadastroMatriz();
		matriz.listafuncionarios(funcionario, funcao, idade);

	}

}
