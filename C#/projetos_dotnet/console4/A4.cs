namespace console4
{
    class fazenda
    {
        static void Main(string[] args)
        {
            List<Vaca> vacas = new List<Vaca>();
            while (true)
            {
                Console.WriteLine("----------------------");
                Console.WriteLine("FAZENDA VOCÊ BEM FORTE");
                Console.WriteLine("0 - SAIR");
                Console.WriteLine("1 - CADASTRAR VACAS");
                Console.WriteLine("2 - MOSTRAR A QUANTIDADE DE VACAS E LITROS DE LEITE");
                Console.WriteLine("3 - RELATÓRIO DE VACAS");
                int opcao = -1;
                try
                {
                    opcao = Convert.ToInt32(Console.ReadLine());


                    switch (opcao)
                    {
                        case 0:
                            return;
                        case 1:
                            VacaServico.cadastrar();

                            break;
                        case 2:
                            Console.WriteLine("");
                            break;
                        case 3:
                            Console.WriteLine("");
                            break;
                        default:
                            Console.Clear();
                            Console.WriteLine("Opção Inválida");
                            Thread.Sleep(2000);
                            break;
                    }
                }
                catch
                {
                    Console.Clear();
                    Console.WriteLine("Opção Inválida - Digite apenas números");
                    Thread.Sleep(1000);
                }
            }


        }
        public static void Mostrar(List<Vaca> vacas)
        {
            Console.Clear();
            foreach (var vaca in vacas)
            {

                Console.WriteLine("Nome: " + vaca.Nome);
                Console.WriteLine("Quantidade total de leite: " + vaca.qntdLitros);
                Console.WriteLine("Quantidade atual de leite: " + vaca.qntdLitrosAtual);
                Console.WriteLine("Capacidade: " + (vaca.qntdLitros / vaca.qntdLitrosAtual * 100) + "%");
                Console.WriteLine("=================================");
            }
            Thread.Sleep(5000);
        }


    }
}

