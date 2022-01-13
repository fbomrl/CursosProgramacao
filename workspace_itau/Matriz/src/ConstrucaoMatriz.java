
public class ConstrucaoMatriz {

	public static void main(String[] args) {

		String[] frutas = { "Pera", "Laranja", "Morango", "Limão", "Goiaba" };
		
//		System.out.println(frutas[0]+", "+frutas[1]+", "+frutas[2]+", "+frutas[3]+", "+frutas[4]+".");
//		System.out.println(frutas[0]);
//		System.out.println(frutas[1]);
//		System.out.println(frutas[2]);
//		System.out.println(frutas[3]);
//		System.out.println(frutas[4]);

		for (int contador = 0; contador <= 4; contador++) {
			System.out.println((contador+1)+" - "+frutas[contador]);
		}
	}

}
