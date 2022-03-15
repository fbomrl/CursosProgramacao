import java.util.Scanner;

public class Atividade {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor=0;
        double quantidade=0;


        System.out.println("Nome do produto: ");
        nome = sc.nextLine();
        valor = sc.nextDouble();
        System.out.println("Valor do produto: ");
        System.out.println("Quantidade do produto: ");
        quantidade = sc.nextDouble();

        double valortotal = valor*quantidade;

        System.out.println("O Valor total do produto "+nome+" é de R$ "+valortotal);
    }
}
