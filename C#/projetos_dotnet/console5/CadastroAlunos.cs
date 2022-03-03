namespace A5
{
    internal class CadastroAlunos
    {
        public static void Cadastrar(List<Aluno> alunos)
        {
             Console.WriteLine("Digite a quantidade de alunos");
            int qtd = 1;
            string sQtd = Console.ReadLine();
            if(!int.TryParse(sQtd, out qtd))
            {
                Console.Clear();
                Console.WriteLine("Você digitou quantidade de alunos inválido, digite somente números");
                Thread.Sleep(2000);
                CadastroAlunos.Cadastrar(alunos);
                return;
            }
            for(int i=0;i<qtd;i++)
            {
                Console.Clear();
                var aluno = new Aluno();
                Console.WriteLine("Digite o nome do aluno: ");
                aluno.Nomes = Console.ReadLine();
             
              
                
                alunos.Add(aluno);
                
                Console.WriteLine("Aluno cadastrado com sucesso !!!");
                Thread.Sleep(2000);
            }

            public static void Mostrar(List<Aluno> vacas)
        {
            Console.Clear();
            
            if(vacas.Count == 0)
            {
                Console.WriteLine("Não há alunos cadastrados, primeiro cadastre a sua vaca");
                Thread.Sleep(2000);

                CadastroAlunos.Cadastrar(alunos);
            }

            Console.Clear();

            foreach(var aluno in alunos)
            {
                Console.WriteLine("Nome: " + aluno.Nome);
                Console.WriteLine("Quantidade total de leite: " + vaca.QuantidadeDeLitrosTotal);
                Console.WriteLine("Quantidade atual de leite: " + vaca.QuantidadeDeLitrosAtual);
                Console.WriteLine("Capacidade: " + (vaca.QuantidadeDeLitrosAtual /vaca.QuantidadeDeLitrosTotal*100) + "%");
                Console.WriteLine("-----------------------------");
            }
        
            Thread.Sleep(5000);
        }
        }

        internal static void Cadastrar()
        {
            throw new NotImplementedException();
        }

        public override bool Equals(object obj)
        {
            return base.Equals(obj);
        }

        public override int GetHashCode()
        {
            return base.GetHashCode();
        }

        public override string ToString()
        {
            return base.ToString();
        }
    }
}