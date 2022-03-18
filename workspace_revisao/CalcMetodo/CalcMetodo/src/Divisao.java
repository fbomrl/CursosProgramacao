import java.util.Scanner;

public class Divisao {

    public void Div(double n1, double n2, double result){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();

        result = n1/n2;

        System.out.println("O resultado de "+n1+" / "+n2+" = "+result);

    }
}
