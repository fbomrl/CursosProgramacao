import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

    public static void main(String[]args) throws IOException {

        String[] nomes = {"Fabio","Felipe","Maria", "Antonia"};

        FileWriter arquivo = new FileWriter("C:\\Users\\fabio\\Documents\\funcionarios.txt");
        PrintWriter gravarArquivo = new PrintWriter(arquivo);

        gravarArquivo.println("Registros dos Funcionários");
        gravarArquivo.println("==========================");
        for(int i=0;i < 4; i++){

            gravarArquivo.print(nomes[i]+ " - ");

        }
        arquivo.close();
        System.out.println("O Arquivo está sendo gravado na unidade C:\\Users\\fabio\\Documents\\funcionarios.txt");
    }
}
