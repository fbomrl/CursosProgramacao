import java.util.Scanner;

public class GerarMatriz {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] nomefuncionario = new String[7];

        for(int i=0; i <= 4; i++){
            System.out.println("Entre com o funcionário "+(i+1)+" º");
            nomefuncionario[i] = sc.nextLine();
        }
        for(int j=0; j <= 4; j++){
            System.out.println("Funcionário "+(j+1)+" - "+ nomefuncionario[j]);
        }
        System.out.println("");
    }
}
