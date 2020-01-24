let readline = require('readline-sync');

console.log('Informe 5 números \n');
let soma = 0;
for (let i=1; i<6; i++){
    resp = readline.question('\nDigite o '+ i +' numero: ');
    console.log('Voce digitou: ', resp);
    let num = new Number(resp);
    soma = (soma + num);
}
console.log('\nA soma dos numeros é: ',soma);