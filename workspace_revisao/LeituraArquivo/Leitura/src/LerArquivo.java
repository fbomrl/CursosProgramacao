import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LerArquivo {

    public static void main (String[] args){
        String mostra = "";
        String nomeArq = "C:\\Users\\fabio\\Documents\\funcionarios.txt";
        String linha="";
        File arq = new File(nomeArq);

        //Analise para verificar se o arquivo existe
        if(arq.exists()){
            mostra = "Arquivo - '"+arq+"', aberto com sucesso! ";
            mostra = "Tamanho do arquivo - "+Long.toString(arq.length())+" Bytes \n";
//            System.out.println(mostra);

          //Processo de tentativa de leitura das informações contidas no arquivo
            try {
                FileReader reader = new FileReader(nomeArq);
                //Ler todo o arquivo e armazenar no buffer de memória

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
            JOptionPane.showMessageDialog(null, mostra, "Arquivo...",1);
        }
        else {
//            System.out.println("Arquivo Inexistente");
            JOptionPane.showMessageDialog(null, "Arquivo Inexistente", "Erro", 0);
        }
    }
}
