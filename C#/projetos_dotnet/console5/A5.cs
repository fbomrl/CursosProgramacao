namespace A5
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Quantidade de alunos: ");


            List<Aluno> alunos = new List<Aluno>();
            while (true)
            {
                Console.WriteLine("================");
                Console.WriteLine("===MATEMÁTICA===");
                Console.WriteLine("================");
                Console.WriteLine("0 - Sair");
                Console.WriteLine("1 - CADASTRAR ALUNOS");
                Console.WriteLine("2 - CADASTRAR NOTAS");
                int opcao = -1;
                try
                {
                    opcao = Convert.ToInt32(Console.ReadLine());
                    switch (opcao)
                    {
                        case 0:
                            return;
                        case 1:
                            CadastroAlunos.Cadastrar();
                            CadastroNotas.Cadastrar();
                            break;
                        case 2:

                            break;
                        default:
                            Console.Clear();
                            Console.WriteLine("Opção inválida");
                            Thread.Sleep(3000);
                            break;
                    }
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Opção inválida, digite somente os números do menu");
                    Thread.Sleep(3000);
                }


            }

        }


    }
}
