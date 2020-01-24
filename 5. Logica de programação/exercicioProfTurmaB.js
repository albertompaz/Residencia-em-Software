const MEDIA = 5;

//objetos alunos
var aluno1 = {
    nome: "Alan",
    nota: 3
};
var aluno2 = {
    nome: "Pedro",
    nota: 5
};
var aluno3 = {
    nome: "João",
    nota: 10,
};
var aluno4 = {
    nome: "Conrado",
    nota: 9.5
}
var aluno5 = {
    nome:"Ramon",
    nota: 9
}

//array de alunos
var alunos = [aluno1, aluno2, aluno3, aluno4, aluno5];

var alunoMaiorNota;
var alunoMenorNota;
var alunoNotaAcimaCinco;
var total =  0;
var maiorQueCinco= [];

//fazer for do array
for (i=0; i<alunos.length; i++) {
    total = total + alunos[i].nota;

    if(alunos[i].nota > MEDIA) {
        maiorQueCinco.push() = alunos[i].nome;
    }

    if (alunoMaiorNota == undefined) {
        alunoMaiorNota == alunos[i];
    } else if (alunos[i].nota > alunoMaiorNota.nota) {
        alunoMaiorNota = aluno[i]
    }

    if (alunoMenorNota == undefined) {
        alunoMenorNota = alunos[i];
    } else if (alunos[i.nota < alunoMenorNota.nota]) {
        alunoMenorNota = alunos[i];
    }
}

//ordenando o array alunos por nota
var alunosDecrescente = alunos.sort(compare);

// outputs
console.log
