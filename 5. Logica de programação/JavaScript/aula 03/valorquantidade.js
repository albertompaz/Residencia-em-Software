let readline = require('readline-sync'); // precisa dessa linha pra funcionar a entrada de dados do usuario

let preco = readline.question("Informe o preco do produto: ");
let quantidade = readline.question("Informe a quantidade do produto: ");
let total = preco*quantidade;

console.log("O valor total da compra é: ", total);