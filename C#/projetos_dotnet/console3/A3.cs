using System;
using System.Collections.Generic;

namespace A3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Digite o nome do(a) cliente: ");
            string nomecliente = Console.ReadLine();
            Console.WriteLine($"Digite o nome do produto do {nomecliente}: ");
            string nomeproduto = Console.ReadLine();

            /*List<dynamic> produtos = List<dynamic>();
            for (int i = 0; i <= qntd; i++)
            {}*/
                Console.WriteLine("Digite o valor do produto: ");
                double valor = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Digite a quantidade de produtos: ");
                int quantidade = Convert.ToInt32(Console.ReadLine());

            double valortotal = valor * quantidade;
            /*foreach produto in produtos {
                valortotal += totalproduto;
            }*/

            Console.WriteLine("O cliente " + nomecliente);
            Console.WriteLine("Produto: " + nomeproduto + ". Valor unitário R$ "+valor+". Quantidade comprada: " + quantidade + ". Valor de R$ " + valortotal);
            Console.WriteLine("O desconto com pagamento a vista é de R$: "+(valortotal-(valortotal*10/100)));


        }
    }
}