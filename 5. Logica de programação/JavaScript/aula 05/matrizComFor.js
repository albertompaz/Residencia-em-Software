let matriz = [];
let lin = 3;
let col = 4;
let cont=0;
for (let i=0; i<lin; i++) {
    matriz[i]=[]
    for(let j=0; j<col; j++) {
        matriz[i][j] = cont++;
    }
}

console.log(matriz)
console.table(matriz)