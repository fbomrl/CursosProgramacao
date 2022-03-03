namespace A5
{
    internal class CadastroNotas
    {
        public static void Cadastrar(List<Aluno> alunos)
        {
             Console.WriteLine("Digite a quantidade de notas: ");
            int qtd = 1;
            string nQtd = Console.ReadLine();
            if(!int.TryParse(nQtd, out qtd))
            {
                Console.Clear();
                Console.WriteLine("Você digitou quantidade de notas inválido, digite somente números");
                Thread.Sleep(2000);
                CadastroNotas.Cadastrar(alunos);
                return;
            }
            for(int i=0;i<qtd;i++)
            {
                Console.Clear();
                var nota = new Aluno();
                Console.WriteLine("Digite a nota do aluno: ");
                nota.Nomes = Console.ReadLine();
             
              
                
                alunos.Add(nota);
                
                Console.WriteLine("Nota cadastrada com sucesso !!!");
                Thread.Sleep(2000);
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