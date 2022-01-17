import java.util.Scanner;

public class ControleNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double nota1, nota2, media=0;
		
		System.out.println("Nome do Aluno: " );
		nome = sc.next();
		System.out.println("Nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = sc.nextDouble();
		
		ProcessaMedia procmedia = new ProcessaMedia();
		procmedia.media(nome, nota1, nota2, media);
		

	}

}
