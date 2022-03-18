import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GravarArquivo {

    public void Gravacao() throws IOException {

//        String[] nomes = {"Fabio","Felipe","Maria", "Antonia"};

        ArrayList<Cliente> clientes = new ArrayList<>();



        FileWriter arquivo = new FileWriter("C:\\Users\\fabio\\Documents\\CursosProgramacao\\workspace_revisao\\Projeto_Itau\\ClientesDados.txt");
        PrintWriter gravarArquivo = new PrintWriter(arquivo);

        gravarArquivo.println("===========================");
        gravarArquivo.println("----CADASTRO DE CLIENTE----");
        gravarArquivo.println("===========================");



        for(Cliente c : clientes){
            gravarArquivo.print("Ag: " + c.getAgencia() + " - Conta: " + c.getConta() + " - Nome: " + c.getNome() + " - Email: "
                    + c.getEmail() + " - Telefone" + " - Saldo R$ " + c.getSaldo() + " . ");
        }

        gravarArquivo.print(clientes);
        arquivo.close();
        System.out.println("\"C:\\\\Users\\\\fabio\\\\Documents\\\\CursosProgramacao\\\\workspace_revisao\\\\Projeto_Itau\\\\ClientesDados.txt\"");
    }
}
