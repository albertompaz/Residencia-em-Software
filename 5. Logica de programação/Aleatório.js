var alunos = [];

var grupo1 = [];
var grupo2 = [];
var grupo3 = [];
var grupo4 = [];
var grupo5 = [];
var grupo6 = [];

carregaAlunos();

sortear(grupo1);
sortear(grupo2);
sortear(grupo3);
sortear(grupo4);
sortear(grupo5);
sortear(grupo6);

function carregaAlunos (){
    for(var i=0; i<36; i++) {
        alunos[i] = i; 
    }    
}

function sortear (grupo){
    var sorteado;
    for(var i=0; i<6; i++) {
        sorteado = Math.round(Math.random() * (alunos.length-1));
        grupo.push(alunos[sorteado]);
        alunos.splice(sorteado,1);
    }    
    
}

console.log(grupo1);
console.log(grupo2);
console.log(grupo3);
console.log(grupo4);
console.log(grupo5);
console.log(grupo6);

