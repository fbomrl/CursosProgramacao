import javax.swing.*;
import java.util.Scanner;

public class ApresentaNome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        String sobrenome;

        System.out.println("Primeiro nome: ");
        nome = sc.nextLine();
        System.out.println("Sobrenome: ");
        sobrenome = sc.nextLine();
        System.out.println("Nome completo: "+nome + " " + sobrenome);




    }
}

