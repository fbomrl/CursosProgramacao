import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horainicial;
		int horafinal;
		int duracao = 0;
		int dif;

		System.out.println("Digite a hora inicial do jogo (entre 0 e 23): ");
		horainicial = sc.nextInt();
		System.out.println("Digite a hora de encerramento do jogo (entre 0 e 23): ");
		horafinal = sc.nextInt();

		if (horainicial >= 24 || horafinal >= 24) {
			System.out.println("Horário digitado inválido.");
		} else if (horainicial < horafinal) {
			duracao = horafinal - horainicial;
			System.out.println("O tempo de duração do jogo foi de: " + duracao + " horas");
		} else if (horainicial > horafinal) {
			dif = horainicial - 24;
			duracao = (dif - horafinal) * -1;
			System.out.println("O tempo de duração do jogo foi de: " + duracao + " horas");
		}

	}

}
