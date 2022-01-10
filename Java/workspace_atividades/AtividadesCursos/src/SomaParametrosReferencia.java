package curso_programacao;

public class SomaParametrosReferencia {

	
	static void soma( int A, int B) {
		A = A + 1;
		B = B + 2;
		System.out.println("Valor de A = "+ A);
		System.out.println("Valor de B = "+ B);
		System.out.println("Soma de A + B = "+ (B+A));

	}
	
	
	
	public static void main(String[] args) {
		int X = 4;
		int Y = 8;
		soma(X,Y);
		System.out.println("Valor de X = "+X);
		System.out.println("Valor de Y = "+Y);
	
	

	}

}
