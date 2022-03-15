import java.text.DecimalFormat;

import java.text.NumberFormat;
import java.util.Scanner;


public class FormatoValor {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double dval;
        System.out.println("Digite o valor da variável: ");
        dval = sc.nextDouble();
        System.out.println("Valor da variável sem formatar: "+dval);
        String format="0.00";
        NumberFormat formatter = new DecimalFormat(format);

        String newDval = formatter.format(dval);

        System.out.println("Novo valor formatado: "+newDval);

    }
}
