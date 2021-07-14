algoritmo "Esta apto a dirigir"
var
       atual, Nasc, idade: Inteiro

inicio

      Escreva ("Ano Atual (yyyy): ")
      Leia(atual)
      Escreva ("Ano de Nascimento (yyyy): ")
      Leia(nasc)
      idade <- atual-nasc
      Escreval ("Idade: ", idade)
      se (idade >=18) entao
           Escreval ("Está apto a tirar a carteira")
      senao
           Escreval ("Não está apto a tirar a carteira")
      fimse
fimalgoritmo