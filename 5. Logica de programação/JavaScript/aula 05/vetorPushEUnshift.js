let notas = new Array (7.8, 6.3, 8.7) 
let alunos = ["Fulano", "Beltrano", "Ciclano"];

notas[notas.length] = 10.0; //adicionando valor na ultima posição do vetor
alunos.push('José'); //adicionando valores nas primeiras posições do vetor
notas.unshift(1.9,9.7); // adicionando valores nas primeiras posições do vetor
alunos.unshift("João","Maria") //adicionando valores nas primeiras posições do vetor

notas[0] = 3.3; //modifica o valor da posição '0' para 3

for (let i=0; i<alunos.length; i++) {
    console.log(`Nome: ${alunos[i]} Nota: ${notas[i]}`)
}