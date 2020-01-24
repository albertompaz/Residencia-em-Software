var A = 'A global';
B = 'B global';  //se nao declara nada da variavel, ela ficara como var

function funcX() {
    //Declara outra variavel A que não é a mesma variavel A da linha 1
    let A = 'A local funcX';
    console.log(A); //Acessa variavel A local
    console.log(B); //Acessa variavel B global fora do escopa da função 
    return A;
}

function funcY() {
    B = 'B global modificado em funcY'; //variavel B declarada na linha 2
    return B;
}

console.log(B); //Exibe conteúdo de B global
console.log(funcX()); //Exibe conteúdo de A (local) e B (global) e retorna A (local)
console.log(funcY()); //Modifica B que é global, dentro do escopa da função
console.log(A); //Exibe conteúdo de A que é variável global