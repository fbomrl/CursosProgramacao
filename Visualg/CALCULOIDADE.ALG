Algoritmo "CalculoIdade"



Var

       ano, nasc, idade: Real


Inicio

      Escreva ("Em que ano estamos? ")
      Leia (ano)
      Escreva ("Em que ano voc� nasceu? ")
      Leia (nasc)
      
      idade <- ano - nasc
      
                Escreva ("Em ",ano, " voc� ter� ", idade," anos,")
      Se (idade >= 18) entao
                Escreval (" e j� ter� atingido a maioridade.")
      Senao
                Escreval (" n�o atingiu a maioridade.")
      FimSe




Fimalgoritmo