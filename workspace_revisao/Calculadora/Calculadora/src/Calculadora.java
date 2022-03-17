import java.util.Scanner;

public class Calculadora {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;
        double n1, n2, result;


        do{
            System.out.println("--------------------");
            System.out.println("---OPÇõES DO MENU---");
            System.out.println("--------------------");
            System.out.println("1 - ADIÇÃO");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    result = n1 + n2;
                    System.out.println("O Resultado de "+n1+" + "+n2+" = "+result);
                    break;

                case 2:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    result = n1 - n2;
                    System.out.println("O Resultado de "+n1+" - "+n2+" = "+result);
                    break;

                case 3:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    result = n1 * n2;
                    System.out.println("O Resultado de "+n1+" * "+n2+" = "+result);
                    break;

                case 4:
                    System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextDouble();
                    System.out.println("Digite o segundo número: ");
                    n2 = sc.nextDouble();
                    result = n1 / n2;
                    System.out.println("O Resultado de "+n1+" / "+n2+" = "+result);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;
            }



        }
        while (opcao < 5 || opcao == 0 || opcao > 5);




    }
}
