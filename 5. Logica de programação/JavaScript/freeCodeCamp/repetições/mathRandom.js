/* 
function randomFraction() {

    // Only change code below this line.
    var result = 0
  
    while (result === 0) {
      result = Math.random();
    }
    return result;
    // Only change code above this line.
  }

  console.log(randomFraction())
  */

console.log(Math.floor(Math.random() * 10)) // criara um numero aleatorio entre 0 e 9
console.log(Math.floor(Math.random() * 20)) // cria um numero aleatorio entre 0 e 19
console.log(Math.floor(Math.random() * 100)) // cria um numero aleatorio entre 0 e 99
console.log(Math.floor(Math.random() * 101)) // cria um numero aleatorio entre 0 e 100

/*o math.flow é para arredondar o numero com virgula para o inteiro mais proximo, e o math random*10 para passar de 0,45 para 4,5 por exemplo*/ 
