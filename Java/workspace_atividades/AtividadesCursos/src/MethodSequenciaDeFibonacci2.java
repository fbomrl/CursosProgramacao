package curso_programacao;



public class MethodSequenciaDeFibonacci2 {

	static int contador = 0;
	static int natual = 1;
	static int nanterior = 0;
	int nint;

	static void proximoFibonacci(int a, int b) {
		int c;
		c = (a + b);
		System.out.println(c);
		nanterior = b;
		natual = c;

	}

	public static void main(String[] args) {

		System.out.println(nanterior);
		System.out.println(natual);

		for (contador = 3; contador <= 10; contador++) {
			proximoFibonacci(nanterior, natual);

		}

	}

}
