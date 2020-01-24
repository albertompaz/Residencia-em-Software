let readline = require('readline-sync');  // precisa dessa linha pra funcionar a entrada de dados do usuario

const pi = Math.PI;
let raio = readline.question("Informe o raio do cone: ");
let altura = readline.question("Informe a altura do cone: ");

let volume = pi*raio*raio*altura/3;

console.log("\n O volume do seu cone de raio:",raio," e altura:",altura," é igual a :",volume);
