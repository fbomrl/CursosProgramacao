Algoritmo "ProcedimentoDetectordePesado"

Var
   I: Inteiro
   nome, pesado: caractere
   peso, maior: real


Procedimento Topo()
Inicio

   Limpatela
   Escreval("---------------------------------")
   Escreval("      DETECTOR DE PESADO         ")
   Escreval("Maior peso até agora: ",maior,": ")
   Escreval("---------------------------------")
FimProcedimento

inicio

   Topo()
   para I <- 1 ate 5 faca
      Escreva("Digite o nome: ")
      leia(nome)
      Escreva("Digite o pesado de ",nome,": ")
      leia(peso)
      Se (peso > maior) entao
         maior <- peso
         pesado <- nome
      Fimse
      Topo()
   fimpara
   Topo()
   Escreval("A pessoa mais pesada foi ", pesado, ", com ", maior, " Kg.")


Fimalgoritmo