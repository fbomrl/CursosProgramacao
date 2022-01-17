import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome, email;
		int idade;

		System.out.println("Digite o nome: ");
		nome = sc.next();
		System.out.println("Digite o seu email: ");
		email = sc.next();
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();

		
		//Criando uma chamada de um método que irá processar os dados recebendo parâmetros 
		MandaMensagem executar = new MandaMensagem();
		executar.mensagem(nome, email, idade);
		
		
	}

}
