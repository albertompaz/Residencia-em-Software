let readline = require('readline-sync');

let valor_total = 0;
let saida = ''; 
let preco_num = 0;

while (saida != 'N') {
    produto = readline.question('Informe o produto: ');
    preco = readline.question('Informe o preco do produto: ');

    preco_num = new Number(preco)

    valor_total = valor_total + preco_num

    saida = readline.question('\nVoce quer informar outro produto? "S" para sim ou "N" para nao: ')
}

console.log("\n\nO valor total da sua compra é de: R$"+valor_total+" Reais.")