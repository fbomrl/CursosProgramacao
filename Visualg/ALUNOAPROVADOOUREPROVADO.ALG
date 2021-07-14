algoritmo "AlunoAprovadoouReprovado"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 


var
      n1, n2, media: Real
inicio
      Escreval ("----------------------")
      Escreval ("ESCOLA JAVALI CANSADO")
      Escreval ("----------------------")
      Escreva ("Primeira nota: ")
      Leia (n1)
      Escreva ("Segunda nota: ")
      Leia (n2)
      media <- (n1+n2)/2
      Escreval ("Media: ", media)
      Se (media >= 7 )  entao
         Escreval ("Aluno Aprovado")
      Senao
         Escreval ("Aluno Reprovado")
      Fimse
      
      
      
      

fimalgoritmo