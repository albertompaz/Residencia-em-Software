let notas = new Array (1.1, 7.8, 6.3, 8.7, 5.1, 7.7, 9.93);
let alunos = ["João", "Beltrano",  "Ciclano", "José", "Maria", "Fernando"];

console.log(alunos);
console.log(notas);
console.log(`Tamanho do vetor Notas: ${notas.length}`);
console.log(`Tamanho do vetor Alunos: ${alunos.length}`);

ultima_nota = notas.pop(); //9.93
ultimo_aluno = alunos.pop(); //fernando
console.log(`O ultimo aluno: ${ultimo_aluno} | Ultima Nota: ${ultima_nota}`);

primeira_nota = notas.shift(); //1.1
primeiro_aluno = alunos.shift();//Joao
console.log(`O primeiro aluno: ${primeiro_aluno} | Primeira Nota: ${primeira_nota}`);

console.log(`Tamanho do vetor Notas: ${notas.length}`);
console.log(`Tamanho do vetor Alunos: ${alunos.length}`);

//Remove apenas 1 elemento na posição 2
nota_removida = notas.splice(2,1); //8.7
aluno_removido = alunos.splice(2,1); //Ciclano
console.log(`Nota removida ${nota_removida}`)
console.log(`Aluno removido ${aluno_removido}`)

console.log(alunos);
console.log(notas);