import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PjtItau {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int opcao;

        ArrayList<Cliente> listaCliente = new ArrayList();

        do {
            System.out.println("===================");
            System.out.println("CADASTRO DE CLIENTE");
            System.out.println("===================");
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - CONSULTAR CLIENTES");
            System.out.println("3 - GRAVAR DADOS");
            System.out.println("4 - SAIR");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
//                for (int i = 0; i < 1; i++) {
                    Cliente cliente = new Cliente();
                    System.out.println("===================");
                    System.out.println("CADASTRO DE CLIENTE");
                    System.out.println("===================");
                    System.out.println("Agencia: ");
                    cliente.setAgencia(sc.nextInt());
                    System.out.println("Conta: ");
                    cliente.setConta(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Nome do cliente: ");
                    cliente.setNome(sc.nextLine());
                    System.out.println("Email: ");
                    cliente.setEmail(sc.nextLine());
                    System.out.println("Telefone: ");
                    cliente.setTelefone(sc.nextLine());
                    System.out.println("Saldo: ");
                    cliente.setSaldo(sc.nextDouble());

                    listaCliente.add(cliente);

                    break;
//                }
                case 2:
                    for (Cliente c : listaCliente) {

                        System.out.println("Ag: " + c.getAgencia() + " - Conta: " + c.getConta() + " - Nome: " + c.getNome() + " - Email: "
                                + c.getEmail() + " - Telefone" + " - Saldo R$ " + c.getSaldo() + " . ");
                        System.out.println();
                    }
                    break;
                case 3:
                    FileWriter arquivo = new FileWriter("C:\\Users\\fabio\\Documents\\CursosProgramacao\\workspace_revisao\\Projeto_Itau\\ClientesDados.txt");
                    PrintWriter gravarArquivo = new PrintWriter(arquivo);

                    gravarArquivo.println("===========================");
                    gravarArquivo.println("----CADASTRO DE CLIENTE----");
                    gravarArquivo.println("===========================");

                    for (Cliente c : listaCliente) {

                        gravarArquivo.printf("Ag: " + c.getAgencia() + " - Conta: " + c.getConta() + " - Nome: " + c.getNome() + " - Email: "
                                + c.getEmail() + " - Telefone: " + c.getTelefone() + " - Saldo R$ " + c.getSaldo() + " .%n");

                    }


                    arquivo.close();
                    System.out.println("\"C:\\\\Users\\\\fabio\\\\Documents\\\\CursosProgramacao\\\\workspace_revisao\\\\Projeto_Itau\\\\ClientesDados.txt\"");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;

            }
        }
        while (opcao < 4);

    }
}
