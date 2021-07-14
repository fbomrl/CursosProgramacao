algoritmo "SomadorNumerico"
var
      contador, n, soma, maior: inteiro
inicio
      contador <- 1
      soma <- 0
      Enquanto (contador <=5) faca
               Escreva ("Digite o ",contador,"º. valor: ")
               Leia (n)
               Se (n > maior) entao
                  maior <- n
               FimSe
               soma <- soma + n
               contador <- contador + 1
      FimEnquanto
      Escreval ("A soma de todos os valores foi de ", soma)
      Escreval ("O maior valor digitado foi: ", maior)
fimalgoritmo