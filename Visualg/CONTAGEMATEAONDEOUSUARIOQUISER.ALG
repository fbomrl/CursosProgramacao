algoritmo "ContagemAteaondeoUsuarioQuiser"
var
       valor, salto, contador: Inteiro
inicio
       contador <- 0
       Escreva ("Quer contar até quanto? ")
       Leia (valor)
       Escreva ("Qual será o valor do salto? ")
       leia (salto)
       
       Enquanto (contador <= valor) faca
                Escreval(contador)
                contador <- contador + salto
       Fimenquanto
       Escreval ("Terminei de contar!")
       
fimalgoritmo