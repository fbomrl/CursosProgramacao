import java.util.Scanner;

public class ProcessaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Entre com  a idade do aluno: ");
		idade = sc.nextInt();
		
		
		if (idade >= 18) {
			System.out.println("Aluno � maior de idade");
				}
		else {
			System.out.println("Aluno � menor de idade");
		}
		
		
	}

}
