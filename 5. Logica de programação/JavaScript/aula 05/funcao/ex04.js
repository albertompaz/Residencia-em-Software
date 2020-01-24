let soma_um = function(num = 0) {
    return num+1
}

console.log('Retorno da função: ',soma_um(8))

//atribui uma copiad a função em 'soma_um' para 'outra'
const outra = soma_um;

console.log('Retorno da função: ', outra(100));