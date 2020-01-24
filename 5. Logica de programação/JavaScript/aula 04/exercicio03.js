let readline = require('readline-sync');

let texto = readline.question('Digite um numero: ');
let num = new Number(texto);

if (num > 0) {
    console.log("O número informado é maior que zero")
} else if (num < 0) {
    console.log("O número informado é menor que zero")
} else {
    console.log("O numero informado é igual a zero")
}
