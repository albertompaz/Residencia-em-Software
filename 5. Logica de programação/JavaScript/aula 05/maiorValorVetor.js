let readline = require('readline-sync'); 
var numeros = new Array();
var maior_valor = -999999;

for (var i=0; i<5; i++) {
    let valor = readline.question("informe um numero: ");
    
    numeros.push(valor);

    valor = Number(valor)

    if (valor > maior_valor) {
        maior_valor = valor
    }
}

console.log(`Os valores digitados foram: ${numeros}`)
console.log(`O maior valor digitado foi: ${maior_valor}`)



