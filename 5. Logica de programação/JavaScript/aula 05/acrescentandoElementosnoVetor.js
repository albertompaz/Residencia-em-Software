let notas = new Array (7.8, 6.3, 8.7) //cria e inicializa vetor com notas
let alunos = ["Fulano", "Beltrano", "Ciclano"]; // cria e inicializa vetor nomes

for (let i=0; i<alunos.length; i++) {
    console.log(`Nome: ${alunos[i]} Nota: ${notas[i]}`);
}

let soma = 0;
let i= 0;
while (i < notas.length) {
    soma += notas[i]
    i++
}
let media = soma/notas.length

console.log(`A media das notas é ${media.toFixed(2)}`) //toFixed(2) -> 2 casas decimais após a virgula