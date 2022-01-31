using System;
using System.Collections.Generic;

namespace A1
{
    class Program
    {static void Main(string[] args)
        {
            
          //  Console.WriteLine("Digite o seu nome: ");
           // string nome = Console.ReadLine();
           // Console.WriteLine("O nome digitado é: " + nome);

            Console.WriteLine("João quantos clientes vc precisa cadastrar ?");
            int qtd = Convert.ToInt32(Console.ReadLine());

            List<dynamic> clientes = new List<dynamic>();

            for(int i=1;i<=qtd;i++)
            {
                Console.WriteLine("Digite o seu nome: ");
                string nome = Console.ReadLine();
                Console.WriteLine("Digite o seu cpf: ");
                string cpf = Console.ReadLine();

                clientes.Add(new {
                    Nome = nome,
                    CPF = cpf
                });
            }

            //IMPRESSÃO DA LISTA 
            Console.Clear();
            Console.WriteLine("-------------------------------");
            Console.WriteLine("A LISTA DE CLIENTES DE JOÃO É: ");
            Console.WriteLine("-------------------------------");

            foreach(var cliente in clientes){
                Console.WriteLine("NOME: " + cliente.Nome);
                Console.WriteLine("CPF: "+ cliente.CPF );
                Console.WriteLine("-------------------------------");
            }
        }
    }
}