algoritmo "Media"
var
   n1: real
   n2: real
   media: real
inicio
      escreva("Informe a primeira nota: ")
      leia(n1)
      escreva("Informe a segunda nota: ")
      leia(n2)

      media <- (n1+n2)/2
      
      se (media >= 6) entao
      escreva("A media do aluno é: ",media," e ele esta aprovado")
      fimse
      se (media<4) entao
      escreva("A media do aluno é: ",media," e ele esta reprovado")
      fimse
      se (media >=4) e (media <6) entao
      escreva("A media do aluno é: ",media," e ele tera que fazer a prova final")
      fimse
      
fimalgoritmo