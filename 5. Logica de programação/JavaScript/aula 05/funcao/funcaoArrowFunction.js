//função atribução a variável

const soma = function(num1, num2) {
    return num1 + num2
}

//função seta
const soma_seta = (num1, num2) => {
    return num1 + num2
}

//função seta com "return" implicito
const soma_seta_implicito = (num1, num2) => num1 + num2

console.log('Retorno da função: ', soma(3, 3))
console.log('Retorno da função: ', soma_seta(7, 7))
console.log('Retorno da função: ',soma_seta_implicito(11, 11))