import java.util.Scanner;

public class CadFunc {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome;
        String email;
        int idade;

        System.out.println("Entre com o nome: ");
        nome = sc.nextLine();
        System.out.println("Entre com o email: ");
        email = sc.nextLine();
        System.out.println("Entre com a idade: ");
        idade = sc.nextInt();

        //executando a chamada da classe e fazendo a passagem de parametro ao seu método

        ProcParamRecebido executar = new ProcParamRecebido();
        executar.Mensagem(nome, email, idade);

        ProcParamRecebido executarAnoNasc = new ProcParamRecebido();
        executarAnoNasc.AnoNasc(nome, idade);
    }
}
