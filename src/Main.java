import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo!");
		
		System.out.print ("Bom dia!");
		System.out.println ("Bom dia!");
		
		int y = 32;
		double x = 10.35784;
		System.out.println (y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); //para delimitar casas decimais, no caso, exemplo de 2 casas decimais.
		System.out.printf("%.4f%n", x);	
		Locale.setDefault(Locale.US); //Configurar localização do Programa, assim substituindo o padrão PT, do meu PC para o padrão USA
		System.out.printf("%.4f%n", x);	
		System.out.println("RESULTADO = " + x + " METROS"); //Concatenar
		System.out.printf("RESULTADO = %.2f METROS%n", x); 
		
		//%f = ponto flutuante %n = quebra de linha  %s = texto %d = inteiro
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4732.32;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
	}

}
