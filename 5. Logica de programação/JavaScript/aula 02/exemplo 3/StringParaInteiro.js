let res;
let numero ="33"; //variavel string
let num_float = "7.89"; //variavel string
let bool_var = "true"; //variavel string
let cpf="13242555";

res = parseInt(numero) * 2; // transformando a string "numero" para inteiro e multiplicando por 2
console.log("Resultado: ", res);
console.log("Tipo da variavel: ",typeof res);

res = parseFloat(num_float); // convertendo a variavel para float
console.log("Resultado: ",res);
console.log("Tipo da variavel: ",typeof res);

//Verificando se é true ou false e guardando o resultado
res = (bool_var == "true");
console.log("Resultado: ",res);
console.log("Tipo da variavel: ",typeof res);

res = parseInt(bool_var);
console.log("Resultado: ",res);
console.log("Tipo da variavel: ",typeof res);

res = parseInt(cpf) //nos casos em que voce digita o cpf, valor, preço, em um campo e ele precisa salvar essa string como numero no banco de dados
console.log("Resultado: ",res);
console.log("Tipo da variavel: ",typeof res);