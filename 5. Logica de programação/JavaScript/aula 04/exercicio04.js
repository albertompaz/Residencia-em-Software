let readline = require('readline-sync');

let temperatura = readline.question('informe a temperatura em Celsius: ')
let escala = readline.question('Informe "F" para Fahrenheit ou "k" para Kelvin ')

switch (escala) {
    case 'F':
        temperatura = (temperatura*9/5)+32;
        console.log('A sua temperatura em Fahrenheit é: ',temperatura)
        break
    case 'K':
        temperatura = (temperatura*1) + 273.15;
        console.log('A sua temperatura em kelvin é: ',temperatura)
        break
    default:
        console.log('Você não digitou uma letra correta')
}