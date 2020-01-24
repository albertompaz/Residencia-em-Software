let res;
let num = 10;
let boleano = true;

console.log("\nboolean para number");
res = boleano - 0; // -0 para nao alterar o valor
console.log("Resultado: ",res);
console.log("Tipo da variavel: ", typeof res);

console.log("\nnumber para boolean");
res = !!num;
console.log("Resultado: ",res);
console.log("Tipo da variavel: ", typeof res);

console.log("\nnumber para string");
res = num + "";
console.log("Resultado: ",res);
console.log("Tipo da variavel: ", typeof res);
console.log("tamanho da variavel: ", res.length)