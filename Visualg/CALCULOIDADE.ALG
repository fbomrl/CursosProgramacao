Algoritmo "CalculoIdade"



Var

       ano, nasc, idade: Real


Inicio

      Escreva ("Em que ano estamos? ")
      Leia (ano)
      Escreva ("Em que ano você nasceu? ")
      Leia (nasc)
      
      idade <- ano - nasc
      
                Escreva ("Em ",ano, " você terá ", idade," anos,")
      Se (idade >= 18) entao
                Escreval (" e já terá atingido a maioridade.")
      Senao
                Escreval (" não atingiu a maioridade.")
      FimSe




Fimalgoritmo