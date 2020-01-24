/*
exemplo de notas de alunos
supondo que cada aluno fez 3 provas, cada linha um aluno cada coluna uma nota
com 2 alunos, a matriz precisa ter as dimensões de 2x3 (2 alunos 3 notas cada aluno)
2 linhas (uma para cada aluno) e 3 notas (uma para cada nota)
*/
let matriz_notas = []; // cria vetor vazio

matriz_notas[0] = []; // cria vetor vazio nesta posição (zero)

matriz_notas[1] = []; // cria vetor vazio nesta posição (um)

//adicionando elementos usando dois indices

matriz_notas[0][0] = 0.5;
matriz_notas[0][1] = 0.6;
matriz_notas[0][2] = 0.7;
console.log(`Só a linha zero preenchida: ${matriz_notas}`)
console.table(matriz_notas); // formato de tabela
matriz_notas[1][0] = 1.5;
matriz_notas[1][1] = 1.6;
matriz_notas[1][2] = 1.7;
console.log(`Só a linha zero e um preenchidas: ${matriz_notas}`)
console.table(matriz_notas); // formato de tabela