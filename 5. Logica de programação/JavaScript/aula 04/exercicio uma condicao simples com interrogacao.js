/*
Exemplo com " ?: "
Forma geral: <condição> ? <comando_A> : <comando_B>    (por espaço entre eles é opçao minha por estética)
caso "condição" igual "true" executa "comando_A"
caso "condição" igual "false" executa "comando_B"
*/

let num = 50;

(num === 50) ? num++ : num--; //true, por isso executa num++
console.log(num)