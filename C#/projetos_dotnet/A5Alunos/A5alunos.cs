namespace A5Alunos
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
                Console.WriteLine("0 - SAIR");
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
                            
                    Console.WriteLine("================================");
                    Console.WriteLine("============CADASTRO============");
                    Console.WriteLine("QUANTOS ALUNOS DESEJA CADASTRAR?");
                    Console.WriteLine("================================");
                            int qntd Convert.ToInt32(Console.ReadLine());
                            
                            
                            for(int i=0; i <= qntd; i++)
                            { var aluno = Aluno();
                                Console.WriteLine("INFORME O NOME DO ALUNO: ");
                                nomeAluno.Add(Console.ReadLine());
                                Console.WriteLine("INFORME O NÚMERO DA MATRÍCULA: ")
                                matricula.Add(Console.ReadLine());
                                for(int inota=0; inota <= qntdNota; inota++)
                                {
                                Console.WriteLine("INFORME AS NOTAS DO ALUNO: ")
                                notas.Add(Console.ReadLine());        
                                }
                            }



                            break;;
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
