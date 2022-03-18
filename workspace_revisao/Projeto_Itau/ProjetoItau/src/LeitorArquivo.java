import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeitorArquivo {

public void LeitorArq() {
    String mostra = "";
    String nomeArq = "C:\\Users\\fabio\\Documents\\CursosProgramacao\\workspace_revisao\\Projeto_Itau\\ClientesDados.txt";
    String linha="";
    File arq = new File(nomeArq);

    if(arq.exists()) {
        mostra = "Arquivo - '" + arq + "', aberto com sucesso! ";
        mostra = "Tamanho do arquivo - " + Long.toString(arq.length()) + " Bytes \n";

        try {
            FileReader reader = new FileReader(nomeArq);

            BufferedReader leitor = new BufferedReader(reader);
            while (true){
                linha = leitor.readLine();
                System.out.println(linha);
                if(linha==null)
                    break;
                mostra+=linha+"\n";
            }
        }
        catch (Exception erro) {}
        System.out.println("Conteúdo Existente");

    }
    else {
        System.out.println("Arquivo Inexistente");

    }
}
}
