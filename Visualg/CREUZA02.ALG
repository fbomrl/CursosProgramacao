Algoritmo "Creuza02"

Var
       contadora, q: inteiro
       reais, dolares: Real

Inicio
        contadora <-1
        Escreva ("Quantas vezes você quer converter? " )
        leia (q)
        Enquanto  (contadora <= q) faca
                  Escreva ("Quantos reais eu tenho? ")
                  Leia (reais)
                  dolares <- reais/2.22
                  Escreval ("Posso ter USD ", dolares:5:2)
                  contadora <- contadora +1
        Fimenquanto



Fimalgoritmo