let readline = require('readline-sync');

let nome = readline.question('Informe seu nome: ')
let idade = readline.question('Informe sua idade: ')
let nota = readline.question('Informe sua nota: ')

console.log('O aluno ' + nome + ' de idade ' + idade + ' tirou '+nota)

//template string
console.log(`\nO aluno ${nome} com idade ${idade} tirou ${nota}`) //OBS: tem que se utilizar craze!!
