import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int idade;	
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		if(idade<16) {
			System.out.println("Não pode votar.");
		} else if (idade>16 && idade<18 || idade >65) {
			System.out.println("Pode votar facultativamente.");
			
		}else {
			System.out.println("Voto obrigatório! ");
		}
		

	}

}
