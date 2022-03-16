import java.util.Scanner;

public class ExemploCaso {

    public static void main (String[] args){
        int funcoes;
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("OPÇÕES");
        System.out.println("1 - ADICÃO");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        System.out.println("5 - ");
        funcoes = sc.nextInt();

        switch (funcoes){
            case 1:
                System.out.println("ADICÃO");
                break;
            case 2:
                System.out.println("SUBTRAÇÃO");
                break;
            case 3:
                System.out.println("DIVISÃO");
                break;
            case 4:
                System.out.println("MULTIPLICAÇÃO");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA - SAIR ");
        }
    }
}
