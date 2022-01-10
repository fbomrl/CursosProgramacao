package curso_programacao;

public class MethodSequenciaDeFibonacci {

	static int i, t1 = 0, t2 = 1, t3;

	public static void main(String[] args) {

		System.out.println(t1);
		System.out.println(t2);
		for (i = 3; i <= 10; i++) {
			t3 = proximoFibonacci(t1, t2);
			System.out.println(t3);
		}

	}

	static int proximoFibonacci(int a, int b) {
		t3 = a + b;
		a = b;
		b = t3;
		t1 = a;
		t2 = b;

		return t3;
	}
}
