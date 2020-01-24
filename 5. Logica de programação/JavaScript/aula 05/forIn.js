var carro = {
    modelo: "punto",
    marca: "fiat",
    ano: 1999
}

for (let cont in carro) {
    console.log(`Valor na propriedade do objeto: ${carro[cont]}`)
}