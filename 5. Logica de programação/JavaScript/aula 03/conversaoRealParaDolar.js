let readline = require('readline-sync');  // precisa dessa linha pra funcionar a entrada de dados do usuario

let real = readline.question("Informe quantos reais voce tem: ");
let dolar = readline.question("Informe a cotacao do dolar atual: ");
let conversao = real/dolar;

console.log("A quantidade de Dolares que você possui é: ",conversao.toFixed(2)); //toFixed -> retornará só duas casas decimais após a virgul