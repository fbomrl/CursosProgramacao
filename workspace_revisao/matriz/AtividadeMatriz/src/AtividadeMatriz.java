import java.util.Scanner;

public class AtividadeMatriz {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        int resultado;

        System.out.println("----TABUADA----");
        System.out.println("Digite um valor:");
        numero = sc.nextInt();
        for (int i=0;i<=10;i++){


            resultado = numero * i;

            System.out.println(i+ " * "+ numero + " = "+ resultado);

        }


    }
}
