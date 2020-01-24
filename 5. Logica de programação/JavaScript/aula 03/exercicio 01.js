let a = 10;
let b = 20;
let resultado;

console.log('a=10 e b=20', resultado);

resultado = a + b;
console.log('O valor de (a+b) é: ', resultado);

resultado = a - b;
console.log('O valor de (a-b) é: ', resultado);

resultado = a*b;
console.log('O valor de (a*b) é: ', resultado);

resultado = a/b;
console.log('O valor de (a/b) é: ', resultado);

resultado = b%a;
console.log('O valor de (a%b) é: ', resultado);

resultado += b;
console.log('O valor de (+=b) é: ', resultado);

resultado = a++;
console.log('O valor de (a++) é: ', resultado); // o resultado recebe valor 10 primeiro e depois o a recebe a+a virando 11

resultado = ++b;
console.log('O valor de (++b) é: ', resultado); //o b recebe B+1 primeiro de depois o resultado recebe 21 ( que é o b mais 1)