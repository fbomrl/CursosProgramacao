import java.util.ArrayList;
import java.util.Scanner;

public class PjtItau {

    public static void main (String[] args){

        int agencia=0;
        int conta=0;
        String nome="";
        String email="";
        String telefone="";
        double saldo=0;

        Scanner sc = new Scanner(System.in);

        ArrayList<Clientes> cliente = new ArrayList();
        Clientes cliente1 = new Clientes( agencia, conta, nome, email, telefone, saldo);

        System.out.println("Nome do cliente: ");
        
        System.out.println("Agencia: ");

        System.out.println("Conta: ");
        System.out.println("Email: ");
        System.out.println("Telefone: ");
        System.out.println("Saldo: ");








    }
}
