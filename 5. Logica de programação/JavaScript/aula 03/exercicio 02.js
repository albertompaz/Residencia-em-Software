let num = 1;
console.log("Tipo da variável: ", typeof num);

let dateobj = new Date();
console.log("Tipo da variável: ", typeof dateobj);

let pessoa = {nome:"Fulano"}
console.log("Tipo da variavel: ", typeof pessoa)

let t = Number("texto") // texto para número
console.log(t);

console.log("texto" == true);
console.log(num == true);
console.log(num == false);
console.log(t == "texto");
console.log(pessoa == pessoa);
console.log(pessoa === dateobj);
