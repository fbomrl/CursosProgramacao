import java.util.Scanner;

public class CalculoMetodo {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;
        double n1 = 0, n2 = 0, result = 0;

       do{
           System.out.println("-----------------");
           System.out.println("-----CALCULO-----");
           System.out.println("-----------------");
           System.out.println("1 - ADIÇÃO");
           System.out.println("2 - SUBTRAÇÃO");
           System.out.println("3 - MULTIPLICAÇÃO");
           System.out.println("4 - DIVISÃO");
           System.out.println("5 - SAIR");
           opcao = sc.nextInt();

           switch (opcao){

               case 1:
                   Adicao soma = new Adicao();
                   soma.Adicao(n1, n2, result);



                   break;
               case 2:
                   Subtracao menos = new Subtracao();
                   menos.Subtr(n1, n2, result);

                   break;
               case 3:
                   Multiplicacao vezes = new Multiplicacao();
                   vezes.Multipl(n1,n2,result);

                   break;
               case 4:
                  Divisao divide = new Divisao();
                  divide.Div(n1,n2,result);

                   break;
               case 5:
                   System.out.println("Encerrando...");
                   break;

           }
       }
       while (opcao < 5 || opcao == 0 || opcao > 5);


    }

}
