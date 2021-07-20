package curso_programacao;



public class RepSequenciaDeFibonacciFor2 {
	static int contador = 0, natual = 1, nanterior = 1, nint = 1;
	public static void main(String[] args) {


		
			natual = sequenciaFinobacci(natual,nanterior);
			System.out.println(natual);
		}
		static int sequenciaFinobacci(int a, int b) {
			
			for (contador = 1; contador <= 15; contador++) {

				if (contador <= 1) {
					natual = 0;
				} else if (contador >= 2) {
					nanterior = nint;
					nint = natual;
					natual = natual + nanterior;

				}
			
			natual = a;
			nanterior = b;		
			
		
			
			
		}
			return natual;



	}

}
