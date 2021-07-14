algoritmo "DecimalParaBinario"
var

   n, valor: Inteiro
   r1: Caractere

inicio

   Escreva ("Digite um valor decimal: ")
   Leia (n)
   Valor <- n
   Enquanto  (n > 0) faca
      Escolha (n mod 2)
      caso 0
         r1 <- ("0" + R1)
      caso 1
         r1 <- ("1" + R1)
      Fimescolha
      n <-(n div 2)
   Fimenquanto
   Escreval ("O valor ",valor, " em DECIMAL é de ", r1, " em número BINÁRIO!")



fimalgoritmo