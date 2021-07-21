Algoritmo "ValoresPares"

Var
   val: vetor [1..7]     de inteiro
   i, totpar: inteiro



Inicio
   totpar <- 0
   para i <- 1 ate 7 faca
      escreva ("Digite o ",i, "º valor: ")
      leia (val[i])
   fimpara

   Para i <- 1 ate 7 faca
      se (val[i] % 2 = 0 ) entao
         totpar <- totpar + 1
      Escreval ("Valor PAR na posição ", i)
         fimse
   fimpara
   escreval("O Total de pares foi ", totpar)

Fimalgoritmo