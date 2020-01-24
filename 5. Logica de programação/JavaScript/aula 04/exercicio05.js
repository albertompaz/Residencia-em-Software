let readline = require('readline-sync');

let temperatura = readline.question('Informe a sua temperatura corporal: ')

if (temperatura >= 38) {
    console.log("Você está com febre.")
} else {
    console.log("Temperatura corporal normal.")
}