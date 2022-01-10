package curso_programacao;

import java.util.Scanner;

public class MethodSomaFuncao {
	
	static int soma(int x, int y) {
		return x+y;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1, v2,s;
		
		System.out.println("Digite o primeiro valor: ");
		v1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		v2 = sc.nextInt();
		s = soma(v1,v2);
		System.out.println("A soma entre "+v1+" e "+v2+" é igual a "+s);
		
		
		
		
		sc.close();

	}

}
