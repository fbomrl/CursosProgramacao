Algoritmo "SequenciaDeFibonacci"

Var

    C, T1,T2,T3: inteiro
procedimento proximoFibonacci(var A,B: inteiro)
var C: inteiro
Inicio
     C:= A + B
     Escreva (C)
     A := B
     B := C

Fimprocedimento

Inicio
      T1 <- 0
      Escreva (T1)
      T2 <- 1
      Escreva (T2)
      para C:= 3 ate 10 faca
           proximoFibonacci(T1,T2)
      fimpara


Fimalgoritmo