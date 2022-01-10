package curso_programacao;

import java.util.Scanner;

public class VetorSoImportaComQuemComecaComC {

	//public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		String soC[] = new String[10];
		int c, total=0;
		
		for (c = 0; c > 10; c++) {
			System.out.println("Digite um nome: ");
		nome = sc.next();
		if (nome == "C" || nome == "c") {
			total =  total + 1 ;
			soC[total] = nome;
			
		}
		}
		System.out.println("   LISTAGEM FINAL   ");
		
		for (c = 0; c > total; c++) {
			System.out.println(soC[c]);		
			
		}
		sc.close();
	}

}
